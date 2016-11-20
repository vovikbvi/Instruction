package com.bogdevich.tec2.instruction.dataacess.filter;

public class ShopFilter extends AbstractFilter {
	
	private boolean fetchCompany;

	public boolean isFetchCompany() {
		return fetchCompany;
	}

	public void setFetchCompany(boolean fetchCompany) {
		this.fetchCompany = fetchCompany;
	}

}
