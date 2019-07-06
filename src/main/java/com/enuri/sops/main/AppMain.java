package com.enuri.sops.main;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		//컨테이너 리소스를 불러온다
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
	}
}
