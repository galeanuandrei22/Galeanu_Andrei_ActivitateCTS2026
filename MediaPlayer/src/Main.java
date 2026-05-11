public class Main {
    public static void main(String[] args) {
        FileHandler video = new VideoHandler();
        FileHandler subtitrare = new SubtitleHandler();

        video.setNext(subtitrare);

        System.out.println("cerere film mp4");
        video.handleRequest("film1.mp4");

        System.out.println("cerere subtitrare");
        video.handleRequest("subtitle.srt");

        System.out.println("cerere format vechi");
        video.handleRequest("film.flv");
    }
}
