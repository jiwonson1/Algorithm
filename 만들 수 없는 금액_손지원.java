
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
        
        //���ι迭�� �� ���� �Է�
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
        	coin[i] = Integer.parseInt(st.nextToken());
        }
        
        //����
        Arrays.sort(coin);
        int t = 1;
        
        for(int i =0; i< n; i++) {
        	// ���� �� ���� �ݾ� ã���� �� �ݺ� ����
        	if(t <coin[i])
        		break;
        	// ��.. �ٽ� * Ȯ��
        	t += coin[i];
        }
        
        System.out.println(t);
        
    } 
}
