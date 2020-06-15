package com.douzone.gitbook.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.gitbook.vo.AlarmVo;
import com.douzone.gitbook.vo.UserVo;

@Repository
public class AlarmRepository {

	@Autowired
	private SqlSession sqlSession;

	public List<AlarmVo> findList(String id) {
		return sqlSession.selectList("alarm.findList", id);
	}

	public Boolean markRead(Map<String, Object> input) {
		return sqlSession.update("alarm.markRead", input) >= 1;
	}

	public AlarmVo findRecentAlarm(AlarmVo vo) {
		return sqlSession.selectOne("alarm.findRecentAlarm", vo);
	}
	
	public void addAlarm(AlarmVo vo) {
		sqlSession.insert("alarm.addAlarm", vo);
	}

	public UserVo findUserNoAndNickname(long paramNo) {
		return sqlSession.selectOne("alarm.findUserByNo", paramNo);
	}

	public UserVo getUserIdAndGroupTitle(Map<String, Long> numberMap) {
		return sqlSession.selectOne("alarm.findUserIdAndGroupTitleByNo", numberMap);
	}

}
