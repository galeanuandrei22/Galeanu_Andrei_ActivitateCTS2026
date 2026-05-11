public class Main {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem();
        os.setVersion("versiunea 2.2 alpha");
        SystemState backup = os.save();

        System.out.println("!!! initiere update !!!");
        UpdateProcess update = new OSUpdate();
        update.executeUpdate();

        os.setVersion("versiunea 2.5 release");

        System.out.println("s-a detectat o eroare critica!!!");
        os.restore(backup);

        System.out.println("inspectare fisiere sistem..");
        FileMetadata rootMeta = MetadataFactory.getMetadata("rwx------", "andrei");

        rootMeta.showInfo("kernel.bin");
        rootMeta.showInfo("drivers.sys");
        rootMeta.showInfo("config.sys");

        System.out.println("obiecte metadata create " + 1);
    }
}
