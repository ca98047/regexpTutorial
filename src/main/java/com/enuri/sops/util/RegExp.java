package com.enuri.sops.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Repository;


@Repository
public class RegExp {
	
	public String getMatchStr(String inputStr, String regExpPatten) {
		String resultData = "";
		Pattern pt = Pattern.compile(regExpPatten);
		Matcher mc = pt.matcher(inputStr);
		
		if (mc.find()) {
			resultData = mc.group(1);
		}

		return resultData;
	}
	
}