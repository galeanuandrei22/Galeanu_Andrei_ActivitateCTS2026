public class VideoHandler extends FileHandler {
    @Override
    public void handleRequest(String fileName) {
        if(fileName.endsWith(".mp4") || fileName.endsWith(".flv")) {
            System.out.println("se va folosi acest fisier video..");
            new MediaPlayerFacade().playMedia(fileName);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(fileName);
        }
    }
}
