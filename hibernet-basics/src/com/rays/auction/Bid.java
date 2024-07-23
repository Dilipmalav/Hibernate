package com.rays.auction;

public class Bid {

	private int id;
	private int amount;
	private String timeStemp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTimeStemp() {
		return timeStemp;
	}

	public void setTimeStemp(String timeStemp) {
		this.timeStemp = timeStemp;
	}
}
