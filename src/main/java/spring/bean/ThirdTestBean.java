package spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiuYong on 2017/3/15 0015 17:05.
 */
public class ThirdTestBean {

    private static final Logger LOG = LoggerFactory.getLogger(ThirdTestBean.class);

    public ThirdTestBean(){
        LOG.info("ThirdTestBean 构造中...");
    }

}
