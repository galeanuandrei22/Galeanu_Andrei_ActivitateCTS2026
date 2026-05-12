public class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String fileName;
    private String userRole;

    public DocumentProxy(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if("admin".equalsIgnoreCase(userRole) || "editor".equalsIgnoreCase(userRole)) {
            if(realDocument == null) {
                realDocument = new RealDocument(fileName);
            }
            realDocument.display();
        } else {
            System.out.println("accest interzis pentru fisierul " + fileName + " deoarece rolul tau este insuficient " + userRole);
        }
    }
}
