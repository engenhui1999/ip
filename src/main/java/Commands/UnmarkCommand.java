package commands;

import storage.Storage;
import storage.TaskList;
import tasks.Task;
import ui.Ui;

/**
 * This class is used to unmark a task.
 */
public class UnmarkCommand extends Command {
    private int taskNumber;

    /**
     * Constructor for the UnmarkCommand.
     * @param userInput The user input.
     */
    public UnmarkCommand(String userInput) {
        this.taskNumber = getTaskNumber(userInput);
    }

    /**
     * Returns the task number from the database.
     * @param userInput The user input.
     * @return The task number from the database.
     */
    private int getTaskNumber(String userInput) {
        int taskNumber = Integer.parseInt(userInput.split(" ")[1]);
        return taskNumber;
    }

    /**
     * Unmark the task.
     * @param tasks The database.
     * @param ui The user interface.
     * @param storage The storage.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.getTaskByIndex(this.taskNumber - 1);
        task.setUndone();
        ui.showUnmarkTask(task);
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
