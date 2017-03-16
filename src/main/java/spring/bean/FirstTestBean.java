package spring.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * @author LiuYong on 2017/3/10 0010 15:58.
 */
public class FirstTestBean{

    private SecondTestBean secondTestBean;

    private static final Logger LOG = LoggerFactory.getLogger(FirstTestBean.class);

    public FirstTestBean() {
        if(getSecondTestBean() == null){
            LOG.info("FirstTestBean method -- secondTestBean is null...");
        }
        LOG.info("FirstTestBean 构造中...");
    }
    @PostConstruct
    public void postConstruct(){
        LOG.info("FirstTestBean postConstruct ...");
    }


    public void doCheck(){
        if(getSecondTestBean() == null){
            LOG.info("doCheck method -- secondTestBean is null...");
        }else{
            LOG.info("secondTestBean not empty...");
        }
    }

    public void init(){
        LOG.info("FirstTestBean init ...");
    }

    public void testAop(){
        LOG.info("testAop method ...");
    }


    public SecondTestBean getSecondTestBean() {
        return secondTestBean;
    }

    public void setSecondTestBean(SecondTestBean secondTestBean) {
        LOG.info("FirstTestBean setSecondTestBean method...");
        this.secondTestBean = secondTestBean;
    }

}
