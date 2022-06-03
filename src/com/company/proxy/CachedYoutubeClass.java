package com.company.proxy;

import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeClass service;

    private List<Video> listCache;

    private List<Video> videoCache;

    private boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeClass service) {
        this.service = service;
    }

    @Override
    public void listVideos() {
        service.listVideos();
    }

    @Override
    public void getVideoInfo(int id) {
        service.getVideoInfo(id);
    }

    @Override
    public void downloadVideo(int id) {
        service.downloadVideo(id);
    }
}
