package com.ledis.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static String[] getConstructorParameterNames(Class klass){
		int size = klass.getFields().length;
		String[] res = new String[size];
		Field[] fields = klass.getFields();
		for (int i = 0; i < size; i++) {
			res[i] = fields[i].getName();
		}
		return res;
	}

}
