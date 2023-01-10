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


@TableName(value = "banner")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="xxxTable对象", description="轮播图")
public class Banner implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;


    @ApiModelProperty("存储文件名")
    private String filekey;

    @ApiModelProperty("文件大小")
    private String filesize;


    @ApiModelProperty("照片")
    private byte picture;

    public Banner() {

    }

    public Banner(Integer id, String filekey, String filesize, byte picture) {
        this.id = id;
        this.filekey = filekey;
        this.filesize = filesize;
        this.picture = picture;
    }
}
