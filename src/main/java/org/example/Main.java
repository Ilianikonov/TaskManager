package org.example;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Task task = new Task(2, "gmepmg", "eogk", Status.NEW);
        Task task1 = new Task(4, "gmepmg", "eogk", Status.NEW);
        Subtask subtask1 = new Subtask(4, 1,"gmepmg", "eogk", Status.NEW);
    }
}