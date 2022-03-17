package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldUseConstructor1() {
        Radio radio = new Radio();
        assertEquals(9, radio.getTotalStation());
    }

    @Test
    public void shouldUseConstructor2() {
        Radio radio = new Radio(3);
        assertEquals(3, radio.getTotalStation());
    }

    @Test
    public void shouldUseConstructor3() {
        Radio radio = new Radio(96);
        assertEquals(96, radio.getTotalStation());
    }


    @Test
    public void setStation1() {
        Radio cond = new Radio();

        cond.setNumberStation(8);
        int expected = 8;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }


    @Test
    public void setStation2() {
        Radio cond = new Radio();

        cond.setNumberStation(28);
        int expected = 0;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStation3() {
        Radio cond = new Radio();

        cond.setNumberStation(-10);
        int expected = 0;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio cond = new Radio();
        cond.setNumberStation(9);

        cond.nextNumberStation();
        int expected = 0;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {
        Radio cond = new Radio();
        cond.setNumberStation(0);

        cond.nextNumberStation();
        int expected = 1;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() {
        Radio cond = new Radio();
        cond.setNumberStation(0);

        cond.prevNumberStation();
        int expected = 9;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {
        Radio cond = new Radio();
        cond.setNumberStation(9);

        cond.prevNumberStation();
        int expected = 8;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio cond = new Radio();
        cond.setVolumeLevel(100);

        cond.increaseVolumeLevel();
        int expected = 100;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio cond = new Radio();
        cond.setVolumeLevel(6);

        cond.increaseVolumeLevel();
        int expected = 7;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio cond = new Radio();
        cond.setVolumeLevel(0);

        cond.decreaseVolumeLevel();
        int expected = 0;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        Radio cond = new Radio();
        cond.setVolumeLevel(6);

        cond.decreaseVolumeLevel();
        int expected = 5;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolume1() {
        Radio cond = new Radio();

        cond.setVolumeLevel(8);
        int expected = 8;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolume2() {
        Radio cond = new Radio();

        cond.setVolumeLevel(-10);
        int expected = 0;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolume3() {
        Radio cond = new Radio();

        cond.setVolumeLevel(101);
        int expected = 0;
        int actual = cond.getVolumeLevel();

        assertEquals(expected, actual);
    }
}
