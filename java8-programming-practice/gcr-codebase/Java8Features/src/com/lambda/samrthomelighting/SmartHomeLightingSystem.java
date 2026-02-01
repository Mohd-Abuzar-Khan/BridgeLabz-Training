package com.lamda.samrthomelighting;

public class SmartHomeLightingSystem {

    public static void main(String[] args) {

        SmartLight light = new SmartLight();

        Action motionTrigger = () ->
                System.out.println("Motion detected → Lights ON at 80% brightness");

        Action nightTimeTrigger = () ->
                System.out.println("It's night → Warm dim lights activated");

        Action voiceCommandTrigger = () ->
                System.out.println("Voice command received → Party mode lights ON 🎉");

        // Execute behaviors dynamically
        light.activate(motionTrigger);
        light.activate(nightTimeTrigger);
        light.activate(voiceCommandTrigger);
    }
}
