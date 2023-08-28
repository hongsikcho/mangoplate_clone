package com.my.mangoplatemini.dao;

import com.my.mangoplatemini.dto.MemberDTO;

public interface MemberInterface {
	
	// 회원가입 메서드
	
	void login(MemberDTO memberDTO);
	
	void createMember(MemberDTO member);
    // 회원 가입
	    
	void updateMember(MemberDTO member);
    // 회원 정보 수정		    
	
	void deleteMember(String id);
	// 회원 삭제
}
//삽입 : create
//수정 : update
//삭제 : delete
	
	
//보여줌 : show
//
