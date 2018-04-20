package com.disney.ecommerce.modernizer.service;

import java.util.List;

import com.disney.ecommerce.modernizer.domain.*;

/**
* IHotelService interface
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-17 
*/
public interface IHotelService {
	public List<HotelSummary> getAllHotels(HotelSearch input);
	public HotelSummary getHotelDetails(HotelSearch input);
}
