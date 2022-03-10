import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test {
	
    public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//회의 개수
		int N = Integer.parseInt(br.readLine());
		
		// time[][0] 시작시간
		// time[][1] 종료시간
		
		int[][] time = new int[N][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//각 회의 시작,끝 시간 배열
		for(int i=0; i<N; i++) {
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//끝나는 시간으로 정렬하기 위해 Compare 재정의
		// *Comparator<클래스타입>클래스명 
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				//종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야함
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[2];
			}
			
		});
		
		int count = 0;
		int prev_end_time = 0;
		
		for(int i=0; i<N; i++) {
			
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신 
			if(prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
			
		}
		System.out.println(count);
		
	}
}
