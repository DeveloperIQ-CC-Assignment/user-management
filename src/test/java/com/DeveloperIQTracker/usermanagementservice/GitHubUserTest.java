package com.DeveloperIQTracker.usermanagementservice;

import com.DeveloperIQTracker.usermanagementservice.model.GitHubUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GitHubUserTest {

    @InjectMocks
    private GitHubUser gitHubUser;

    @Test
    public void testGitHubUserModel() {
        // Test data
        String id = "123";
        String login = "john_doe";
        int gitHubId = 456;
        String nodeId = "abc123";
        String reposUrl = "https://github.com/john_doe/repos";
        String type = "user";
        boolean siteAdmin = false;
        int contributions = 10;

        // Set mock data on the model
        gitHubUser.setId(id);
        gitHubUser.setLogin(login);
        gitHubUser.setGitHubId(gitHubId);
        gitHubUser.setNodeId(nodeId);
        gitHubUser.setReposUrl(reposUrl);
        gitHubUser.setType(type);
        gitHubUser.setSiteAdmin(siteAdmin);
        gitHubUser.setContributions(contributions);

        // Verify the model's data
        assertEquals(id, gitHubUser.getId());
        assertEquals(login, gitHubUser.getLogin());
        assertEquals(gitHubId, gitHubUser.getGitHubId());
        assertEquals(nodeId, gitHubUser.getNodeId());
        assertEquals(reposUrl, gitHubUser.getReposUrl());
        assertEquals(type, gitHubUser.getType());
        assertEquals(siteAdmin, gitHubUser.isSiteAdmin());
        assertEquals(contributions, gitHubUser.getContributions());
    }
}
