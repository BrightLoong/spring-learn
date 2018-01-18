/*
 * @(#)BeanTest.java 2018年1月15日上午11:14:43
 * spring-learn
 * Copyright 2018 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package brightloong.github.io.springlearn.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BeanTest
 * @author 陈龙
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanTest {
    @Test
    public void beanTest() {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        TestBean testBean = (TestBean) factory.getBean("testBean");
        testBean.sayHello();
        TestBean testBean2 = (TestBean) factory.getBean("testBean");
        testBean2.sayHello();
    }
}
