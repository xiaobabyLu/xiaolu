package com.example.xiaolu.vo;

import com.alibaba.fastjson.JSON;
/**
 * @author Lu Yufeng
 * @date 2018/12/4 下午7:57
 */
public class UserVO {
   private Long id;

   private Integer createDate;

   private String cityId;

   private String cityName;

   private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String toString(){
        return JSON.toJSONString(this);
    }
}
