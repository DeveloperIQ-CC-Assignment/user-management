package com.DeveloperIQTracker.usermanagementservice.controller;

import com.DeveloperIQTracker.usermanagementservice.model.GitHubUser;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DeveloperIQTracker.usermanagementservice.service.GitHubUserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/git-hub")
public class UserController {

    private GitHubUserService gitHubUserService;

    @GetMapping("/users")
    public ResponseEntity<List<GitHubUser>> getGitHubUsers() {
        return ResponseEntity.ok(this.gitHubUserService.getGitHubUsers());
    }

    @GetMapping("/users/get-all")
    public ResponseEntity<List<GitHubUser>> getAllUsers() {
        return ResponseEntity.ok(this.gitHubUserService.getAllUsers());
    }
}



