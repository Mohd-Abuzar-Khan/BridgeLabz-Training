package com.functionalinterface.markerinterface.backup;

public class Cache {
	private String cacheData;

    public Cache(String cacheData) {
        this.cacheData = cacheData;
    }

    @Override
    public String toString() {
        return "TemporaryCache { data='" + cacheData + "' }";
    }
}
