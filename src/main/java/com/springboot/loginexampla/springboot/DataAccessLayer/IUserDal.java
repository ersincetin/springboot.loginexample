package com.springboot.loginexampla.springboot.DataAccessLayer;

import com.springboot.loginexampla.springboot.Entities.User;

import java.util.List;

public interface IUserDal {
    List<User> getAll();

    User getById(int id);

    void add(User user);

    void update(User user);

    void delete(User user);
}
