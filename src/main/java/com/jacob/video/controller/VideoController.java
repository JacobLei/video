package com.jacob.video.controller;

import com.jacob.video.domain.Video;
import com.jacob.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  video接口
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    /**
     * 分页接口
     * @param page　当前第几页，默认是第一页
     * @param size　每页显示几条，默认是十条
     * @return
     */
    @GetMapping("page")
    public Object pageVideo(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size){

        return videoService.findAll();
    }

    /**
     * 根据id找视频
     * @param videoId　视频id
     * @return
     */
    @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id", required = true) int videoId){

        return videoService.findById(videoId);
    }

    /**
     * 根据id删除视频
     * @param videoId 视频id
     * @return
     */
    @DeleteMapping("delte_by_id")
    public Object delById(@RequestParam(value = "video_id", required = true) int videoId){

        return videoService.delete(videoId);
    }


}
