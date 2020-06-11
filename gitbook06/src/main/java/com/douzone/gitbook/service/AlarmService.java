package com.douzone.gitbook.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.douzone.gitbook.repository.AlarmRepository;
import com.douzone.gitbook.vo.AlarmVo;

@Service
public class AlarmService {

	@Autowired
	private AlarmRepository alarmRepository;

	@Autowired
	private SimpMessagingTemplate webSocket;

	public void sendAlarm(String message, String id) {
		// "/topic/alarm/유저아이디" 로 해당 알림 메시지를 날린다.
		webSocket.convertAndSend("/topics/alarm/" + id, message); // react로 메세지 전송
	}

	public List<AlarmVo> getAlarmList(String id) {
		return alarmRepository.findList(id);
	}

	public Boolean markAsRead(Map<String, Object> input) {
		return alarmRepository.markRead(input);
	}

	public AlarmVo getRecentAlarm(AlarmVo vo) {
		return alarmRepository.findRecentAlarm(vo);
	}

	public void addAlarm(AlarmVo vo) {
		alarmRepository.addAlarm(vo);
	}
	

	//test용
//		public void test() {
//			//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 불리긴하는지 함 보자");
//			String message = "개세이야";
//			// "/topic/alarm/유저아이디" 로 해당 알림 메시지를 날린다.
//			webSocket.convertAndSend("/topics/alarm/test", message); //react로 메세지 전송
<<<<<<< HEAD
//			test
=======
//test
>>>>>>> fb08a33914eab8da05df1ab9db3cf30c52b8c99c
//		}

}
