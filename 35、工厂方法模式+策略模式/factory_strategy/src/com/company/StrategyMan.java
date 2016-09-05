package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ²ßÂÔµÇ¼Ç
 */
public enum StrategyMan {
	
	SteadyDeduction("com.company.SteadyDeduction"),
	FreeDeduction("com.company.FreeDeduction");
	
	String value = "";
	private StrategyMan(String _value){
		this.value = _value;
	}
	
	public String getValue(){
		return this.value;
	}
}
