public class AccessFactory {
    public AccessMethod createMethod(String type) {
        if(type.equalsIgnoreCase("pin")) return new PinAccess();
        if(type.equalsIgnoreCase("biometric")) return new BiometricAccess();
        throw new IllegalArgumentException("metoda de acces inexistenta!");
    }
}
