package com.yurov.services;

import com.yurov.models.User;

import java.util.List;

public interface UsersService {

    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(Long id, User user);
    void delete(Long id);

}
