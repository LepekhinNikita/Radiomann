package ru.netology;

public class Radio {
    private int currentChannel;

    
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > 10) {
            return;
        }
        currentChannel = newCurrentChannel;
    }


    public void nextChannel() {
        if (currentChannel < 10) {
            currentChannel = currentChannel + 1;
        } else currentChannel = 0;
    }

    public void prevChannel() {
        if (currentChannel == 0) {
            currentChannel = 9;
        } else currentChannel = currentChannel - 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 11) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 11) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 10;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else currentVolume = currentVolume - 1;
    }
}