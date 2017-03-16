package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiuYong on 2017/3/16 0016 14:54.
 */
public class ProxyTestInterfaceImpl implements ProxyTestInterface {

    private static final Logger LOG = LoggerFactory.getLogger(ProxyTestInterfaceImpl.class);

    public void printMsg() {
        LOG.info("this is ProxyTestInterfaceImpl printMsg method...");
    }
}
