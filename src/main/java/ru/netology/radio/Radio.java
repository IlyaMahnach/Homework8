package ru.netology.radio;

public class Radio {
    public int numberStation;

    public int volumeLevel;

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation < 9) {
            numberStation = numberStation + 1;
        } else numberStation = 0;

        numberStation = numberStation;
    }

    public void prevNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else numberStation = 9;
        numberStation = numberStation;
    }


    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel > 10) {
            return;
        }
        if (newVolumeLevel < 0) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public void increaseVolumeLevel() {
        if (volumeLevel < 10) {
            volumeLevel = volumeLevel + 1;
        }
    }

    public void decreaseVolumeLevel() {
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;
        }
    }
}


