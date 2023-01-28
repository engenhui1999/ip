package Commands;

import Storage.Storage;
import Storage.TaskList;
import Tasks.ToDo;
import Ui.Ui;

/**
 * This class is used to create a new To Do task.
 */
public class TodoCommand extends Command {
    private String description;

    /**
     * Constructor for the ToDoCommand.
     * @param userInput The user input.
     */
    public TodoCommand(String userInput) {
        this.description = getDescription(userInput);
    }

    /**
     * Returns the description to initialise the To Do.
     * @param userInput The user input.
     * @return The description.
     */
    public String getDescription(String userInput) {
        return userInput.split(" ")[1];
    }

    /**
     * Create a new To Do task and add it to the database.
     * @param tasks The database.
     * @param ui The user interface.
     * @param storage The storage.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ToDo toDo = new ToDo(this.description);
        tasks.addTask(toDo);
        ui.showAddTask(toDo, tasks.getSize());
    }

    /**
     * Check to continue the conversation.
     * @return True.
     */
    @Override
    public boolean isContinueConvo() {
        return true;
    }
}
