package listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <p>
 *      listener 初始化上下文的一些参数，存储到上下文，以供系统使用
 * </p>
 *
 * @author LiuYong on 2017/3/8 0008 10:09.
 */
public class FirstDemoListener implements ServletContextListener {

    private static final Logger LOG = LoggerFactory.getLogger(FirstDemoListener.class);

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        LOG.info("1---------context {},",context);
        context.setAttribute("FirstDemoListener","FirstDemoListener");
        LOG.info("FirstDemoListener  上下文初始化...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LOG.info("FirstDemoListener  上下文销毁...");
    }
}
