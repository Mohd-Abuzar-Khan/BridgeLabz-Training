package com.functionalinterface.markerinterface.backup;

public class Backup {
    public static void main(String[] args) {

        Object[] items = {
            new User("John", "john@mail.com"),
            new Policy("POL-101", "Life Insurance"),
            new Cache("session_abc123")   // no marker
        };

        for (Object item : items) {
            BackupProgress.processBackup(item);
        }
    }
}