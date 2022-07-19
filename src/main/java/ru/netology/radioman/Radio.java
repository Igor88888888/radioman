package ru.netology.radioman;

public class Radio {


    private int amountStation = 10;
    private int maxStation = amountStation - 1;
    private int minStation = 0;
    private int currentNumberStation = minStation;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {

    }

    private int minVol = 0;
    private int maxVol = 100;
    private int currentVolume = minVol;


    public int getAmountStation() {
        return amountStation;
    }


    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation < minStation) {
            return;
        }
        if (newCurrentNumberStation > maxStation) {
            return;
        }
        currentNumberStation = newCurrentNumberStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVol() {
        return minVol;
    }

    public int getMaxVol() {
        return maxVol;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVol) {
            newCurrentVolume = minVol;
        }
        if (newCurrentVolume > maxVol) {
            newCurrentVolume = maxVol;
        }
        currentVolume = newCurrentVolume;
    }


    public int setMaxNumberStation() {
        currentNumberStation = maxStation;

        return 0;
    }

    public void nextStation() {

        // setCurrentNumberStation(maxStation);

        if (currentNumberStation == maxStation) {
            currentNumberStation = minStation;
        } else {
            currentNumberStation = currentNumberStation + 1;
        }

    }

    public void prevStation() {

        if (currentNumberStation == minStation) {
            currentNumberStation = maxStation;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }
    }

    public void increaseVolumeDownMax() {

        if (currentVolume == maxVol) {
            currentVolume = maxVol;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolumeUnderMax() {
        if (currentVolume == minVol) {
            currentVolume = minVol;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
