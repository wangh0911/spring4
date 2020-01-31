package cn.roboteco.beanfactory;

import cn.roboteco.beans.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

public class BeanFactoryTest {
    @Test
    public void getBean() throws Throwable{
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:beans.xml");
        System.out.println(resource.getURL());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        System.out.println("init beanfactory");

        Car car = factory.getBean("car",Car.class);
        System.out.println("car bean is ready for use");
        car.introduce();
    }
}
