package com.ledis.utils;

import com.ledis.domain.ExecuteRequest;
import com.ledis.domain.ExecuteResponse;
import com.ledis.domain.ExecuteResult;
import com.ledis.domain.ResultState;

public class TransformUtil {

	private static volatile long requestId=0;

	/**
	 * 生成Request请求
	 * @param host 目标服务器主机名称
	 * @param port 目标服务器端口号
	 * @param conn 连接信息
	 * @param sqlString sql文本
	 * @param isAsync 是否异步发送
	 * @return 执行请求
	 */
	public static ExecuteRequest from(String host,
	                                  int port,
	                                  String conn,
	                                  String sqlString,
	                                  boolean isAsync){
		return new ExecuteRequest(requestId++,host,port,isAsync,conn,sqlString);
	}

	/**
	 * 生成服务端响应
	 * @param requestId 请求ID
	 * @param host 客户端主机号
	 * @param port 客户端端口号
	 * @param result 执行结果
	 * @param state 执行状态
	 * @return
	 */
	public static ExecuteResponse from(long requestId,
	                                   String host,
	                                   int port,
	                                   ExecuteResult result,
	                                   ResultState state){
		return new ExecuteResponse(requestId,host,port,result,state);
	}
}
