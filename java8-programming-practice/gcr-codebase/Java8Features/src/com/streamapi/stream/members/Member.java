package com.streamapi.stream.members;

import java.time.LocalDate;

public class Member {

	String name;
	LocalDate Expiry;

	public Member(String name, LocalDate expiryDate) {

		this.name = name;
		this.Expiry = expiryDate;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", ExpiryDate=" + Expiry + "]";
	}
}