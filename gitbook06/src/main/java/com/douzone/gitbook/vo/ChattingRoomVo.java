package com.douzone.gitbook.vo;

public class ChattingRoomVo {
	private Long no; 
	private String title; 
	private String grant;
	private Long userNo;
		
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrant() {
		return grant;
	}
	public void setGrant(String grant) {
		this.grant = grant;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	@Override
	public String toString() {
		return "ChattingRoomVo [no=" + no + ", title=" + title + ", grant=" + grant + ", userNo=" + userNo + "]";
	} 
	
	
	
	
}
