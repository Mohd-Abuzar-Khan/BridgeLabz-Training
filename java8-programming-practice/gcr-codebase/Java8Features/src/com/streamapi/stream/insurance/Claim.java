package com.streamapi.stream.insurance;

public class Claim {

	String type;
	int amount;

	public Claim(String type, int amount) {
		this.type = type;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Claim [type=" + type + ", amount=" + amount + "]";
	}

}