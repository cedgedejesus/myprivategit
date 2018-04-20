package com.disney.ecommerce.modernizer.domain;

/**
 * This is the model class for HotelInput entity. it will be used to hold
 * parameters for /hotel: end point
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
public class HotelSearch {
	private Integer hotelCode;
	private String SalesChannel;
	private String market;
	private StayDate stayDate;
	private PartyMix partyMix;

	public Integer getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(Integer hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getSalesChannel() {
		return SalesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		SalesChannel = salesChannel;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public StayDate getStayDate() {
		return stayDate;
	}

	public void setStayDate(StayDate stayDate) {
		this.stayDate = stayDate;
	}

	public PartyMix getPartyMix() {
		return partyMix;
	}

	public void setPartyMix(PartyMix partyMix) {
		this.partyMix = partyMix;
	}

}
