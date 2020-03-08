package com.learning.coronavirustracker.models;

public class LocationStats {

	private String state;
	private String country;
	private int totalCasesCount;
	private int differenceFromPreviousDay;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public int getTotalCasesCount() {
		return totalCasesCount;
	}
	public void setTotalCasesCount(int totalCasesCount) {
		this.totalCasesCount = totalCasesCount;
	}
	
	
	public int getDifferenceFromPreviousDay() {
		return differenceFromPreviousDay;
	}
	public void setDifferenceFromPreviousDay(int differenceFromPreviousDay) {
		this.differenceFromPreviousDay = differenceFromPreviousDay;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", totalCasesCount=" + totalCasesCount
				+ ", differenceFromPreviousDay=" + differenceFromPreviousDay + "]";
	}
	
	
	
	
	
}
