package com.imooc.bilibili.service;

import com.imooc.bilibili.service.util.FastDFSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileService {
    @Autowired
    private FastDFSUtil fastDFSUtil;

    public String uploadFileBySlices(MultipartFile slice,
                                     String fileMd5,
                                     Integer sliceNo,
                                     Integer totalSliceNo) throws Exception {
        return fastDFSUtil.uploadFileBySlices(slice,fileMd5,sliceNo,totalSliceNo);
    }
}
