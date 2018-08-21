package cn.piesat.springboot.entity.request;

import cn.piesat.springboot.entity.PageEntity;

/**
 * @author zk
 * @date 2018/8/20 10:26
 */
public class RequestDemoEntity extends PageEntity {
    private Integer pkid;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }
}
