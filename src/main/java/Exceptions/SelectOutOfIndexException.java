package Exceptions;

/**
 * This class is used to throw an exception for selecting an item that is not in the list.
 */
public class SelectOutOfIndexException extends DukeException {
    /**
     * Constructor for the SelectOutOfIndexException.
     * @param err The error.
     */
    public SelectOutOfIndexException(Throwable err) {
        super("Sorry! You selected a number that does not exists on the list.", err);
    }
}
