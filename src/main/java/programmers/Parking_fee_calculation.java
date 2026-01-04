package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//프로그래머스(주차요금 계산)
//ToDoList
//1.records를 바탕으로 차량번호별 주차시간 구하기(출차기록이 없다면 23:59분 출차로 간주)
//1-1. records의 시각,차량번호,내역은 하나의 공백으로 구분
//2.fees를 기준으로 차량번호별 주차요금 구하기
//2-1. 누적 주차시간이 기본시간 이하라면, 기본요금 청구
//2-2. 누적 주차시간이 기본시간을 초과하면, 기본요금 + 초과한시간에 대한 단위시간마다 단위요금 청구
//2-3. 초과한 시간이 단위시간으로 나누어 떨어지지 않으면, 올림
public class Parking_fee_calculation {
	
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600};
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN",
				"19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		getTime(records);
	}
    private static void getTime(String[] records) {
        Map<String,String[]> map = new HashMap<>(); //key:차량번호,value: Map<입차or출차,시간>
        
        for(int i = 0; i < records.length; ++i) {
            //기록 쪼개기 arr[0]: 시간, arr[1]: 차량번호, arr[2]: 입차OR출차
            String[] arr = records[i].split(" ");
            System.out.println(Arrays.toString(arr)); //테스트
            if(arr[2].equals("IN")) {//입차일 시(오늘 첫입차인지 아닌지 구분해야함)
                map.put(arr[1], map.getOrDefault(arr[1],new String[] {arr[2], arr[0]}));//첫 입차시
                System.out.println(arr[1]+": " + Arrays.toString(map.get(arr[1])));//테스트
                
            }else{//출차일 시
                map.get(arr[1]);
            }
        }
        System.out.println("기록: "+map);
    }

}
