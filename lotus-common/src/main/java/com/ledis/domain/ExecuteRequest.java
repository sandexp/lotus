package com.ledis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class ExecuteRequest implements Serializable {

	private long requestId;

	private String serverHost;

	private int serverPort;

	private boolean isAsync;

	private String connection;

	private String sqlString;
}
