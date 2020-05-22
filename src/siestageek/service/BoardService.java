package siestageek.service;

import siestageek.dao.BoardDAO;
import siestageek.vo.BoardVO;

import java.util.ArrayList;

// 액션태그에 사용할 자바빈즈 클래스
public class BoardService {

    private BoardDAO bdao;
    private BoardVO bd;

    public BoardService() {
        bdao = new BoardDAO();
    }

    public void setBd(BoardVO bd) {
        this.bd = bd;
    }

    public String getNewBoard() {
        String result = "데이터 입력 실패!";

        if (bdao.insertBoard(bd))
            result = "데이터 입력 성공!!";

        System.out.println(result);
        // result 변수 값을 WAS 콘솔에 로그형태로 출력

        return result;
    }

    public ArrayList<BoardVO> getShowBoard() {
        return bdao.selectBoard();
    }

}
