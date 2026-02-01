package com.functionalinterface.markerinterface.backup;

public class Policy implements IBackup{
	private String policyId;
    private String details;

    public Policy(String policyId, String details) {
        this.policyId = policyId;
        this.details = details;
    }

    @Override
    public String toString() {
        return "PolicyDocument { id='" + policyId + "', details='" + details + "' }";
    }
}
