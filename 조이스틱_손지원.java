import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {
		
	public int solution(String name) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0; //조이스틱을 움직인 횟수
		int len = name.length(); // 입력받은 name의 길이
		int directionCount = len -1; //이동방향의 최댓값 (좌우로 쭉 이동했을 시 나오는 값)
		
		for(int i=0; i<name.length(); i++) {
			// 현재 문자가 초기값인 'A'가 아닐 시 상하로 움직임 중에 가장 적게 움직이는 값 선택
			// * +1은 A,Z,X ... 역순으로 세기 때문에 한번 더 더해줌 *
			if(name.charAt(i) != 'A')
			answer += Math.min(name.charAt(i) - 'A',  'Z' -name.charAt(i) + 1);
			
			//현재 문자의 다음 문자가 'A'인지 확인하기 위해 다음 인덱스 저장하는 프로퍼티 선언
			int nextIndex = i+1;
			
			//다음 문자가 A라면 nextIndex플러스 해주며 어디까지A인지 찾기
			while(nextIndex < len && name.charAt(nextIndex) == 'A') 
			nextIndex ++;
		
			//이동방향 최솟값
			//i+i 연속된 A문자열이 시작하기 전까지 갔다가 되돌아옴 
			//이곳 헷갈림..! 다시보기 
			directionCount = Math.min(directionCount, i + i + len - nextIndex);
		
		}
		answer += directionCount;
		return answer;
		
		/* i) 조이스틱 상하로 움직이는 횟수
		 * 아스키 코드 값 A = 65
		 * 아스키 코드 값 - 65 (A=0 ... Z=25)
		 *  
		 * ii) 조이스틱 좌우로 움직이는 횟수 
		 * => 주어진 알파벳 이름 문자열의 길이 -1
		 *  
		 * ex) ABAABA
		 * 한방향으로 스캔하면 7
		 * 오른쪽 한번 이동 후 왼쪽 두번이동
		 * 
		 * */
		
	}
}
