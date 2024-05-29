public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public String toString() {
        return (isCompleted ? "[x] " : "[]");
    }
    /**
 * Removes a task from the list at the specified index.
 *
 * @param index The index of the task to be removed. The index is 0-based, meaning the first task is at index 0.
 * @throws IndexOutOfBoundsException If the index is out of range (index < 0 || index >= size()).
 * @since 1.0
 */
public void removeTask(int index){
    // Implementation goes here
}

}
