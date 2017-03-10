package servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *      用于对请求进行处理,实际业务场景处理
 * </p>
 *
 * @author LiuYong on 2017/3/8 0008 10:51.
 */
public class SecondDemoServlet extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(SecondDemoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        LOG.info("SecondDemoServlet doGet...");
        LOG.info("second address {}",this);
        resp.getWriter().write("hello i am SecondDemoServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
