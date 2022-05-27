package com.ledis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class ExecuteResponse implements Serializable {

	private long requestId;

	private String clientHost;

	private int clientPort;

	private ExecuteResult result;

	private ResultState state;
}
