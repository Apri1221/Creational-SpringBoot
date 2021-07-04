package com.example.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = PrototypeApplication.class)
class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        // application context itu utilitas aja
        // https://www.tutorialspoint.com/spring/spring_applicationcontext_container.htm#:~:text=The%20Application%20Context%20is%20Spring's,and%20dispense%20beans%20upon%20request.&text=BeanFactory%20can%20still%20be%20used,devices%20or%20applet%2Dbased%20applications.
        Employee apri = applicationContext.getBean("employeeManager", Employee.class);
        apri.setName("Apri");

        Employee yanto = applicationContext.getBean("employeeCLevel", Employee.class);
        apri.setName("Yanto");

        Employee tobing = applicationContext.getBean("employeeStaff", Employee.class);
        apri.setName("Tobing");

//        ini sama dengan
        Employee rika = new Employee();
        // tapi kita buat lagi
//        rika.setName();
//        rika.setSalary();
//        rika.setPosition();

        System.out.println(apri);
        System.out.println(yanto);
        System.out.println(tobing);
    }
}