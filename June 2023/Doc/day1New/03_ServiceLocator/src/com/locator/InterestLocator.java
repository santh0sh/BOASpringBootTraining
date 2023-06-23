package com.locator;

import java.util.HashMap;

import com.factory.InterestFactory;
import com.model.InterestCalculator;

public class InterestLocator {
	private static HashMap<String, InterestCalculator> objects=new HashMap<String, InterestCalculator>();
	static{
		objects.put("s", InterestFactory.create('s'));
		objects.put("f", InterestFactory.create('f'));
	}
	public static InterestCalculator lookup(String s){
		return objects.get(s);
	}
}
