package com.company.bridge;

import com.company.bridge.devices.Radio;
import com.company.bridge.devices.TV;
import com.company.bridge.remotes.Remote;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.togglePower();

        Radio radio = new Radio();
        Remote remote1 = new Remote(radio);
    }
}
