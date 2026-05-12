import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("se verifica permisiunile..");
        Document doc = new DocumentProxy("documentForta.pdf", "vizualizare");
        doc.display();

        Document adminDoc = new DocumentProxy("documentForta.pdf", "admin");
        adminDoc.display();

        System.out.println("se verifica comanda de undo...");
        StringBuilder myContent = new StringBuilder("un text frumos ");
        Stack<EditCommand> history = new Stack<>();

        EditCommand comanda1 = new TextAdditionCommand(myContent, "si caligrafic");
        comanda1.execute();
        history.push(comanda1);
        history.pop().undo();

        System.out.println("se testeaza memoria..");
        CharacterStyle stil1 = StyleFactory.getStyle("Times New Roman", 11, "Negru");
        CharacterStyle stil2 = StyleFactory.getStyle("Arial Narrow", 12, "Albastru");

        stil1.render('c');
        stil2.render('d');

        System.out.println("sunt identice stilurile? " + (stil1 == stil2));
    }
}
