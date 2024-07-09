package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

//        System.out.println("access volume field directly");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
