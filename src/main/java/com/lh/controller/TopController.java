package com.lh.controller;


import com.lh.pojo.Banner;
import com.lh.pojo.JsonResult;
import com.lh.pojo.TopNumber;
import com.lh.service.TopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/top")
@Api(tags = "首页")
public class TopController {

    @Autowired
    private TopService topService;


    @ApiOperation(value = "删除首页电话号")
    @DeleteMapping("/deleteNumber")
    public  void deleteOfNumber( String phonenumber){
            topService.deleteOfNumber(phonenumber);
    }

    @ApiOperation(value = "修改号码")
    @PutMapping("/updateNumber")
    public void updateNumber(String phonenumber){
      topService.updateNumber(phonenumber);
    }

    @ApiOperation(value = "查询手机号")
    @GetMapping("/selectNumber")
    public TopNumber selectNumber( ){
        return topService.selectNumber();
    }

    
    @ApiOperation("轮播图查询")
    @GetMapping("/getBanner")
    public List<Banner> getBanner(Banner banner) {
        List<Banner> list = topService.getBanner(banner);
        return list;
    }


    @ApiOperation("轮播图修改")
    @PostMapping("/updateBanner")
    public JsonResult picture(@RequestPart("file")MultipartFile file, @Param(value = "id")Integer id) {


        return new JsonResult("保存失败","410","错误");
    }

    @ApiOperation("轮播图添加")
    @PostMapping("/addBanner")
    public JsonResult addPicture(){
       return  null;
    }


}
