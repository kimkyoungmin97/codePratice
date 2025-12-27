package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//프로그래머스(오픈채팅방)

public class Open_chatRoom {
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = {};
        Map<String,String> room = making_room(); //채팅방 생성
        List<String[]> message = new ArrayList<>(); //메세지 목록 생성
        
        //채팅방 상태갱신
        for(int i = 0; i < record.length; ++i){
            String[] command = get_command(record[i]);
            executing_command(command, room, message);
        }
        answer = new String[message.size()]; 
    
        for(int i = 0; i < message.size(); ++i){
            message.get(i)[0] = room.get(message.get(i)[0]); //유저 아이디 -> 닉네임으로 치환
            if(message.get(i)[1].equals("Enter")){
                answer[i] = message.get(i)[0] + "님이 들어왔습니다.";
            }else{
                answer[i] = message.get(i)[0] + "님이 나갔습니다.";

            }
        }
        System.out.println(Arrays.toString(answer)); //테스트 출력
	}
	
	 //채팅방 생성
    private static Map<String,String> making_room() {
        Map<String,String> room = new HashMap<>();
        
        return room;
    }
    //한개의 명령을 타입,유저 아이디으로 나누기 
    private static String[] get_command(String str) {
        String[] command = str.split(" ");
        
        return command;
    }
    //명령 실행
    private static void executing_command(String[] arr, Map<String,String> map, List<String[]> list) {
        if(arr[0].equals("Enter")) { //입장
            map.put(arr[1],arr[2]);
            list.add(new String[] {arr[1],arr[0]});
        }else if(arr[0].equals("Leave")) { //퇴장
            list.add(new String[] {arr[1],arr[0]});
        }else { // 닉네임 변경
            map.put(arr[1],arr[2]);
        }  
    }

}
