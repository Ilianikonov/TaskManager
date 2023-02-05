package org.example;
public abstract class AbstractTask {
    private final int id;
    private String name;
    private String descriptions;
    private Status status;

    public AbstractTask(int id, String name, String descriptions, String status) {
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.status = Status.valueOf(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
