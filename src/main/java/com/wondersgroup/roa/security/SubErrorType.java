/** 
 * Copyright (c) 2012-2015 Wonders Information Co.,Ltd. All Rights Reserved.
 * 5/F 1600 Nanjing RD(W), Shanghai 200040, P.R.C 
 *
 * This software is the confidential and proprietary information of Wonders Group.
 * (Public Service Division / Research & Development Center). You shall not disclose such
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with Wonders Group. 
 *
 * Distributable under GNU LGPL license by gun.org
 */
package com.wondersgroup.roa.security;

import java.util.EnumMap;

public enum SubErrorType {
	
	ISP_SERVICE_UNAVAILABLE, ISP_SERVICE_TIMEOUT,

	ISV_NOT_EXIST, ISV_INVALID_PERMISSION, ISV_MISSING_PARAMETER, ISV_INVALID_PARAMETE, ISV_PARAMETERS_MISMATCH;

	private static EnumMap<SubErrorType, String> errorKeyMap = new EnumMap<SubErrorType, String>(SubErrorType.class);

	static {
		errorKeyMap.put(SubErrorType.ISP_SERVICE_UNAVAILABLE, "isp.xxx-service-unavailable");
		errorKeyMap.put(SubErrorType.ISP_SERVICE_TIMEOUT, "isp.xxx-service-timeout");
		errorKeyMap.put(SubErrorType.ISV_NOT_EXIST, "isv.xxx-not-exist:invalid-yyy");
		errorKeyMap.put(SubErrorType.ISV_MISSING_PARAMETER, "isv.missing-parameter:xxx");
		errorKeyMap.put(SubErrorType.ISV_INVALID_PARAMETE, "isv.invalid-paramete:xxx");
		errorKeyMap.put(SubErrorType.ISV_INVALID_PERMISSION, "isv.invalid-permission");
		errorKeyMap.put(SubErrorType.ISV_PARAMETERS_MISMATCH, "isv.parameters-mismatch:xxx-and-yyy");
	}

	public String value() {
		return errorKeyMap.get(this);
	}
}
