package com.imooc.bilibili.dao;

import com.imooc.bilibili.domain.Video;
import com.imooc.bilibili.domain.VideoCollection;
import com.imooc.bilibili.domain.VideoLike;
import com.imooc.bilibili.domain.VideoTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface VideoDao {

    Integer addVideos(Video video);

    Integer batchAddVideTags(List<VideoTag> videoTagList);

    Integer pageCountVideos(Map<String, Object> params);

    List<Video> pageListVideos(Map<String, Object> params);

    Video getVideoById(Long id);

    VideoLike getVideoLikeByVideoIdAndUserId(@Param("videoId") Long videoId, @Param("userId") Long userId);

    void addVideoLike(VideoLike videoLike);

    void deleteVideoLike(@Param("videoId") Long videoId, @Param("userId") Long userId);

    Long getVideoLikes(Long videoId);

    void deleteVideoCollection(@Param("videoId") Long videoId,
                               @Param("userId") Long userId);

    void addVideoCollection(VideoCollection videoCollection);

    Long getVideoCollections(Long videoId);

    VideoCollection getVideoCollectionByVideoIdAndUserId(@Param("videoId") Long videoId,
                                                         @Param("userId") Long userId);
}
