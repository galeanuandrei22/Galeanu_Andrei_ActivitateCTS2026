public class Main {
    public static void main(String[] args) {
        CommentHandler profanity = new ProfanityFilter();
        CommentHandler spam = new SpamFilter();
        CommentHandler length = new LengthFilter();

        profanity.setNext(spam);
        spam.setNext(length);

        System.out.println("Test 1:");
        profanity.handle("Salutare!");

        System.out.println("\nTest 2:");
        profanity.handle("cuvantobscen");

        System.out.println("\nTest 3:");
        profanity.handle("RECLAMA");

        System.out.println("\nTest 4:");
        profanity.handle("Comentariu lung aiurea, sincer.......................................................");
    }
}
