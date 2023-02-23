package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxChannel;

    public Radio(int countChannel) {
        maxChannel = countChannel - 1;
    }

    public Radio() {
        maxChannel = 9;
    }


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
        if (newCurrentChannel > maxChannel) {
            return;
        }
        this.currentChannel = newCurrentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void nextChannel() {
        if (currentChannel != maxChannel) {
            currentChannel = currentChannel + 1;
            return;
        }
        currentChannel = 0;
    }

    public void prevChannel() {
        if (currentChannel != 0) {
            currentChannel = currentChannel - 1;
            return;
        }
        currentChannel = maxChannel;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
            return;
        }
        currentVolume = 0;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else currentVolume = currentVolume - 1;
    }
}