package com.company.proxy;

public class YoutubeManager {
    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    void renderVideoPage(int id) {
        service.getVideoInfo(id);
    }

    void renderListPanel() {
        service.listVideos();
    }

    void reactOnUserInput(int id) {
        renderVideoPage(id);
        renderListPanel();
    }
}
