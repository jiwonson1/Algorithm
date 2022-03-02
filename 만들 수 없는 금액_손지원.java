
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2{
	
	static int n= 0;
	static int[] coin;
   
	public static  void main (String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        coin = new int[n];
        
        //코인배열에 각 값들 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
        	coin[i] = Integer.parseInt(st.nextToken());
        }
        
        //정렬
        Arrays.sort(coin);
        int t = 1;
        
        for(int i =0; i< n; i++) {
        	// 만들 수 없는 금액 찾았을 때 반복 종료
        	if(t <coin[i])
        		break;
        	// 음.. 다시 * 확인
        	t += coin[i];
        }
        
        System.out.println(t);
        
    } 
}
