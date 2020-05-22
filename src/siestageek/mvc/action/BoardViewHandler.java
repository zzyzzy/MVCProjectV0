package siestageek.mvc.action;

import siestageek.dao.BoardDAO;
import siestageek.vo.BoardVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardViewHandler implements ActionHandler {

    @Override
    public String execute(
            HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String viewPage = "1|/WEB-INF/jsp/layout/layout.jsp";

        // 상세조회할 게시물의 글번호를 가져옴
        String bno = req.getParameter("bno");

        BoardDAO bdao = new BoardDAO();
        // 글번호로 board 테이블을 조회하고 결과를 저장
        BoardVO bvo = bdao.selectOneBoard(bno);

        req.setAttribute("b", bvo);
        req.setAttribute("action", "../board/view.jsp");

        return viewPage;
    }

}
