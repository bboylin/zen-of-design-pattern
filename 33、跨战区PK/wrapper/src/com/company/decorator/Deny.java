package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Deny extends Decorator {
	
	public Deny(IStar _star){
		super(_star);
	}
	
	@Override
	public void act(){
		super.act();
		System.out.println("≈≈—›∫Û£∫∞Ÿ∞„µ÷¿µ£¨À¿≤ª≥–»œ");
	}
}
