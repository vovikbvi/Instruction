package com.bogdevich.tec2.instruction.dataacess.filter;

public class InstrFilter extends AbstractFilter {

	private boolean fetchUserProfile;
	private boolean fetchInstrType;
	private boolean fetchLocation;

	public boolean isFetchUserProfile() {
		return fetchUserProfile;
	}

	public void setFetchUserProfile(boolean fetchUserProfile) {
		this.fetchUserProfile = fetchUserProfile;
	}

	public boolean isFetchInstrType() {
		return fetchInstrType;
	}

	public void setFetchInstrType(boolean fetchInstrType) {
		this.fetchInstrType = fetchInstrType;
	}

	public boolean isFetchLocation() {
		return fetchLocation;
	}

	public void setFetchLocation(boolean fetchLocation) {
		this.fetchLocation = fetchLocation;
	}

}
