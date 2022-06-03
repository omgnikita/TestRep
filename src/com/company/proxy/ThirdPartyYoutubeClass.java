package com.company.proxy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public void listVideos() {
        System.out.println("Получить список видео");
    }

    @Override
    public void getVideoInfo(int id) {
        System.out.println("Получить информацию о ролике " + id);
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Скачать ролик " + id);
    }
}
