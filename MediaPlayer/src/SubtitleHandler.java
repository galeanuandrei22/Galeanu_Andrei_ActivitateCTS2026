public class SubtitleHandler extends FileHandler {
    @Override
    public void handleRequest(String fileName) {
        if(fileName.endsWith(".srt")) {
            System.out.println("se incarca subtitrare pentru " + fileName);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(fileName);
        }
    }
}
