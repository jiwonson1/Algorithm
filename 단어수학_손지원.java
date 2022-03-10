import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {
	
	//참고 사이트...https://kwoncorin.tistory.com/105
	
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//알파벳의 개수
		int [] alpha = new int[26];
		
		//단어의 개수
		int N = Integer.parseInt(st.nextToken());
		
		
		for(int i=0; i<N; i++) {
			
			//라인들에 있는 문자들
			String line = br.readLine();
			
			int size = line.length();
			
			//10의 문자들개수 곱하기
			int base = (int)Math.pow(10,  size-1);
			
			for(int y= 0; y<size; y++) {
				alpha[line.charAt(y) - 'A'] += base;
				base /= 10;
			}
			
		}
		
		Arrays.sort(alpha);
		
		int answer = 0;
		
		for(int x=25; x>17; x--) {
			answer += alpha[x] * (x - 16);
		}
		
		System.out.println(answer);
		
	}
}
