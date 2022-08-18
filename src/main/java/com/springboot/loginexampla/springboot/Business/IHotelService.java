package com.springboot.loginexampla.springboot.Business;

import com.springboot.loginexampla.springboot.Entities.Hotel;

import java.util.List;

public interface IHotelService {
    void add(Hotel hotel);

    void update(Hotel hotel);

    void delete(Hotel hotel);

    Hotel getById(int index);

    List<Hotel> getAll();
}
