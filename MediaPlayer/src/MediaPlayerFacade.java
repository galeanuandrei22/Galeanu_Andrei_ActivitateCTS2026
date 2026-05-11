public class MediaPlayerFacade {
    private MediaAdapter adapter;

    public void playMedia(String fileName) {
        String format = fileName.substring(fileName.lastIndexOf(".") + 1);

        System.out.println("se initializeaza codecuri si altele..");
        if(format.equalsIgnoreCase("mp4")) {
            System.out.println("redare directa mp4 " + fileName);
        } else if (format.equalsIgnoreCase("flv")) {
            adapter = new MediaAdapter(format);
            adapter.play(format, fileName);
        } else {
            System.out.println("format " + format + " nesuportat..");
        }
    }
}
