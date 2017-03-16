package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LiuYong on 2017/3/16 0016 14:34.
 */
public class InvocationTestHandler implements InvocationHandler {

    private static final Logger LOG = LoggerFactory.getLogger(InvocationTestHandler.class);

    private ProxyTestInterface proxyObject;

    public InvocationTestHandler(ProxyTestInterface proxyObject){
        this.proxyObject = proxyObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOG.info("invoke handler before ...");
        LOG.info("invoke handler proxy class name:"+proxy.getClass().getName());
        Object o = method.invoke(proxyObject,args);
        LOG.info("invoke handler after ...");
        return o;
    }
}
