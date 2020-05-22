package siestageek.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JoinokHandler implements ActionHandler {

    @Override
    public String execute(
            HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String viewPage = "1|/WEB-INF/jsp/layout/layout.jsp";

        req.setAttribute("action", "../join/joinok.jsp");
        return viewPage;
    }

}
