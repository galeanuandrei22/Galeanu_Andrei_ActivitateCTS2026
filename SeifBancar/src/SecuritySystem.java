public class SecuritySystem {
    private SecurityResponse response;

    public void setResponseStrategy(SecurityResponse response) {
        this.response = response;
    }

    public void triggerAlarm() {
        response.react();
    }
}
