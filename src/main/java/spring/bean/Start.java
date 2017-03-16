package spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean生命周期    bean构造  --> set property(依赖注入) -->
 *
 * 所有的bean处于递归的过程
 *
 * @author LiuYong on 2017/3/15 0015 15:30.
 */
public class Start {

    public static void main(String[] args){
        //BeanFactory作为Bean容器
        /*ClassPathResource resource = new ClassPathResource("spring/applicationContext.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        System.out.println("-------------------分割线---------------------");
        FirstTestBean firstTestBean = (FirstTestBean) factory.getBean("firstTestBean");
        firstTestBean.doCheck();
        SecondTestBean secondTestBean = (SecondTestBean) factory.getBean("secondTestBean");
        secondTestBean.doCheck();*/

        //ApplicationContext作为Bean容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        System.out.println("-------------------分割线---------------------");
        SecondTestBean secondTestBean = (SecondTestBean) applicationContext.getBean("secondTestBean");
        System.out.println("secondTestBean name:"+secondTestBean.getClass().getName());
        FirstTestBean firstTestBean = (FirstTestBean) applicationContext.getBean("firstTestBean");
        System.out.println("firstTestBean name:"+firstTestBean.getClass().getName());
    }

}
