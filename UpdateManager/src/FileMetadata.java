public class FileMetadata {
    private final String permissions;
    private final String owner;

    public FileMetadata(String permissions, String owner) {
        this.permissions = permissions;
        this.owner = owner;
    }

    public void showInfo(String fileName) {
        System.out.println("fisier " + fileName + permissions + owner);
    }
}
