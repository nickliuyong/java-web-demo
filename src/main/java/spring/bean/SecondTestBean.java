package spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiuYong on 2017/3/10 0010 15:58.
 */
public class SecondTestBean {

    private static final Logger LOG = LoggerFactory.getLogger(SecondTestBean.class);

    private FirstTestBean firstTestBean;

    public SecondTestBean() {
        if(getFirstTestBean() == null){
            LOG.info("SecondTestBean method -- firstTestBean is null...");
        }
        LOG.info("SecondTestBean 构造中...");
    }

    public void doCheck(){
        if(getFirstTestBean() == null){
            LOG.info("doCheck method -- firstTestBean is null...");
        }else{
            LOG.info("firstTestBean not empty...");
        }
    }

    public FirstTestBean getFirstTestBean() {
        return firstTestBean;
    }

    public void setFirstTestBean(FirstTestBean firstTestBean) {
        LOG.info("SecondTestBean setFirstTestBean method...");
        this.firstTestBean = firstTestBean;
    }
}
