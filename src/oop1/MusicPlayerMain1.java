package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        volume++;
        System.out.println("Volume is: " + volume);
        volume++;
        System.out.println("volume = " + volume);
        volume--;

        if (isOn) {
            System.out.println("Music is playing");
        } else {
            System.out.println("Music is not playing");
        }

        isOn = false;
        System.out.println("Music player is off.");
    }
}
