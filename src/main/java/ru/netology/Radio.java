package ru.netology;

public class Radio {
    public int maxChannel = 10;
    public int minChannel = 0;
    private int currentChannel = minChannel;

    public Radio(int minChannel, int maxChannel) {
        this.minChannel = minChannel;
        this.maxChannel = maxChannel;
        this.currentChannel = getCurrentChannel();
    }

    public Radio(int size) {
        maxChannel = currentChannel + size;
    }


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

//    public int getMinChannel() {
//        return minChannel;

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
        if (currentChannel < maxChannel) {
            currentChannel = currentChannel + 1;
        } else currentChannel = minChannel;
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            currentChannel = 9;
        } else currentChannel = currentChannel - 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 10;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else currentVolume = currentVolume - 1;
    }
}