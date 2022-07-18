package ru.netology.radioman;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;

    private int minVol = 0;
    private int maxVol = 10;
    private int currentNumberStation;

    private int currentVolume;

    private int currentStation;


    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < 0) {
            return;
        }
        if (newCurrentNumberStation > 9) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }


    public int setMaxNumberStation() {
        currentNumberStation = 9;

        return 0;
    }

    public void nextStation() {

        // setCurrentNumberStation(maxStation);

        if (currentNumberStation == maxStation) {
            currentNumberStation = 0;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }

    }

    public void prevStation() {

        if (currentNumberStation == minStation) {
            currentNumberStation = 9;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }
    }

    public void increaseVolumeDownMax() {

        if (currentVolume == 10) {
            currentVolume = maxVol;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolumeUnderMax() {
        if (currentVolume == 0) {
            currentVolume = minVol;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
