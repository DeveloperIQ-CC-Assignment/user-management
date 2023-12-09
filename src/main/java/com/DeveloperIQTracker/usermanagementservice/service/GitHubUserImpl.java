package com.DeveloperIQTracker.usermanagementservice.service;

import com.DeveloperIQTracker.usermanagementservice.dto.GitHubUserDto;
import com.DeveloperIQTracker.usermanagementservice.repository.GitHubUserRepository;
import com.DeveloperIQTracker.usermanagementservice.service.external.GitHubExternalClient;
import lombok.AllArgsConstructor;
import com.DeveloperIQTracker.usermanagementservice.model.GitHubUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GitHubUserImpl implements  GitHubUserService{

    private final GitHubExternalClient githubExternalClient;
    private final GitHubUserRepository gitHubUserRepository;


    @Override
    public List<GitHubUser> getGitHubUsers() {
        List<GitHubUser> gitHubUsers = new ArrayList<>();

        List<GitHubUserDto> gitHubUserDtoList = this.githubExternalClient.getUserDetails();

        gitHubUserDtoList.forEach(gitHubUserDto -> {
            GitHubUser gitHubUser = this.generateGitHubUserObject(gitHubUserDto);
            gitHubUsers.add(gitHubUser);
        });

        this.gitHubUserRepository.saveAll(gitHubUsers);

        return gitHubUsers;
    }
    private GitHubUser generateGitHubUserObject(GitHubUserDto gitHubUserDto) {
        return GitHubUser.builder()
                .gitHubId(gitHubUserDto.getId())
                .login(gitHubUserDto.getLogin())
                .contributions(gitHubUserDto.getContributions())
                .type(gitHubUserDto.getType())
                .siteAdmin(gitHubUserDto.isSiteAdmin())
                .reposUrl(gitHubUserDto.getReposUrl())
                .nodeId(gitHubUserDto.getNodeId())
                .build();
    }
}

