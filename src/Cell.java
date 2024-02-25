/**
 * Cell
 * Abstract class for the cells in the field.
 */
public abstract class Cell {
    /**
     * State of the cell
     */
    protected String state;
    /**
     * Field mediator
     */
    protected FieldMediator mediator;

    /**
     * Constructor
     *
     * @param state    State
     * @param mediator Field mediator
     */
    public Cell(String state, FieldMediator mediator) {
        this.state = state;
        this.mediator = mediator;
    }
    /**
     * Emit an action
     *
     * @param state State
     */
    public void emitAction(String state) {
        mediator.emitAction(state, this);
    }

    /**
     * Receive an action
     *
     * @param state State
     */
    public void receiveAction(String state) {
    }
}