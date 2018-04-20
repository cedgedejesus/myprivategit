package com.disney.ecommerce.modernizer.domain;

import java.util.Date;

/**
 * This is the model class for Hotel entity.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
public class HotelSummary {
	private int hotelCode;
	private String eligibility;
	private String reasonIfNotEligible;
	private String hotelInformation;
	private String status;
	private String category;
	private Date checkInStartDate;
	private Date checkInEndDate;
	private String checkInDayOfWeek;
	private String bookTimeLimit;
	private Integer maxPartyMix;
	private Integer maxInfants;
	private Integer lengthOfStay;

	
	
	public HotelSummary(int hotelCode, String eligibility, String reasonIfNotEligible, String hotelInformation, String status,
			String category, Date checkInStartDate, Date checkInEndDate, String checkInDayOfWeek, String bookTimeLimit,
			Integer maxPartyMix, Integer maxInfants, Integer lengthOfStay) {
		super();
		this.hotelCode = hotelCode;
		this.eligibility = eligibility;
		this.reasonIfNotEligible = reasonIfNotEligible;
		this.hotelInformation = hotelInformation;
		this.status = status;
		this.category = category;
		this.checkInStartDate = checkInStartDate;
		this.checkInEndDate = checkInEndDate;
		this.checkInDayOfWeek = checkInDayOfWeek;
		this.bookTimeLimit = bookTimeLimit;
		this.maxPartyMix = maxPartyMix;
		this.maxInfants = maxInfants;
		this.lengthOfStay = lengthOfStay;
	}

	public int getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(int hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public String getReasonIfNotEligible() {
		return reasonIfNotEligible;
	}

	public void setReasonIfNotEligible(String reasonIfNotEligible) {
		this.reasonIfNotEligible = reasonIfNotEligible;
	}

	public String getHotelInformation() {
		return hotelInformation;
	}

	public void setHotelInformation(String hotelInformation) {
		this.hotelInformation = hotelInformation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCheckInStartDate() {
		return checkInStartDate;
	}

	public void setCheckInStartDate(Date checkInStartDate) {
		this.checkInStartDate = checkInStartDate;
	}

	public Date getCheckInEndDate() {
		return checkInEndDate;
	}

	public void setCheckInEndDate(Date checkInEndDate) {
		this.checkInEndDate = checkInEndDate;
	}

	public String getCheckInDayOfWeek() {
		return checkInDayOfWeek;
	}

	public void setCheckInDayOfWeek(String checkInDayOfWeek) {
		this.checkInDayOfWeek = checkInDayOfWeek;
	}

	public String getBookTimeLimit() {
		return bookTimeLimit;
	}

	public void setBookTimeLimit(String bookTimeLimit) {
		this.bookTimeLimit = bookTimeLimit;
	}

	public Integer getMaxPartyMix() {
		return maxPartyMix;
	}

	public void setMaxPartyMix(Integer maxPartyMix) {
		this.maxPartyMix = maxPartyMix;
	}

	public Integer getMaxInfants() {
		return maxInfants;
	}

	public void setMaxInfants(Integer maxInfants) {
		this.maxInfants = maxInfants;
	}

	public Integer getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

}
