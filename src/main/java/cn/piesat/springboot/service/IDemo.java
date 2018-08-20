package cn.piesat.springboot.service;

import cn.piesat.springboot.entity.DemoEntity;

/**
 * @author zk
 * @date 2018/8/20 10:20
 */
public interface IDemo {

    DemoEntity selectByPkid(Integer pkid);
}
