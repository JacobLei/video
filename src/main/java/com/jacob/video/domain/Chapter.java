package com.jacob.video.domain;

import java.io.Serializable;

/**
 * 章节实体
 */
public class Chapter implements Serializable {

  /**
   * 章节id
   */
  private Integer id;
  /**
   * 视频主键
   */
  private Integer videoId;
  /**
   * 章节名称
   */
  private String title;
  /**
   * 章节顺序
   */
  private Integer ordered;
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


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getOrdered() {
    return ordered;
  }

  public void setOrdered(Integer ordered) {
    this.ordered = ordered;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }

}
