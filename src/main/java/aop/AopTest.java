package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义aop
 * @author LiuYong on 2017/3/16 0016 11:01.
 */
public class AopTest {

    private static final Logger LOG = LoggerFactory.getLogger(AopTest.class);

    public void doBefore() {
        LOG.info("AopTest doBefore method...");
    }

    public void doAfter() {
        LOG.info("AopTest doAfter method...");
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        LOG.info("AopTest doAround method...");
        Object result = pjp.proceed();
        return result;
    }
}
