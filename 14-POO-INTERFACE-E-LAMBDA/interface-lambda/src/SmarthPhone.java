public class SmarthPhone implements VideoPlay, MusicPlay {
    @Override
    public void playVideo() {
        System.out.println("Playing video: " + video);
    }

    @Override
    public void puseVideo() {
        System.out.println("Pusing video: " + video);
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping video: " + video);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music: " + music);
    }

    @Override
    public void puseMusic() {
        System.out.println("Pusing music: " + music);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music: " + music);
    }

}
