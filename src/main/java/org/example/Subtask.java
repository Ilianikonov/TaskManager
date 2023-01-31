package org.example;

public class Subtask extends AbstractTask {
    private int epicId;
    public Subtask(int id, String name, String descriptions, String status) {
        super(id, name, descriptions, status);
    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
