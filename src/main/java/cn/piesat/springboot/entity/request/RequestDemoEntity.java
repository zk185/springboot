package cn.piesat.springboot.entity.request;

import cn.piesat.springboot.entity.PageEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * @author zk
 * @date 2018/8/20 10:26
 */
@ApiModel(description = "请求参数")
public class RequestDemoEntity extends PageEntity {

    @ApiModelProperty(value = "主键")
    private Integer pkid;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }
}
