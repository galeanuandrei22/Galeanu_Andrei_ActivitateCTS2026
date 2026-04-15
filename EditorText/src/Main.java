public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        history.save(editor.save());
        Command write1 = new WriteCommand(editor, "Acesta este primul text!");
        write1.execute();

        history.save(editor.save());
        Command write2 = new WriteCommand(editor, "Acesta este al doilea text!");
        write2.execute();

        System.out.println(editor.getText());

        history.save(editor.save());
        Command delete = new DeleteCommand(editor, 10);
        delete.execute();

        System.out.println(editor.getText());

        editor.restore(history.undo());
        System.out.println("Inainte de undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Dupa undo: " + editor.getText());
    }
}
