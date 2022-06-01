package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int MaxVolume = 100;


    public Radio(int currentRadioStation, int maxRadioStation, int currentVolume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation - 1;
        this.currentVolume = currentVolume;
        this.MaxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseRadioStationNumber() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void decreaseRadioStationNumber() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}
