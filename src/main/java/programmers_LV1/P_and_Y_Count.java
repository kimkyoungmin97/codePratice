package programmers_LV1;

public class P_and_Y_Count {
	
	public static void main(String[] args) {
		String s ="pPoooyY";
		boolean answer = true;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i =0; i < s.length(); ++i) {
            char temp = s.charAt(i);
            if(temp == 'p' || temp == 'P'){
                cnt1++;
            }
            if(temp == 'y' || temp == 'Y') {
                cnt2++;
            }
        }
        if(cnt1 == cnt2) {
            answer = true;
        }else{
            answer = false;
        }
        System.out.println(answer);
	}

}
