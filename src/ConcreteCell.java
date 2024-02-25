/**
 * ConcreteCell is a subclass of Cell that implements the receiveAction method.
 */
public class ConcreteCell extends Cell {
    /**
     * Constructor
     *
     * @param state State
     * @param field Field mediator
     */
    public ConcreteCell(String state, FieldMediator field) { super(state, field); }
    /**
     * Receive an action
     *
     * @param state State
     */
    public void receiveAction(String state) {
        // Implement logic to update state based on field and game rules (e.g., become empty)
        System.out.println("Cell with state " + this.state + " received action: " + state);
    }
}
