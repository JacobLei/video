package com.jacob.video.domain;


import java.io.Serializable;

/**
 * 用户实体
 */
public class User implements Serializable {

  /**
   * 用户id
   */
  private Integer id;
  /**
   * 微信openid
   */
  private String openid;
  /**
   * 用户昵称
   */
  private String name;
  /**
   * 用户头像
   */
  private String headImg;
  /**
   * 手机号
   */
  private String phone;
  /**
   * 用户签名
   */
  private String sign;
  /**
   * 用户性别（0表示女，1表示男）
   */
  private Integer sex;
  /**
   * 城市
   */
  private String city;
  /**
   * 创建时间
   */
  private java.util.Date createTime;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }


  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
