package com.epopcon.test;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution2{
	
	//볼링공 개수 N
	//볼링공 최대무게 M (1~M)
	
	static int N, M= 0;
	static int[] ball;
    static int answer = 0;

	
	public static  void main (String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        // 볼링공 배열
        ball = new int[N];
         
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < N; i++) {
        	ball[i] = Integer.parseInt(st.nextToken());
        }
        
        //(i, j)
        for(int i=0; i< N-1; i++) {
        	for(int j= i+1; j< N; j++) {
        		//두 사람이 서로 무게가 다른 볼링공을 고르기
        		if(ball[i] != ball[j])
        			answer += 1;
        	}
        }
        
      System.out.println(answer);  
        
	}
}
