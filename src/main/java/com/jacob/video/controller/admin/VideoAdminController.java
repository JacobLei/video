package com.jacob.video.controller.admin;

import com.jacob.video.domain.Video;
import com.jacob.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  video管理员接口
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {

    @Autowired
    private VideoService videoService;

    /**
     * 更新视频
     * @param video　视频实体
     * @return
     */
    @PutMapping("update_by_id")
    public Object upateById(@RequestBody(required = true) Video video){

        return videoService.update(video);
    }

    /**
     * 保存视频
     * @param video　视频实体
     * @return
     */
    @PostMapping("save_video")
    public Object saveVideo(@RequestBody(required = true) Video video){

        return videoService.save(video);
    }
}
