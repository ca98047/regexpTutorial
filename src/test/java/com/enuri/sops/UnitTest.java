package com.enuri.sops;

import org.json.JSONObject;
import org.junit.Test;

public class UnitTest {

	@Test
	public void test(){
		String str = "{\"page\":1,\"pageSize\":5,\"searchEDT\":\"2019-07-04\",\"searchFilter\":\"\",\"searchSDT\":\"2019-06-04\",\"searchStatus\":\"\",\"shopGroupCode\":9}";
		System.out.println(new JSONObject("{\"page\":1,\"pageSize\":5,\"searchEDT\":\"2019-07-04\",\"searchFilter\":\"\",\"searchSDT\":\"2019-06-04\",\"searchStatus\":\"\",\"shopGroupCode\":9}").toString());
		
		System.out.println(str);
	}
}
