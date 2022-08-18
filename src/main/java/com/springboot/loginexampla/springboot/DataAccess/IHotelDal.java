package com.springboot.loginexampla.springboot.DataAccess;

import com.springboot.loginexampla.springboot.Entities.Hotel;

import java.util.List;

public interface IHotelDal {
    List<Hotel> getAll();

    Hotel getById(int id);

    void add(Hotel hotel);

    void update(Hotel hotel);

    void delete(Hotel hotel);
}
