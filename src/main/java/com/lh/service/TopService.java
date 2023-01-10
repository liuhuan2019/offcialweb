package com.lh.service;


import com.lh.mapper.TopMapper;
import com.lh.pojo.Banner;
import com.lh.pojo.TopNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TopService {

    @Autowired
    private TopMapper topMapper;


    public void deleteOfNumber(String phonenumber) {
        topMapper.deleteOfNumber(phonenumber);
    }

    public void updateNumber(String phonenumber) {
        topMapper.updatenumber(phonenumber);
    }

    public TopNumber selectNumber() {
        return topMapper.selectnumber();
    }

    /*获取轮播图图片*/
    public List<Banner> getBanner(Banner banner) {
        return topMapper.getBanner(banner);
    }


}
