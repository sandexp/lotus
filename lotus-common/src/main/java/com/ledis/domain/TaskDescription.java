package com.ledis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDescription {

	private long taskId;

	private long requestId;

	private long taskStartTimeOnServer;

	private long taskEndTimeOnServer;

	private long taskStartTimeOnClient;

	private long taskEndTimeOnClient;

	private int retryTimes;

	private ResultState state;

	private String connection;

	private String sqlString;
}
