package com.java.String;

import java.util.Random;

public class GenerateSubString {

	public static void main(String[] args) {
       String captcha = "00010100";
		
		StringBuffer captchaBuffer = new StringBuffer();
		Random random = new Random();
		int index1 = (int) (random.nextFloat() * captcha.length());
		System.out.println("Random Index"+index1);
		while(captchaBuffer.length() < 5) {
			int index = (int) (random.nextFloat() * captcha.length());
			
			captchaBuffer.append(captcha.substring(index, index+1));
		}
		System.out.println(captchaBuffer.toString());
		
		
	}

}
