package com.jacob.video.domain;


import java.io.Serializable;

/**
 * 集实体
 */
public class Episode implements Serializable {

  /**
   * 集id
   */
  private Integer id;
  /**
   * 集标题
   */
  private String title;
  /**
   * 第几集
   */
  private Integer num;
  /**
   * 时长 （单位：分钟）
   */
  private String duration;
  /**
   * 封面图
   */
  private String coverImg;
  /**
   * 视频id
   */
  private Integer videoId;
  /**
   * 集概述
   */
  private String summary;
  /**
   * 创建时间
   */
  private java.util.Date createTime;
  /**
   * 章节主键id
   */
  private Integer chapterId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Integer getVideoId() {
    return videoId;
  }

  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getChapterId() {
    return chapterId;
  }

  public void setChapterId(Integer chapterId) {
    this.chapterId = chapterId;
  }

}
