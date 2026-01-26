package com.annotations.jsonfield;

public class JsonUser {
    @JsonField(name = "user_name")
    private String username;
    
    @JsonField(name = "user_email")
    private String email;
    
    private String password; // Not annotated, won't be serialized
    
    public JsonUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
