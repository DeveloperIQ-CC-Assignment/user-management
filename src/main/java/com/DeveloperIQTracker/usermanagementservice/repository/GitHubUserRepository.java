package com.DeveloperIQTracker.usermanagementservice.repository;

import com.DeveloperIQTracker.usermanagementservice.model.GitHubUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubUserRepository extends MongoRepository<GitHubUser, String> {
}
