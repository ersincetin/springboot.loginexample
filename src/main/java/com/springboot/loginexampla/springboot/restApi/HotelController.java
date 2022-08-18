package com.springboot.loginexampla.springboot.restApi;

import com.springboot.loginexampla.springboot.Business.IHotelService;
import com.springboot.loginexampla.springboot.Entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HotelController {
    private IHotelService hotelService;

    @Autowired
    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @RequestMapping(value = "/hotels")
    public List<Hotel> getHotels() {
        return this.hotelService.getAll();
    }

    @RequestMapping(value = "/hotel/{id}")
    public Hotel getHotel(@PathVariable int id) {
        return this.hotelService.getById(id);
    }
}
