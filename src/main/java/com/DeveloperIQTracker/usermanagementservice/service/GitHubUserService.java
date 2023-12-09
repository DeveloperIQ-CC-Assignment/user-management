package com.DeveloperIQTracker.usermanagementservice.service;

import com.DeveloperIQTracker.usermanagementservice.model.GitHubUser;

import java.util.List;

public interface GitHubUserService {
    List<GitHubUser> getGitHubUsers();
}
