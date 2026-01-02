package com.inheritance.singleinheritance.smarthomedevice;

public class Device {
 String deviceId;
 String status;

 // Constructor
 Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}
