package nell.tasks;

public class Deadline extends nell.tasks.Task {
    private String by;

    public Deadline(String description, String by) {
        super(description, "D");
        this.by = by;
    }

    public Deadline(String description, boolean isDone, String by) {
        super(description, isDone);
        this.by = by;
        this.type = "D";
    }

    public String toString() {
        return String.format("%s (by: %s)", super.toString(), this.by);
    }

    public String getFileLine() {
        return String.format("%s%s|", super.getFileLine(), this.by);
    }
}
