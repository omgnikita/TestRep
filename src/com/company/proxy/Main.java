package com.company.proxy;

public class Main {
    public static void main(String[] args) {
        ThirdPartyYoutubeClass service = new ThirdPartyYoutubeClass();
        CachedYoutubeClass proxy = new CachedYoutubeClass(service);
        YoutubeManager manager = new YoutubeManager(proxy);
        manager.reactOnUserInput(2);
    }
}
