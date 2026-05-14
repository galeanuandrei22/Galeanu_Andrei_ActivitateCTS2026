public class EmergencyHandler extends PowerHandler {
    @Override
    public void handleOverload(double excessKw) {
        System.out.println("nivel critic! se opreste! excedent: " + excessKw);
    }
}
