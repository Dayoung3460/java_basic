package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("can't volume up. Max 100");
        } else {
            volume += 10;
            System.out.println("volume 10 up.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volume down");
    }
    
    void showVolume() {
        System.out.println("volume = " + volume);
    }
}
