package com.itguigu.zcw.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {
	// 校验邮箱格式
	public static boolean isEmail(String email) {
		if (null == email || "".equals(email)) {
			return false;
		}
		String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern p = Pattern.compile(regEx1);
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
