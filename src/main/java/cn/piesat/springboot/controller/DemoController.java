package cn.piesat.springboot.controller;

import cn.piesat.springboot.common.Response;
import cn.piesat.springboot.entity.DemoEntity;
import cn.piesat.springboot.entity.request.RequestDemoEntity;
import cn.piesat.springboot.entity.response.ResponseDemoEntity;
import cn.piesat.springboot.service.IDemo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public Response demoMethod(@RequestBody RequestDemoEntity requestDemoEntity){
        Response r = Response.getInstance();
        Integer pkid = requestDemoEntity.getPkid();
        DemoEntity de = iDemo.selectByPkid(pkid);
        r.setOk(0,null,"请求成功",de);
        return r;
    }

    @PostMapping("/selectAll")
    public Response selectAll(@RequestBody RequestDemoEntity requestDemoEntity){
        Response r = Response.getInstance();
        int pageNum = requestDemoEntity.getPageNum();
        int pageSize = requestDemoEntity.getPageSize();
        List<DemoEntity> list = iDemo.selectAll(pageNum,pageSize);
        if(list != null){
            PageInfo<DemoEntity> pageInfo = new PageInfo<>(list);
            long total = pageInfo.getTotal();
            r.setOk(0,null,"查询成功",list,total);
        }else{
            r.setError(10000,null,"查询失败！");
        }
        return r;

    }
}
