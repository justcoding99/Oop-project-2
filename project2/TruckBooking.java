/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Date;

/**
 *
 * @author meltem koc
 */
public class TruckBooking {
    private Date startDate;
	private Date endDate;
	private Truck truck;
	private Person person;

	public TruckBooking() {
		// TODO Auto-generated constructor stub
	}

	public TruckBooking(Date startDate, Date endDate, Truck truck, Person person) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.truck = truck;
		this.person = person;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Truck getTruck() {
		return truck;
	}

	public Person getPerson() {
		return person;
	}
    
}
