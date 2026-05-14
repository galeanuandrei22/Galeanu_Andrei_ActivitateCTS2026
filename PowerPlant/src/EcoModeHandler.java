public class EcoModeHandler extends PowerHandler {
    @Override
    public void handleOverload(double excessKw) {
        if(excessKw < 100) {
            System.out.println("se reduce intensitatea curentului!");
        } else if(next != null) {
            next.handleOverload(excessKw);
        }
    }
}
