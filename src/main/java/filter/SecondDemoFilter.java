package filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * <p>
 *      Filter主要用于对request、response进行处理
 * </p>
 *
 * @author LiuYong on 2017/3/8 0008 10:34.
 */
public class SecondDemoFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(SecondDemoFilter.class);


    public void init(FilterConfig filterConfig) throws ServletException {
        Enumeration<String> enumeration = filterConfig.getInitParameterNames();
        while(enumeration.hasMoreElements()){
            LOG.info("SecondDemoFilter 初始化参数  key={}",enumeration.nextElement());
        }
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("SecondDemoFilter doFilter...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        LOG.info("SecondDemoFilter destroy...");
    }
}
