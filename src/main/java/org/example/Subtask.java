package org.example;

public class Subtask extends AbstractTask {
    private int epicId;
    public Subtask(int epicId, int id, String name, String descriptions, Status status) {
        super(id, name, descriptions, status);
        this.epicId = epicId;
    }
    @Override
    public String toString() {
        return this.epicId + " " + this.getId() + " " + this.getName() + " " + this.getDescriptions() + " " + this.getStatus();
    }
    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
