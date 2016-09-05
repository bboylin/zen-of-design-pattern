package com.company.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Standin implements IStar {
	private IActor actor;
	
	//ÃÊ…Ì «À≠
	public Standin(IActor _actor){
		this.actor = _actor;
	}
	
	public void act(String context) {
		actor.playact(context);
	}

}
