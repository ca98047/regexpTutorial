package com.enuri.sops.util;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.enuri.sops.AbstractTest;


public class RegExpTest extends AbstractTest{
	
	@Autowired RegExp regexp;
	@Override
	public void test() {
		
		// TODO Auto-generated method stub
		assertThat(regexp.getMatchStr("숫자0342찾기", "(\\d+)"), is("342"));
		
		
	}

}
