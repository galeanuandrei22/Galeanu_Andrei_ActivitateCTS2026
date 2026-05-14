public class PenaltyCheckHandler extends LoanHandler {

    @Override
    public boolean handle(String user, String book) {
        System.out.println("verificare penalitati pentru: " + user);
        if(user.equalsIgnoreCase("un_user")) {
            System.out.println("utilizatorul are penalizari");
            return false;
        }
        return (next == null) || next.handle(user, book);
    }
}
