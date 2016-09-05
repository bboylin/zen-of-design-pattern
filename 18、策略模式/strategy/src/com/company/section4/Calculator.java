package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Calculator {
	//¼Ó·ûºÅ
	private final static String ADD_SYMBOL = "+";
	//¼õ·ûºÅ
	private final static String SUB_SYMBOL = "-";
	
	public int exec(int a,int b,String symbol){
		return symbol.equals(ADD_SYMBOL)?a+b:a-b;
	}
	
}
