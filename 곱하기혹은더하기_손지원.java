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
		
		//ù��° ���ڸ� ���ڷ� ������ ���� ����
		answer = S.charAt(0) - '0';
		
		for(int i=1; i < S.length(); i++) {
			int compare = S.charAt(i) - '0';
			
			//���ϱ� ���ϱ� �� 0�϶��� 1�϶��� �����ϰ�� ���ϱ⸦ �ؾ� ���� Ŀ���Ƿ�
			// charAt(0)�� ù��°���ڰ� 0,1�� ���� +�� ����
			if(compare <=1 || answer <=1) {
				answer += compare;
			} else {
				answer *= compare;
			}
		}
		System.out.println(answer);
	}
};