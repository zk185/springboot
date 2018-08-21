package cn.piesat.springboot.service;

import cn.piesat.springboot.entity.DemoEntity;
import cn.piesat.springboot.entity.response.ResponseDemoEntity;

import java.util.List;

/**
 * @author zk
 * @date 2018/8/20 10:20
 */
public interface IDemo {

    /**
     * 根据主键查询数据demo
     * @param pkid 主键
     * @return 返回数据实体
     */
    DemoEntity selectByPkid(Integer pkid);

    /**
     * 分页查询所有数据demo
     * @param pageNum 页码
     * @param pageSize 每页显示条数
     * @return 返回当前页数据
     */
    List<DemoEntity> selectAll(int pageNum,int pageSize);
}
