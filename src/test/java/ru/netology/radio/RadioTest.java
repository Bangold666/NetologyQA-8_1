package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void volumeIncreaseTrue() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(40);
        radio.increaseVolume();
        assertEquals(41, radio.getCurrentVolume());
    }

    @Test
    void volumeIncreaseFalse() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void volumeDecreaseFalse() {
        Radio radio = new Radio(10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeDecreaseTrue() {
        Radio radio = new Radio(10);
        radio.setCurrentVolume(40);
        radio.decreaseVolume();
        assertEquals(39, radio.getCurrentVolume());
    }

    @Test
    void radioStationIncrease() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStationNumber();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationIncreaseWithReturn() {
        Radio radio = new Radio(10);
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.increaseRadioStationNumber();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationDecreaseWithReturn() {
        Radio radio = new Radio(10);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.decreaseRadioStationNumber();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void radioStationDecrease() {
        Radio radio = new Radio(10);
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.decreaseRadioStationNumber();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void setRadioStationAboveLimit() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void setRadioStationBelowLimit() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldUseNotArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
    }

}
