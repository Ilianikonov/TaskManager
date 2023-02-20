package org.example;

import java.io.*;
import java.util.ArrayList;

public class FileManager extends Manager {

    public Task toTask(String line) {
        String[] arrayline = line.split(" ");
        int id = Integer.parseInt(arrayline[0]);
        Status status = Status.NEW;
        if (arrayline[3].equals("DONE")) {
            status = Status.DONE;
        } else if (arrayline[3].equals("IN_PROGRESS")) {
            status = Status.IN_PROGRESS;
        }
        return new Task(id, arrayline[1], arrayline[2], status);
    }
    public Epic toEpic(String line){
        String[] arrayline = line.split(" ");
        int id = Integer.parseInt(arrayline[0]);
        Status status = Status.NEW;
        if (arrayline[3].equals("DONE")){
            status = Status.DONE;
        } else if (arrayline[3].equals("IN_PROGRESS")){
            status = Status.IN_PROGRESS;
        }
        return new Epic(id, arrayline[1], arrayline[2], status);
    }
    public Subtask toSubtask(String line){
        String[] arrayline = line.split(" ");
        int epicId = Integer.parseInt(arrayline[0]);
        int id = Integer.parseInt(arrayline[1]);
        Status status = Status.NEW;
        if (arrayline[4].equals("DONE")){
            status = Status.DONE;
        } else if (arrayline[4].equals("IN_PROGRESS")){
            status = Status.IN_PROGRESS;
        }
        return new Subtask(epicId, id, arrayline[2], arrayline[3], status);
    }
    @Override
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("taskFile"))){
            String line;
            while ((line = reader.readLine()) != null){
                list.add(toTask(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

        @Override
    public ArrayList<Epic> getAllEpic() {
            ArrayList<Epic> list = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("epicFile"))){
                String line;
                while ((line = reader.readLine()) != null){
                    list.add(toEpic(line));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return list;
    }

    @Override
    public ArrayList<Subtask> getAllSubtask() {
        ArrayList<Subtask> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("subtaskFile"))){
            String line;
            while ((line = reader.readLine()) != null){
                list.add(toSubtask(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void deleteAllTasks() {
try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("taksFile"));
} catch (IOException e) {
    throw new RuntimeException(e);
}
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
    public Epic getEpicById(int id) {
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("taksFile"))) {
         writer.write(task.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addEpic(Epic task) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("epicFile"))) {
            writer.write(task.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addSubtask(Subtask task) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("subtaskFile"))) {
            writer.write(task.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
