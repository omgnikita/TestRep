package com.company.facade;

import com.company.facade.fraemworkClasses.CodecFactory;
import com.company.facade.fraemworkClasses.VideoFile;

public class VideoConverter {
    VideoFile convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        CodecFactory codec = new CodecFactory();
        codec.extract(file);

        if (format.equals("mp4")) {
            file.setFormat("mp4");
        } else file.setFormat("Unknown format");
        return file;
    }

}
