public class MediaAdapter {
    private AdvancedPlayer advancedPlayer;

    public MediaAdapter(String format) {
        if(format.equalsIgnoreCase("flv")) {
            advancedPlayer = new FlvPlayer();
        }
    }

    public void play(String format, String fileName) {
        if(format.equalsIgnoreCase("flv")) {
            advancedPlayer.playFlv(fileName);
        }
    }
}
