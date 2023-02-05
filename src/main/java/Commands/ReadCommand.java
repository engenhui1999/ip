package commands;

import exceptions.NoTaskException;
import storage.Storage;
import storage.TaskList;
import ui.Ui;

/**
 * This class is used to produce the list of tasks.
 */
public class ReadCommand extends Command {
    /**
     * Show all the tasks in the database.
     * @param tasks The database.
     * @param ui The user interface.
     * @param storage The storage.
     * @return String for executing the command.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        if (tasks.isEmpty()) {
            throw new NoTaskException(null);
        }
        return ui.showAllTasks(tasks.getTasks());
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
