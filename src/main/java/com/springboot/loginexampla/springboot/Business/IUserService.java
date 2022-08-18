package com.springboot.loginexampla.springboot.Business;

import com.springboot.loginexampla.springboot.Entities.User;

import java.util.List;

public interface IUserService {
    void add(User user);

    void update(User user);

    void delete(User user);

    User getById(int index);

    List<User> getAll();
}
