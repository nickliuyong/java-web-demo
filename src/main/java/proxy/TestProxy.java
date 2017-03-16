package proxy;

import java.lang.reflect.Proxy;

/**
 * 基于jdk动态代理实现
 * @author LiuYong on 2017/3/16 0016 14:57.
 */
public class TestProxy {

    public static void main(String[] args) {
        ProxyTestInterfaceImpl proxyTestInterface = new ProxyTestInterfaceImpl();
        InvocationTestHandler handler = new InvocationTestHandler(proxyTestInterface);
        ProxyTestInterface test = (ProxyTestInterface)Proxy.newProxyInstance(handler.getClass().getClassLoader(), proxyTestInterface.getClass().getInterfaces(), handler);
        System.out.println("proxy class name:" + test.getClass().getName());
        test.printMsg();
    }

}
