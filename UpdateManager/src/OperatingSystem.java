public class OperatingSystem {
    private String version;

    public void setVersion(String version) {
        this.version = version;
        System.out.println("versiune curenta: " + version);
    }

    public SystemState save() {
        System.out.println("se creaza restore point pentru: " + version);
        return new SystemState(version);
    }

    public void restore(SystemState memento) {
        this.version = memento.getVersion();
        System.out.println("sistem restaurat la versiunea " + version);
    }
}
