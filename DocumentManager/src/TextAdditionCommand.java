public class TextAdditionCommand implements EditCommand {
    private StringBuilder documentContent;
    private String textToAdd;

    public TextAdditionCommand(StringBuilder content, String text) {
        this.documentContent = content;
        this.textToAdd = text;
    }

    @Override
    public void execute() {
        documentContent.append(textToAdd);
        System.out.println("documentul a fost actualizat " + documentContent);
    }

    @Override
    public void undo() {
        int start = documentContent.length() - textToAdd.length();
        documentContent.delete(start, documentContent.length());
        System.out.println("s-a produs undo " + documentContent);
    }
}
