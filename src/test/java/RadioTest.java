import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetChannelWithoutUser() {
        Radio rad = new Radio(10);
        Assertions.assertEquals(10, rad.getMaxChannel());

    }

    @Test
    public void shouldSetChannelUser() {
        Radio rad = new Radio(0, 9);
        Assertions.assertEquals(0, rad.minChannel);
        Assertions.assertEquals(9, rad.maxChannel);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio rad = new Radio(15);

        rad.setCurrentChannel(15);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevChannel() {
        Radio rad = new Radio(7);
        rad.setCurrentChannel(7);

        rad.prevChannel();

        int expected = 6;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevChannelBelow0() {
        Radio rad = new Radio(0);
        rad.setCurrentChannel(0);

        rad.prevChannel();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextChannel() {
        Radio rad = new Radio(7);
        rad.setCurrentChannel(8);

        //       rad.nextChannel();

        int expected = 8;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextChannelAboveMax() {
        Radio rad = new Radio(10);
        rad.setCurrentChannel(10);

        rad.nextChannel();

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetChannelBelow0() {
        Radio rad = new Radio(-100);

        rad.setCurrentChannel(-100);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeInRange() {

        Radio rad = new Radio(45);

        rad.setCurrentVolume(45);

        rad.increaseVolume();

        int expected = 46;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeOutsideRange() {
        Radio rad = new Radio(101);

        rad.setCurrentVolume(101);

        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInRange() {
        Radio rad = new Radio(75);

        rad.setCurrentVolume(75);

        rad.decreaseVolume();

        int expected = 74;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOutsideRange() {
        Radio rad = new Radio(-1);

        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio(150);

        rad.setCurrentVolume(150);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}