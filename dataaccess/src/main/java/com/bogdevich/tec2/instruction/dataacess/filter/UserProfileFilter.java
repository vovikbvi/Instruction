package com.bogdevich.tec2.instruction.dataacess.filter;

public class UserProfileFilter extends AbstractFilter {
	private boolean fetchShop;

	public boolean isFetchShop() {
		return fetchShop;
	}

	public void setFetchShop(boolean fetchShop) {
		this.fetchShop = fetchShop;
	}

}
