package nell;

import nell.tasks.Task;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    public int getTaskCount() {
        return this.tasks.size();
    }

    public void addTask(Task taskToAdd) {
        System.out.println("-> The task has been added to the list:");
        tasks.add(taskToAdd);
        System.out.println("   " + taskToAdd);
        System.out.println(String.format("   The list now has %d tasks", this.tasks.size()));
    }

    public Task getTaskAtIndex(int index) throws IndexOutOfBoundsException {
        return tasks.get(index);
    }
}
