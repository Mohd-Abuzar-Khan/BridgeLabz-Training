package com.functionalinterface.markerinterface.datatagging;

public class Service {
	static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("[ENCRYPTED] " + obj);
        } else {
            System.out.println("[PLAIN]     " + obj);
        }
    }

}
