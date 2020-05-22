package siestageek.service;

import siestageek.dao.MemberDAO;
import siestageek.vo.MemberVO;

public class MemberService {

    private MemberDAO mdao = null;

    public MemberService() {
        mdao = new MemberDAO();
    }

    // 새로운 회원을 테이블에 저장함
    // jsp액션태그를 사용할때 처럼 set/get 접두사는 붙이지 않음
    public String newMember(MemberVO m) {
        String result = "회원가입 실패!!";

        if (mdao.insertMember(m))
            result = "회원가입 성공!!";

        System.out.println(result);  // 가입여부 확인용

        return result;
    }

}
