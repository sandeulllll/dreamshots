package com.imooc.bilibili.api;

import com.imooc.bilibili.api.support.UserSupport;
import com.imooc.bilibili.domain.JsonResponse;
import com.imooc.bilibili.domain.PageResult;
import com.imooc.bilibili.domain.Video;
import com.imooc.bilibili.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoApi {
    @Autowired
    private VideoService videoService;

    @Autowired
    private UserSupport userSupport;

    //视频投稿
    @PostMapping("/videos")
    public JsonResponse<String> addVideos(@RequestBody Video video){
        Long userId = userSupport.getCurrentUserId();
        video.setUserId(userId);
        videoService.addVideos(video);
        return JsonResponse.success();
    }

    //分页查询视频
    @GetMapping("/videos")
    public JsonResponse<PageResult<Video>> pageListVideos(Integer size,
                                                          Integer no,
                                                          String area){
        PageResult<Video> result = videoService.pageListVideos(size,no,area);
        return new JsonResponse<>(result);
    }
}
