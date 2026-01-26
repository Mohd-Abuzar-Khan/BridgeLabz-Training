package com.annotations.deprecated;

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        
        // This will show a warning
        api.oldFeature();
        
        // This is the recommended way
        api.newFeature();
    }
}
