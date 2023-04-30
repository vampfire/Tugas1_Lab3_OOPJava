public class MusicPlayer {
    private String song;
    private int volume;
    private boolean isPlaying;


    // Overloading Method
    
    public void play() {
        this.isPlaying = true;
        System.out.println("Playing " + this.song + " at volume " + this.volume);
    }

    public void play(String song) {
        this.song = song;
        this.isPlaying = true;
        System.out.println("Playing " + this.song + " at volume " + this.volume);
    }

    public void play(String song, int volume) {
        this.song = song;
        this.volume = volume;
        this.isPlaying = true;
        System.out.println("Playing " + this.song + " at volume " + this.volume);
    }
    
        // Overloading Constructor
        
    public MusicPlayer() {
        this.song = "No Song";
        this.volume = 0;
        this.isPlaying = false;
    }

    public MusicPlayer(String song) {
        this.song = song;
        this.volume = 50;
        this.isPlaying = false;
    }

    public MusicPlayer(String song, int volume) {
        this.song = song;
        this.volume = volume;
        this.isPlaying = false;
    }

    public void stop() {
        this.isPlaying = false;
        System.out.println("Stopping music");
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    // Main
    
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer();
        player1.play();

        MusicPlayer player2 = new MusicPlayer("Metal");
        player2.play();

        MusicPlayer player3 = new MusicPlayer("Rock", 75);
        player3.play();

        player3.stop();
    }
}
