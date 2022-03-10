import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//동전의 개수
		int n = Integer.parseInt(st.nextToken());
		
		//만들어야 하는 가치의 합
		int k = Integer.parseInt(st.nextToken());
		
		//몇개의 동전이 필요할지
		int cnt = 0;
		
		//동전들의 가치 배열
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		//가장 높은 가치의 동전부터 조회
		for(int i=n-1; i>=0; i--) {
			//가치가 k보다 작을 경우,
			if(a[i]<= k) {
				//나눈 값이 해당 동전의 개수가 되고
				cnt += k/a[i];
				// 나머지를 다시 k로 대입하면 된다.
				// 나머지는 다음 동전이 계속 대체되며 세어짐
				k = k % a[i];
			}
		}
		
		System.out.println(cnt);
		
		br.close();
		
	}
}
