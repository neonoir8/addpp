package com.akhmzv.addpp.service;

import com.akhmzv.addpp.entity.User;


import java.util.List;

public interface UserService {

    List<User> getAll();

    User save(User user);

    void delete(Long id);
}