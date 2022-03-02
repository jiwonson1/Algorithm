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
       int k = Integer.parseInt(st.nextToken()); //�ߴ� �ð�
       int n = Integer.parseInt(st.nextToken()); //���� ����
        // ���� �迭
        int[] arr  = new int[n];
         
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i <n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int turn = (k+1) / n;
        int target = (k+1) % n;
        int addIndex = 0;
        
        for(int i=0; i< n; i++) {
        // ������ ��ŭ ����
        	arr[i] -= turn;
        // ������ ���, ���밪 �����ֱ�...
        	if(arr[i] < 0) {
        		addIndex += Math.abs(arr[i]);
        	}
        }
        // ... * �ٽ� �غ��� *
        for(int i=0; i<n; i++) {
        	//����� ���
        	if(arr[i] >0) {
        		addIndex -= 1;
        	}
        
        }
        
	}
}
