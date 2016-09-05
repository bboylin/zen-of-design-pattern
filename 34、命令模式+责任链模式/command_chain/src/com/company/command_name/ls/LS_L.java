package com.company.command_name.ls;

import com.company.CommandVO;
import com.company.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ls -l ÃüÁî
 */
public class LS_L extends AbstractLS {

	protected String echo(CommandVO vo) {
		return FileManager.ls_l(vo.formatData());
	}

	//l²ÎÊı
	protected String getOperateParam() {
		return super.L_PARAM;
	}

}
