package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date end;
	
	private Vehicle vehicle;
	private Invoice Invoice;
	
	public CarRental() {
		
	}
	public CarRental(Date start, Date end, Vehicle vehicle) {
		this.start = start;
		this.end = end;
		this.vehicle = vehicle;
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Invoice getInvoice() {
		return Invoice;
	}
	public void setInvoice(Invoice invoice) {
		Invoice = invoice;
	}
	
	
}
