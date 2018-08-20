package cn.piesat.springboot.service.impl;

import cn.piesat.springboot.entity.DemoEntity;
import cn.piesat.springboot.mapper.DemoMapper;
import cn.piesat.springboot.service.IDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zk
 * @date 2018/8/20 10:22
 */

@Service
public class DemoImpl implements IDemo {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public DemoEntity selectByPkid(Integer pkid) {
        return demoMapper.selectByPrimaryKey(pkid);
    }
}
