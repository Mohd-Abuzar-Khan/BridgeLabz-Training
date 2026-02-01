package com.functionalinterface.markerinterface.backup;

public class BackupProgress {
	 static void processBackup(Object obj) {
	        if (obj instanceof IBackup) {
	            System.out.println("[BACKUP]  Backed up -> " + obj);
	        } else {
	            System.out.println("[SKIPPED] Not eligible -> " + obj);
	        }
	    }

}
