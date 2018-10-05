package com.loikun;

import com.loikun.bean.Phone;
import com.loikun.bean.User;
import org.junit.Test;

public class SimpleIoCTest {

    @Test
    public void getBean() throws Exception{
        String location = SimpleIoC.class.getClassLoader().getResource("spring-test.xml").getFile();

        SimpleIoC ioC = new SimpleIoC(location);
        Phone phone = (Phone) ioC.getBean("phone");
        System.out.println(phone);
        User user = (User) ioC.getBean("user");
        System.out.println(user);
    }
}
