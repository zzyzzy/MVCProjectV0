package siestageek.mvc.controller;

import siestageek.mvc.action.ActionHandler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MVCController extends HttpServlet {

    // 클라이언트의 요청을 분석해서
    // 그에 맞는 ActionHandler 클래스를 호출하고
    // 실행한 후 view를 출력함

    // 클라이언트의 요청이 get인 경우 호출되는 메서드
    // ~.do?변수명=값&변수명=값
    @Override
    protected void doGet(
            HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(req, res);
    }

    // 클라이언트의 요청이 post인 경우 호출되는 메서드
    // form 태그의 method가 post인 경우
    @Override
    protected void doPost(
            HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        processRequest(req, res);
    }

    // 클라이언트의 요청이 get이든 post든 간에
    // processRequest가 다 처리하도록 작성함
    private void processRequest(
            HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // 클라이언트의 요청분석
        // 요청 : http://127.0.0.1/board/list.do
        // getRequestURI() => /board/list.do
        // URI.lastIndexOf("/") => /list.do

        //String uri = req.getRequestURI();
        //String cmd = uri.substring(uri.lastIndexOf("/"));
        String cmd = req.getRequestURI();

        // 클라이언트의 요청과 연관있는
        // 핸들러 객체를 가져옴
        ActionHandler handler =
                        (ActionHandler)MVCInitController
                        .getCommandHandlerMap().get(cmd);

        // 핸들러를 실행하고
        // 그 결과를 출력할 뷰와 뷰 종류를 알아냄
        String viewPage = handler.execute(req, res);
        String checkView[] = viewPage.split("[|]");

        // 뷰의 종류에 따라 뷰를 처리함
        if (checkView[0].equals("1")) {
            RequestDispatcher rd = req.getRequestDispatcher(checkView[1]);
            rd.forward(req, res);
        } else if (checkView[0].equals("2")) {
            res.sendRedirect(checkView[1]);
        } // if

    } // processRequest

}
