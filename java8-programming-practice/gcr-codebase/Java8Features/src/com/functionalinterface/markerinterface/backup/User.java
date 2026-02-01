package com.functionalinterface.markerinterface.backup;

public class User implements IBackup{
	private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserProfile { name='" + name + "', email='" + email + "' }";
    }
}
