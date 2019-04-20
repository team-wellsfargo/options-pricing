package com.workshop.application.datamodel;

public class OptionPriceRequest {
	private double strikePrice;
	private double impliedVolatility;
	private String expireDate;
	private OptionType optionType;

	public OptionType getOptionType() {
		return optionType;
	}

	public void setOptionType(OptionType optionType) {
		this.optionType = optionType;
	}

	public double getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		this.strikePrice = strikePrice;
	}

	public double getImpliedVolatility() {
		return impliedVolatility;
	}

	public void setImpliedVolatility(double impliedVolatility) {
		this.impliedVolatility = impliedVolatility;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

}
