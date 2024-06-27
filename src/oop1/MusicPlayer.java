package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
    }

    void off() {
        isOn = false;
    }

    void volumeUp() {
        volume++;
    }

    void volumeDown() {
        volume--;
    }

    void showStatus() {
        System.out.println("isOn: " + isOn);
    }
}
