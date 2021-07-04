package ru.netology.domain;

public class Radio {
    private int currentStation;
     private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextButtonStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevButtonStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextBattonPlus() {
        if (currentVolume > 10) {
            this.currentVolume = 10;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void nextBattonMinus() {
        if (currentVolume < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}

