/**
 * Entry point of the program
 */
public class Main {
    /**
     * Main
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        FieldMediator field = new FieldMediator();

        Cell cell1 = new ConcreteCell("X", field);
        Cell cell2 = new ConcreteCell("-", field);

        field.setCell(cell1, 1, 2);
        field.setCell(cell2, 3, 4);

        cell2.emitAction("Hello, cell2!");
        field.emitAction("Hello, everyone!");
    }
}