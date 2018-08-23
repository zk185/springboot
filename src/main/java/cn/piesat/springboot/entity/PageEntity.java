package cn.piesat.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author zk
 * @date 2018/8/21 16:43
 */
@ApiModel(description = "请求参数")
public class PageEntity {
    @ApiModelProperty(value = "页码")
    private int pageNum;
    @ApiModelProperty(value = "每页显示条数")
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
