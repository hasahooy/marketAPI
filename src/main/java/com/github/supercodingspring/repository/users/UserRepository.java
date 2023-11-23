package com.github.supercodingspring.repository.users;

public interface UserRepository {
    com.github.supercodingspring.repository.users.UserEntity findUserById(Integer userId);
}