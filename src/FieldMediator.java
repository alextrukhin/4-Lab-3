/**
 * Mediator class for the field of cells.
 * It is responsible for setting cells and emitting actions to all cells except the sender.
 */
public class FieldMediator {
    /**
     * Cells in the field
     */
    private final Cell[][] cells = new Cell[12][12];
    /**
     * Constructor
     */
    public FieldMediator() {}
    /**
     * Set a cell in the field
     *
     * @param cell Cell
     * @param x    X coordinate
     * @param y    Y coordinate
     */
    public void setCell(Cell cell, int x, int y) {
        cells[x][y] = cell;
    }
    /**
     * Emit an action to all cells except the senders
     *
     * @param message Message
     * @param senders Senders
     */
    public void emitAction(String message, Cell... senders) {
        for (Cell[] cellsRow : cells) {
            for (Cell cell : cellsRow) {
                if ((senders.length == 0 || senders[0] != cell) && cell != null) {
                    cell.receiveAction(message);
                }
            }
        }
    }
}