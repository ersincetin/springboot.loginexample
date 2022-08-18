package com.springboot.loginexampla.springboot.Business;

import com.springboot.loginexampla.springboot.DataAccess.IHotelDal;
import com.springboot.loginexampla.springboot.Entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HotelManager implements IHotelService {
    private IHotelDal hotelDal;

    @Autowired
    public HotelManager(IHotelDal hotelDal) {
        this.hotelDal = hotelDal;
    }

    @Override
    @Transactional
    public void add(Hotel hotel) {
        this.hotelDal.add(hotel);
    }

    @Override
    @Transactional
    public void update(Hotel hotel) {
        this.hotelDal.update(hotel);
    }

    @Override
    @Transactional
    public void delete(Hotel hotel) {
        this.hotelDal.delete(hotel);
    }

    @Override
    @Transactional
    public Hotel getById(int index) {
        return this.hotelDal.getById(index);
    }

    @Override
    @Transactional
    public List<Hotel> getAll() {
        return this.hotelDal.getAll();
    }
}
