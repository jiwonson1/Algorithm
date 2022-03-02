
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2{
	
	
	static int answer = 0;
    public static  void main (String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        //전부 0으로 ,1으로 바꾸는 경우
        int num0 = 0;
        int num1 = 1;
        
        //숫자로 바꿔주기
        int prev = s.charAt(0) - '0';  
        
        //첫번째 원소 처리
        if(prev == 0) {
        	num0 = 1;
        }else {
        	num1 =1;
        }
        
        //두번째 원소이후 처리
        for( int i=0; i< s.length(); i++) {
        	//두번째 원소 이후도 숫자로 바꿔주기
        	int ch = s.charAt(i) - '0';
        	//두번째 원소 이후 첫번째 숫자와다르면 if문 타기
        	if(ch != prev) {
        		if(ch == 0) {
        			// 다음 수에서 0으로 바뀌는 경우
        			num0++;
        		}else {
        			num1++;
        		}
        		prev = ch;
        	}
        }
        System.out.println(Math.min(num0, num1));
    }
    
}
