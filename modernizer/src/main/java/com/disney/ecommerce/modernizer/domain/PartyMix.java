package com.disney.ecommerce.modernizer.domain;

import java.util.Date;
import java.util.List;

/**
 * This is the model class for Party Mix entity. it is part of the
 * HotelInput entity
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
public class PartyMix {
	private Integer numberOfAdults;
	private Integer numberOfChild;
	private Integer numberOfInfants;
	List<Date> dateOfBirthsChild;
	List<Date> dateOfBirthInfant;

	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public Integer getNumberOfChild() {
		return numberOfChild;
	}

	public void setNumberOfChild(Integer numberOfChild) {
		this.numberOfChild = numberOfChild;
	}

	public Integer getNumberOfInfants() {
		return numberOfInfants;
	}

	public void setNumberOfInfants(Integer numberOfInfants) {
		this.numberOfInfants = numberOfInfants;
	}

	public List<Date> getDateOfBirthsChild() {
		return dateOfBirthsChild;
	}

	public void setDateOfBirthsChild(List<Date> dateOfBirthsChild) {
		this.dateOfBirthsChild = dateOfBirthsChild;
	}

	public List<Date> getDateOfBirthInfant() {
		return dateOfBirthInfant;
	}

	public void setDateOfBirthInfant(List<Date> dateOfBirthInfant) {
		this.dateOfBirthInfant = dateOfBirthInfant;
	}

}
