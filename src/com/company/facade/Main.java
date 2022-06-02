package com.company.facade;

import com.company.facade.fraemworkClasses.MPEG4CompressionCodec;
import com.company.facade.fraemworkClasses.VideoFile;

public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        VideoFile videoFile = converter.convert("film", "mp4");
    }
//    исправить!
}
