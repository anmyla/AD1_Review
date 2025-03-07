package Solutions.d_Heap.UE05_TaskHeap_Loesung;

public class Task
{
    private int id;
    private String description;
    private int priority;

    public Task(int id, String description, int priority)
    {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    @Override
    public String toString()
    {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
