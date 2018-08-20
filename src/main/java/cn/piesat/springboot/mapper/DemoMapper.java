package cn.piesat.springboot.mapper;

import cn.piesat.springboot.entity.DemoEntity;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoEntity record);

    int insertSelective(DemoEntity record);

    DemoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoEntity record);

    int updateByPrimaryKey(DemoEntity record);
}