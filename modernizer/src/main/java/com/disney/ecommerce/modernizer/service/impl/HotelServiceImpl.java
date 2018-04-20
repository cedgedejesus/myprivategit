package com.disney.ecommerce.modernizer.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.disney.ecommerce.modernizer.domain.*;
import com.disney.ecommerce.modernizer.service.IHotelService;

/**
* HotelService class
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-17 
*/
@Service
public class HotelServiceImpl implements IHotelService {
	private List<HotelSummary> list = new ArrayList<HotelSummary>();
	{
		list.add(new HotelSummary(1, "Y", null, "Hotel 1", "Open",
				"5 Star", new Date(), new Date(), "Tuesday", "switch hour",
				5, 2, 1));
		list.add(new HotelSummary(2, "Y", null, "Hotel 2", "Open",
				"5 Star", new Date(), new Date(), "Wednesday", "switch hour",
				5, 2, 1));
		list.add(new HotelSummary(3, "Y", null, "Hotel 3", "Open",
				"5 Star", new Date(), new Date(), "Thursday", "switch hour",
				5, 2, 1));		
	}
	
	
	public List<HotelSummary> getAllHotels(HotelSearch input) {
		return list;
	}
	
	public HotelSummary getHotelDetails(HotelSearch input) {
		return list.get(0);
	}

}
