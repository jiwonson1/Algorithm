package com.epopcon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example {

	static String S;
	static int answer;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = br.readLine();
		
		//첫번째 문자를 숫자로 변경한 값을 대입
		answer = S.charAt(0) - '0';
		
		for(int i=1; i < S.length(); i++) {
			int compare = S.charAt(i) - '0';
			
			//더하기 곱하기 중 0일때와 1일때를 제외하고는 곱하기를 해야 값이 커지므로
			// charAt(0)과 첫번째문자가 0,1일 때만 +를 수행
			if(compare <=1 || answer <=1) {
				answer += compare;
			} else {
				answer *= compare;
			}
		}
		System.out.println(answer);
	}
};