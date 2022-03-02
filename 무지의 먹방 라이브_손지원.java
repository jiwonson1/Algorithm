package com.epopcon.test;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution2{
	
	
	
	public static  void main (String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int k = Integer.parseInt(st.nextToken()); //중단 시간
       int n = Integer.parseInt(st.nextToken()); //음식 갯수
        // 음식 배열
        int[] arr  = new int[n];
         
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i <n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int turn = (k+1) / n;
        int target = (k+1) % n;
        int addIndex = 0;
        
        for(int i=0; i< n; i++) {
        // 바퀴수 만큼 빼기
        	arr[i] -= turn;
        // 음수일 경우, 절대값 더해주기...
        	if(arr[i] < 0) {
        		addIndex += Math.abs(arr[i]);
        	}
        }
        // ... * 다시 해보기 *
        for(int i=0; i<n; i++) {
        	//양수의 경우
        	if(arr[i] >0) {
        		addIndex -= 1;
        	}
        
        }
        
	}
}
