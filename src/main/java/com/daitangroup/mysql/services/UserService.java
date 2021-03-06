package com.daitangroup.mysql.services;

import com.daitangroup.mysql.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    User getUser(Integer id);

    List<User> getAllUsers();

    User getUserByName(String name);
}
