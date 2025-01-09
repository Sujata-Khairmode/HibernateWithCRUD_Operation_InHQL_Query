package com.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="eventdetails")
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventId;
    private String eventName;
    private int eventDate;
    private String eventLocation;
    private String organizerName;
    private int totalSeats;
    private double eventBudget;
    
	public Event() {
		
	}
	
	
	public Event(int eventId, String eventName, int eventDate, String eventLocation, String organizerName,
			int totalSeats, double eventBudget) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventLocation = eventLocation;
		this.organizerName = organizerName;
		this.totalSeats = totalSeats;
		this.eventBudget = eventBudget;
	}


	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getEventDate() {
		return eventDate;
	}
	public void setEventDate(int eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public double getEventBudget() {
		return eventBudget;
	}
	public void setEventBudget(double eventBudget) {
		this.eventBudget = eventBudget;
	}


	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate
				+ ", eventLocation=" + eventLocation + ", organizerName=" + organizerName + ", totalSeats=" + totalSeats
				+ ", eventBudget=" + eventBudget + "]";
	}
	
    
    
    


}