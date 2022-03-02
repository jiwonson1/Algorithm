
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
        
        //���� 0���� ,1���� �ٲٴ� ���
        int num0 = 0;
        int num1 = 1;
        
        //���ڷ� �ٲ��ֱ�
        int prev = s.charAt(0) - '0';  
        
        //ù��° ���� ó��
        if(prev == 0) {
        	num0 = 1;
        }else {
        	num1 =1;
        }
        
        //�ι�° �������� ó��
        for( int i=0; i< s.length(); i++) {
        	//�ι�° ���� ���ĵ� ���ڷ� �ٲ��ֱ�
        	int ch = s.charAt(i) - '0';
        	//�ι�° ���� ���� ù��° ���ڿʹٸ��� if�� Ÿ��
        	if(ch != prev) {
        		if(ch == 0) {
        			// ���� ������ 0���� �ٲ�� ���
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
