public class DeleteCommand implements Command {
    private TextEditor editor;
    private int length;

    public DeleteCommand(TextEditor editor, int length) {
        this.editor = editor;
        this.length = length;
    }

    @Override
    public void execute() {
        editor.delete(length);
    }
}
