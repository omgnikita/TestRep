package com.company.proxy;

public interface ThirdPartyYoutubeLib {
    void listVideos();

    void getVideoInfo(int id);

    void downloadVideo(int id);
}
