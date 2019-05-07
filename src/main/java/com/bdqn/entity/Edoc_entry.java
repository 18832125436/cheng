package com.bdqn.entity;

import java.io.Serializable;
import java.util.Date;

public class Edoc_entry implements Serializable {

    private Integer id;//编号
    private String title;//标题
    private String summary;//摘要
    private String uploaduser;//上传人
    private Date createdate;//创建时间

    public Integer getId() {
        System.out.println(0);
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUploaduser() {
        return uploaduser;
    }

    public void setUploaduser(String uploaduser) {
        this.uploaduser = uploaduser;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
