package common;

import cn.net.gxht.aop.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Created by 10604 on 2017/8/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-mvc.xml", "classpath*:spring-mybatis.xml"})
public class BaseTest {
    @Resource
    protected ApplicationContext ctx;
    @Resource
    private UserService userService;

    @Test
    public void testAop() {
        userService.add();
    }
    @Test
    public void testAnnoAndAop(){
        String o= userService.targetMethod();
        System.out.println(o);
    }
}
