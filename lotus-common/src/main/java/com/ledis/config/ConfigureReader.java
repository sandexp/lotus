package com.ledis.config;

public class ConfigureReader {
	private static ConfigureReader ourInstance = new ConfigureReader();

	public static ConfigureReader getInstance() {
		return ourInstance;
	}

	private ConfigureReader() {
	}
}
