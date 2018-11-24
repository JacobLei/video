package com.jacob.video.domain;


import java.io.Serializable;

/**
 * 评论实体
 */
public class Comment implements Serializable {

  /**
   * 评论id
   */
  private Integer id;
  /**
   * 内容
   */
  private String content;
  /**
   * 用户Id
   */
  private Integer userId;
  /**
   * 用户头像
   */
  private String headImg;
  /**
   * 用户昵称
   */
  private String name;
  /**
   * 评分，１０分满分
   */
  private double point;
  /**
   * 点赞数
   */
  private Integer up;
  /**
   * 创建时间
   */
  private java.util.Date createTime;
  /**
   * 订单时间
   */
  private Integer orderId;
  /**
   * 视频id
   */
  private Integer videoId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPoint() {
    return point;
  }

  public void setPoint(double point) {
    this.point = point;
  }


  public Integer getUp() {
    return up;
  }

  public void setUp(Integer up) {
    this.up = up;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }

}
