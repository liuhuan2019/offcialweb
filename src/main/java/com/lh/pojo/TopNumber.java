package com.lh.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "topnumber")
@Data
public class TopNumber implements Serializable {


    @TableId
    @ApiModelProperty("pid")
    int pid;

    @ApiModelProperty("phonenumber")
    String phonenumber;

    public TopNumber() {
    }

    public TopNumber(int pid, String phonenumber) {
        this.pid = pid;
        this.phonenumber = phonenumber;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "TopPhone{" +
                "pid=" + pid +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
