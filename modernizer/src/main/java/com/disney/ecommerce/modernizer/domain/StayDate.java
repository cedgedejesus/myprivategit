package com.disney.ecommerce.modernizer.domain;

import java.util.Date;

/**
 * This is the model class for StayDate entity. It is a part of HotelInput
 * entity.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
public class StayDate {
	private Date checkIn;
	private Date checkOut;

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

}
