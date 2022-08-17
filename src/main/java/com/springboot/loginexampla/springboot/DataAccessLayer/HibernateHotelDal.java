package com.springboot.loginexampla.springboot.DataAccessLayer;

import com.springboot.loginexampla.springboot.Entities.Hotel;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class HibernateHotelDal implements IHotelDal{
    private EntityManager entityManager;
    private Session session;

    @Autowired
    public HibernateHotelDal(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.session = entityManager.unwrap(Session.class);
    }

    @Override
    @Transactional
    public List<Hotel> getAll() {
        List<Hotel> hotels = session.createQuery("from Hotel").getResultList();
        return hotels;
    }

    @Override
    @Transactional
    public Hotel getById(int id) {
        return null;
    }

    @Override
    @Transactional
    public void add(Hotel hotel) {

    }

    @Override
    @Transactional
    public void update(Hotel hotel) {

    }

    @Override
    @Transactional
    public void delete(Hotel hotel) {

    }
}
