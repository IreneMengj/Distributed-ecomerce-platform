package com.atguigu.gulimall.product.vo;

public class AttrRespVo extends AttrVo{
    private String catelogName;
    private String groupName;

    public AttrRespVo() {
    }

    public String getCatelogName() {
        return catelogName;
    }

    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
