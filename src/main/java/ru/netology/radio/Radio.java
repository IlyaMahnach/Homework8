package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int totalStation = 9;
    public int volumeLevel;

    public Radio() {
    }

    public Radio(int totalStation) {
        this.totalStation = totalStation;
    }

    public int getTotalStation() {
        return totalStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > getTotalStation()) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void nextNumberStation() {
        if (numberStation < getTotalStation()) {
            numberStation = numberStation + 1;
        } else if (numberStation == getTotalStation()) {
            numberStation = 0;
        }
        numberStation = numberStation;
    }

    public void prevNumberStation() {
        if (numberStation > 0) {
            numberStation = numberStation - 1;
        } else if (numberStation == 0) {
            numberStation = getTotalStation();
        }
        numberStation = numberStation;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel > 100) {
            return;
        }
        if (newVolumeLevel < 0) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public void increaseVolumeLevel() {
        if (volumeLevel < 100) {
            volumeLevel = volumeLevel + 1;
        }
    }

    public void decreaseVolumeLevel() {
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;
        }
    }
}


