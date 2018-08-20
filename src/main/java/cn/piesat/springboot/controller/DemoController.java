package cn.piesat.springboot.controller;

import cn.piesat.springboot.common.Response;
import cn.piesat.springboot.entity.DemoEntity;
import cn.piesat.springboot.entity.request.RequestDemoEntity;
import cn.piesat.springboot.service.IDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zk
 * @date 2018/8/16 10:44
 */
@RestController
@EnableAutoConfiguration
public class DemoController {

    @Autowired
    private IDemo iDemo;

    @PostMapping("/demoMethod")
    public Response demoMethod(RequestDemoEntity requestDemoEntity){
        Response r = Response.getInstance();
        Integer pkid = requestDemoEntity.getPkid();
        DemoEntity de = iDemo.selectByPkid(pkid);
        r.setOk(0,null,"请求成功",de);
        return r;
    }
}
