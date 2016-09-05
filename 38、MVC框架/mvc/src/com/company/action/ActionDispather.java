package com.company.action;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ActionDispather implements IActionDispather {
	//ÐèÒªÖ´ÐÐµÄAction
	private ActionManager actionManager = new ActionManager();
	
	//À¹½ØÆ÷Á´
	private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();
	
	public String actionInvoke(String actionName) {
		//Ç°ÖÃÀ¹½ØÆ÷
		return actionManager.execAction(actionName);
		//ºóÖÃÀ¹½ØÆ÷
	}

}
