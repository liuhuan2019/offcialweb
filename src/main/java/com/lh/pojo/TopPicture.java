package com.lh.pojo;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;


@TableName(value = "toppicture")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="xxxTable对象", description="轮播图")
public class TopPicture implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;


    @ApiModelProperty("存储文件名")
    private String filekey;

    @ApiModelProperty("文件大小")
    private String filesize;


    @ApiModelProperty("照片")
    private byte tpicture;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilekey() {
        return filekey;
    }

    public void setFilekey(String filekey) {
        this.filekey = filekey;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public byte getTpicture() {
        return tpicture;
    }

    public void setTpicture(byte tpicture) {
        this.tpicture = tpicture;
    }

    public TopPicture() {
    }

    public TopPicture(Integer id, String filekey, String filesize, byte tpicture) {
        this.id = id;
        this.filekey = filekey;
        this.filesize = filesize;
        this.tpicture = tpicture;
    }

    @Override
    public String toString() {
        return "TopPicture{" +
                "id=" + id +
                ", filekey='" + filekey + '\'' +
                ", filesize='" + filesize + '\'' +
                ", tpicture=" + tpicture +
                '}';
    }
}
