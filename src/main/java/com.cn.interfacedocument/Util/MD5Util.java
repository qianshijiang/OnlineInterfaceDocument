package com.cn.interfacedocument.Util;

import java.security.MessageDigest;

/**
 * @author qsj
 * @desc Md5生成
 * @date 2015年9月7日 下午7:07:21
 */
public class MD5Util {
	
	/***
	 * MD5加密 生成32位md5码
	 * @param inStr 待加密字符串
	 * @return 返回32位md5码
	 */
	public static String md5Encode(String inStr) throws Exception {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}

		byte[] byteArray = inStr.getBytes("UTF-8");
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString().toUpperCase();
	}

	// 可逆的加密算法
	public static String kLCode(String inStr) {
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;
	}

	// 加密后解密
	public static String jMCode(String inStr) {
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String k = new String(a);
		return k;
	}

	// 测试主函数
	public static void main(String args[]) throws Exception{
		//String s = RandomString.getRandomString(32);
		String s = "20";
		System.out.println("原始：" + s);
		System.out.println("MD5后：" + MD5Util.md5Encode(s));
		System.out.println("MD5后再加密：" + kLCode(s));
		System.out.println("解密为MD5后的：" + jMCode(s));
	}

}
