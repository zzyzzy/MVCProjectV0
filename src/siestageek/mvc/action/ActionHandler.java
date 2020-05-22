package siestageek.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 모든 mvc 핸들러 클래스의 견본
public interface ActionHandler {

    String execute(HttpServletRequest req,
                   HttpServletResponse res)
            throws ServletException, IOException;

}
