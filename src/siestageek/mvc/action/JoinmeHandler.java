package siestageek.mvc.action;

import siestageek.service.MemberService;
import siestageek.vo.MemberVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JoinmeHandler implements ActionHandler {

    @Override
    public String execute(
            HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String viewPage = "1|/WEB-INF/jsp/layout/layout.jsp";

        if (req.getMethod().equalsIgnoreCase("post")) {

            req.setCharacterEncoding("utf-8");

            String name = req.getParameter("name");

            String jumin = req.getParameter("jumin1") + "-"
                           + req.getParameter("jumin2");

            String userid = req.getParameter("uid");
            String passwd = req.getParameter("pwd");

            String zipcode = req.getParameter("zip1") + "-"
                           + req.getParameter("zip2");

            String addr1 = req.getParameter("addr1");
            String addr2 = req.getParameter("addr2");

            String email = req.getParameter("email1") + "@"
                           + req.getParameter("email2");

            String mobile = req.getParameter("hp1") + "-"
                           + req.getParameter("hp2") + "-"
                           + req.getParameter("hp3");

            MemberVO m = new MemberVO(null,
               name,jumin,userid,passwd,zipcode,addr1,
                    addr2,email,mobile, null );

            MemberService msrv = new MemberService();
            msrv.newMember(m);

            viewPage = "2|/join/joinok.do";
        } else {
            req.setAttribute("action", "../join/joinme.jsp");
        }

        return viewPage;
    }

}
