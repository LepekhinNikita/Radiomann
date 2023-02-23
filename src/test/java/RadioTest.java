import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetChannel() {
        Radio rad = new Radio();

        rad.setCurrentChannel(2);

        int expected = 2;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentChannel(9);
        rad.nextChannel();

        int expected = 0;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelManual() {
        Radio rad = new Radio(50);

        rad.setCurrentChannel(20);

        int expected = 20;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentChannel(15);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(7);

        rad.prevChannel();

        int expected = 6;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevChannelBelow0() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);

        rad.prevChannel();

        int expected = 9;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(7);

        rad.nextChannel();

        int expected = 8;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetChannelBelow0() {
        Radio rad = new Radio();

        rad.setCurrentChannel(-100);

        int expected = 0;
        int actual = rad.getCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInRange() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeOutsideRange() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInRange() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        rad.decreaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeOutsideRange() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(150);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}