package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test

    public void test() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getAmountStation());
    }

    @Test

    public void setNumberStation() {

        Radio radio = new Radio();

        radio.setCurrentNumberStation(8);

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void currentNumberStation() { // между 0 и 9

        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void upperCurrentNumberStation() { // больше 9

        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void lowerCurrentNumberStation() {

        Radio radio = new Radio();
        radio.setCurrentNumberStation(-2);

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void nextStationUnder9() {

        Radio radio = new Radio();

        radio.setCurrentNumberStation(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9AndBigger() {

        Radio radio = new Radio();
        radio.setCurrentNumberStation(radio.getMaxStation());
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void prevStationZero() {

        Radio radio = new Radio();
        radio.setCurrentNumberStation(radio.getMinStation());
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationBiggerZero() {

        Radio radio = new Radio();
        radio.setCurrentNumberStation(3);
        radio.prevStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeUnderMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolumeDownMax();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void increaseVolumeMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMaxVol());
        radio.increaseVolumeDownMax();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void downVolumeUnderMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.downVolumeUnderMax();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VolumeZero() {

        Radio radio = new Radio();
        radio.setCurrentVolume(radio.getMinVol());
        radio.downVolumeUnderMax();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setCurrentVolume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setCurrentVolumeBiggerMax() {

        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setCurrentVolumeDownMin() {

        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
