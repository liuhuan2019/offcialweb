package com.lh.mapper;


import com.lh.pojo.Banner;
import com.lh.pojo.TopNumber;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopMapper {

    @Delete("DELETE from topnumber  WHERE  topnumber.phonenumber=#{phonenumber}")
    void deleteOfNumber(String phonenumber);

    @Update("UPDATE topnumber SET topnumber.phonenumber=#{phonenumber} WHERE topnumber.phonenumber=#{phonenumber} ")
    void updatenumber(String phonenumber);

    @Select("select * from topnumber")
    TopNumber selectnumber();


    /*轮播图查询*/
    @Select("SELECT * FROM banner")
    List<Banner> getBanner(Banner banner);
}
