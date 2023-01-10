package com.lh.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "phoneus")
@Data
public class PhoneUs implements Serializable {


    @TableId
    @ApiModelProperty("phoneusid")
    int phoneusid;

    @ApiModelProperty("offcialname")
    String offcialname;

    @ApiModelProperty("offcialphone")
    int offcialphone;

    @ApiModelProperty("offcialaddress")
    String offcialaddress;

    @ApiModelProperty("offcialemail")
    String offcialemail;

    public PhoneUs() {
    }

    public PhoneUs(int phoneusid, String offcialname, int offcialphone, String offcialaddress, String offcialemail) {
        this.phoneusid = phoneusid;
        this.offcialname = offcialname;
        this.offcialphone = offcialphone;
        this.offcialaddress = offcialaddress;
        this.offcialemail = offcialemail;
    }


    public int getPhoneusid() {
        return phoneusid;
    }

    public void setPhoneusid(int phoneusid) {
        this.phoneusid = phoneusid;
    }

    public String getOffcialname() {
        return offcialname;
    }

    public void setOffcialname(String offcialname) {
        this.offcialname = offcialname;
    }

    public int getOffcialphone() {
        return offcialphone;
    }

    public void setOffcialphone(int offcialphone) {
        this.offcialphone = offcialphone;
    }

    public String getOffcialaddress() {
        return offcialaddress;
    }

    public void setOffcialaddress(String offcialaddress) {
        this.offcialaddress = offcialaddress;
    }

    public String getOffcialemail() {
        return offcialemail;
    }

    public void setOffcialemail(String offcialemail) {
        this.offcialemail = offcialemail;
    }


    @Override
    public String toString() {
        return "PhoneUs{" +
                "phoneusid=" + phoneusid +
                ", offcialname='" + offcialname + '\'' +
                ", offcialphone=" + offcialphone +
                ", offcialaddress='" + offcialaddress + '\'' +
                ", offcialemail='" + offcialemail + '\'' +
                '}';
    }
}
