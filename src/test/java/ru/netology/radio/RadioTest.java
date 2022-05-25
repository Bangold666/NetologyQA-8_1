package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void volumeIncreaseTrue() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeIncreaseFalse() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.increaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDecreaseFalse() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void volumeDecreaseTrue() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        cond.decreaseVolume();

        int actual = cond.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void radioStationIncrease() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(8);

        cond.increaseRadioStationNumber();

        int actual = cond.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void radioStationIncreaseWithReturn() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(9);

        cond.increaseRadioStationNumber();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void radioStationDecreaseWithReturn() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(0);

        cond.decreaseRadioStationNumber();

        int actual = cond.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void radioStationDecrease() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(1);

        cond.decreaseRadioStationNumber();

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationAboveLimit() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(10);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStationBelowLimit() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(-1);

        int actual = cond.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

}
