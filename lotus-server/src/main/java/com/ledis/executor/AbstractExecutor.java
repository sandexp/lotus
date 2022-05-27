package com.ledis.executor;

import com.ledis.domain.*;

import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class AbstractExecutor {

	private Queue<ExecuteRequest> requests;

	private ThreadPoolExecutor executor;

	private Set<TaskDescription> taskDescriptionSet;

	private Set<ExecuteResponse> responses;

	public AbstractExecutor(){
		this.requests=new LinkedList<>();
		this.taskDescriptionSet=new LinkedHashSet<>();
		// todo 创建线程池
		this.responses=new LinkedHashSet<>();
	}

	public abstract ResultState parse(ExecuteRequest request) throws Exception;

	public abstract ResultState executeSync(ExecuteRequest request);

	public abstract ResultState executeAsync(ExecuteRequest request);

	public abstract ExecuteResult querySync(ExecuteRequest request);

	public abstract ExecuteResult queryAsync(ExecuteRequest request);

	public void addRequest(ExecuteRequest request){
		requests.offer(request);
	}

	public ExecuteRequest pollRequest(){
		return requests.poll();
	}
}
