package com.restfulapi.date.servertime;

import java.time.LocalTime;

public class ServerTime {
    private LocalTime currentTime;

    public ServerTime() {
        this.currentTime = LocalTime.now();

    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }


    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
    }
}
