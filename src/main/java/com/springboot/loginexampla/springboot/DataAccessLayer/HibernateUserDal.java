package com.springboot.loginexampla.springboot.DataAccessLayer;

import com.springboot.loginexampla.springboot.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateUserDal implements IUserDal {
    private EntityManager entityManager;
    private Session session;

    @Autowired
    public HibernateUserDal(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.session = entityManager.unwrap(Session.class);
    }

    @Override
    @Transactional
    public List<User> getAll() {
        List<User> users = session.createQuery("from User ").getResultList();
        return users;
    }

    @Override
    @Transactional
    public User getById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void add(User user) {

    }

    @Override
    @Transactional
    public void update(User user) {

    }

    @Override
    @Transactional
    public void delete(User user) {

    }
}
