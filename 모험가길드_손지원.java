import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {

	static int N;
	static int[] arr;
	static int group = 0;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 총 모험가 수
		N = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 모험가 공포도가 들어갈 배열
		arr = new int[N];
		for(int i=0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬해준다.
		// 공포도가 가장 낮은 모험가부터 하나씩 확인하여 그룹에 포함될 모험가의 수를 계산
		Arrays.sort(arr);
		
		// 현재 그룹에 포함된 모험가의 수 >= 현재 확인하는 공포도 조건을 만족하면 그룹으로 설정
		
		int member = 0;
		for(int i =0; i < N; i++) {
			// for문이 돌 때마다 멤버1명 추가
			member++;
			// 현재 멤버의 수가 현재 공포도 이상이라면 그룹생성 
			if(member >= arr[i]) {
				group++;
				member = 0;
			}
		}
		System.out.println(group);
	}

}
