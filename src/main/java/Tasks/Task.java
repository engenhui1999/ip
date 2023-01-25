package Tasks;

public class Task {
    protected String description;
    protected boolean isDone;
    protected static String doneTaskString = "Nice! I've marked this task as done:";
    protected static String undoneTaskString = "Nice! I've marked this task as not done yet:";

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void setDone() {
        this.isDone = true;
        System.out.println(doneTaskString + "\n" + this);
    }

    public void setUndone() {
        this.isDone = false;
        System.out.println(undoneTaskString + "\n" + this);
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + this.description;
    }
}