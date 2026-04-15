public class TextEditor {
    private String text = "";

    public void write(String newText) {
        text += newText;
    }

    public void delete(int length) {
        if(length <= text.length()) {
            text = text.substring(0, text.length() - length);
        }
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getState();
    }
}
