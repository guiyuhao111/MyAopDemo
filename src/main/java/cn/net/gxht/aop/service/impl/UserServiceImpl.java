package cn.net.gxht.aop.service.impl;

import cn.net.gxht.aop.entity.MyAnnotation;
import cn.net.gxht.aop.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/2.
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public void add(){
        System.out.println("UserService add()");
    }
    @Override
    public boolean delete(){
        System.out.println("UserService delete()");
        return true;
    }
    @Override
    public void edit(){
        System.out.println("UserService edit()");
        int i = 5/0;
    }
    @MyAnnotation(name="桂预豪",value = "帅帅哒")
    @Override
    public String targetMethod(){
        return "哈哈哈";
    }
}
