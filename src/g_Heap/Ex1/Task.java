package g_Heap.Ex1;

public class Task {
    protected int ID;
    protected String description;
    protected int priority;

    public Task(int ID, String description, int priority) {
        this.ID = ID;
        this.description = description;
        this.priority = priority;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return  "Task ID: " + ID + + '\'' +
                "Description: " + description + '\'' +
                "Priority: " + priority;
    }
}
