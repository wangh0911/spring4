package cn.roboteco.context;

import cn.roboteco.beans.Beans;
import cn.roboteco.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AnnotationApplicationContextTest {

    @Test
    public void getBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Car car = context.getBean("car",Car.class);
        assertNotNull(car);
    }
}
