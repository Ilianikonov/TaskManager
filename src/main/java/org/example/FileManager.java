package org.example;

import java.awt.image.BufferedImageOp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager implements ManagerInterface {

    @Override
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> list = new ArrayList<>();
        try {BufferedReader reader = new BufferedReader(new FileReader("taskFile"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public ArrayList<Epic> getAllEpic() {
        ArrayList<Epic> list = new ArrayList<>();
        try {BufferedReader reader = new BufferedReader(new FileReader("epicFile"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public ArrayList<Subtask> getAllSubtask() {
        ArrayList<Subtask> list = new ArrayList<>();
        try {BufferedReader reader = new BufferedReader(new FileReader("subtaskFile"));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void deleteAllEpic() {

    }

    @Override
    public void deleteAllSubtask() {

    }

    @Override
    public Task getByIdTask(int id) {
        return null;
    }

    @Override
    public Epic getByIdEpic(int id) {
        return null;
    }

    @Override
    public Subtask getByIdSubtask(int id) {
        return null;
    }

    @Override
    public void deleteAnTaskId(int id) {

    }

    @Override
    public void deleteAnEpicId(int id) {

    }

    @Override
    public void deleteAnSubtaskId(int id) {

    }

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void addEpic(Epic task) {

    }

    @Override
    public void addSubtask(Subtask task) {

    }

    @Override
    public void updateTheEpic(Epic task) {

    }

    @Override
    public void updateTheSubtask(Subtask task) {

    }

    @Override
    public void updateTheTask(Task task) {

    }

    @Override
    public ArrayList<Subtask> getListAllSubtaskBelongingToEpic(Epic epic) {
        return null;
    }
}
