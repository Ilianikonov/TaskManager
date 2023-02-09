package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class ManagerInterfaceTest<T extends ManagerInterface> {
    protected T manager;

    @Test
    public void testGetAllSubtask() {
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11, 2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11, 3, "name", "descriptions", Status.DONE);
        ArrayList<Subtask> list = new ArrayList<>();
        list.add(subtask);
        list.add(subtask1);
        list.add(subtask2);
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        assertEquals(list,manager.getAllSubtask());
    }
    @Test
    public void testGetAllEpic() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        Epic epic1 = new Epic(2, "name", "descriptions", Status.IN_PROGRESS);
        Epic epic2 = new Epic(3, "name", "descriptions", Status.DONE);
        ArrayList<Epic> list = new ArrayList<>();
        list.add(epic);
        list.add(epic1);
        list.add(epic2);
        manager.addEpic(epic);
        manager.addEpic(epic1);
        manager.addEpic(epic2);
        assertEquals(list,manager.getAllEpic());
    }
    @Test
    public void testGetAllTasks() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        Task task1 = new Task(2, "name", "descriptions", Status.IN_PROGRESS);
        Task task2 = new Task(3, "name", "descriptions", Status.DONE);
        ArrayList<Task> list = new ArrayList<>();
        list.add(task);
        list.add(task1);
        list.add(task2);
        manager.addTask(task);
        manager.addTask(task1);
        manager.addTask(task2);
        assertEquals(list,manager.getAllTasks());
    }
    @Test
    public void testDeleteAllTasks() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        Task task1 = new Task(2, "name", "descriptions", Status.IN_PROGRESS);
        Task task2 = new Task(3, "name", "descriptions", Status.DONE);
        ArrayList<Task> list = new ArrayList<>();
        manager.addTask(task);
        manager.addTask(task1);
        manager.addTask(task2);
        manager.deleteAllTasks();
        assertEquals(list,manager.getAllTasks());
    }
    @Test
    public void testDeleteAllEpic() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        Epic epic1 = new Epic(2, "name", "descriptions", Status.IN_PROGRESS);
        Epic epic2 = new Epic(3, "name", "descriptions", Status.DONE);
        ArrayList<Epic> list = new ArrayList<>();
        manager.addEpic(epic);
        manager.addEpic(epic1);
        manager.addEpic(epic2);
        manager.deleteAllEpic();
        assertEquals(list,manager.getAllEpic());
    }
    @Test
    public void testDeleteAllSubtask() {
        Subtask subtask = new Subtask(11,1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11,2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11,3, "name", "descriptions", Status.DONE);
        ArrayList<Subtask> list = new ArrayList<>();
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        manager.deleteAllSubtask();
        assertEquals(list,manager.getAllSubtask());
    }
    @Test
    public void testGetByIdTask() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        Task task1 = new Task(2, "name", "descriptions", Status.IN_PROGRESS);
        Task task2 = new Task(3, "name", "descriptions", Status.DONE);
        manager.addTask(task);
        manager.addTask(task1);
        manager.addTask(task2);
        assertEquals(task,manager.getByIdTask(1));
    }
    @Test
    public void testGetByIdEpic() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        Epic epic1 = new Epic(2, "name", "descriptions", Status.IN_PROGRESS);
        Epic epic2 = new Epic(3, "name", "descriptions", Status.DONE);
        manager.addEpic(epic);
        manager.addEpic(epic1);
        manager.addEpic(epic2);
        assertEquals(epic2,manager.getByIdEpic(3));
    }
    @Test
    public void testGetByIdSubtask() {
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11, 2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11, 3, "name", "descriptions", Status.DONE);
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        assertEquals(subtask1,manager.getByIdSubtask(2));
    }
    @Test
    public void testDeleteAnTaskId() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        Task task1 = new Task(2, "name", "descriptions", Status.IN_PROGRESS);
        Task task2 = new Task(3, "name", "descriptions", Status.DONE);
        ArrayList<Task> list = new ArrayList<>();
        list.add(task);
        list.add(task1);
        list.add(task2);
        manager.addTask(task);
        manager.addTask(task1);
        manager.addTask(task2);
        assertEquals(list,manager.getAllTasks());
        list.remove(task1);
        manager.deleteAnTaskId(2);
        assertEquals(list,manager.getAllTasks());
    }
    @Test
    public void testDeleteAnEpicId() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        Epic epic1 = new Epic(2, "name", "descriptions", Status.IN_PROGRESS);
        Epic epic2 = new Epic(3, "name", "descriptions", Status.DONE);
        ArrayList<Epic> list = new ArrayList<>();
        list.add(epic);
        list.add(epic1);
        list.add(epic2);
        manager.addEpic(epic);
        manager.addEpic(epic1);
        manager.addEpic(epic2);
        assertEquals(list,manager.getAllEpic());
        list.remove(epic2);
        manager.deleteAnEpicId(3);
        assertEquals(list,manager.getAllEpic());
    }
    @Test
    public void testDeleteAnSubtaskId() {
        Epic epic = new Epic(11, "name", "descriptions", Status.NEW);
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11, 2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11, 3, "name", "descriptions", Status.DONE);
        ArrayList<Subtask> list = new ArrayList<>();
        list.add(subtask);
        list.add(subtask1);
        list.add(subtask2);
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        assertEquals(list,manager.getAllSubtask());
        list.remove(subtask);
        manager.deleteAnSubtaskId(1);
        assertEquals(list,manager.getAllSubtask());
    }
    @Test
    public void testAddTask() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        ArrayList<Task> list = new ArrayList<>();
        list.add(task);
        manager.addTask(task);
        assertEquals(list.get(0),manager.getAllTasks().get(0));
        assertEquals(list.size(),manager.getAllTasks().size());
    }
    @Test
    public void testAddEpic() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        ArrayList<Epic> list = new ArrayList<>();
        list.add(epic);
        manager.addEpic(epic);
        assertEquals(list.get(0),manager.getAllEpic().get(0));
        assertEquals(list.size(),manager.getAllEpic().size());
    }
    @Test
    public void testAddSubtask() {
        Epic epic = new Epic(11, "name", "descriptions", Status.NEW);
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        ArrayList<Subtask> list = new ArrayList<>();
        list.add(subtask);
        manager.addSubtask(subtask);
        assertEquals(list.get(0),manager.getAllSubtask().get(0));
        assertEquals(list.size(),manager.getAllSubtask().size());
    }
    @Test
    public void testUpdateTheEpic() {
        Epic epic = new Epic(1, "name", "descriptions", Status.NEW);
        Epic epic1 = new Epic(2, "name", "descriptions", Status.IN_PROGRESS);
        Epic epic2 = new Epic(3, "name", "descriptions", Status.DONE);
        ArrayList<Epic> list = new ArrayList<>();
        list.add(epic);
        list.add(epic1);
        list.add(epic2);
        manager.addEpic(epic);
        manager.addEpic(epic1);
        manager.addEpic(epic2);
        assertEquals(list,manager.getAllEpic());
        epic1.setStatus(Status.DONE);
        epic2.setDescriptions("ddescriptions descriptions");
        epic.setName("name name");
        manager.updateTheEpic(epic);
        manager.updateTheEpic(epic1);
        manager.updateTheEpic(epic2);
        ArrayList<Epic> listUpdate = new ArrayList<>();
        listUpdate.add(epic);
        listUpdate.add(epic1);
        listUpdate.add(epic2);
        assertEquals(listUpdate,manager.getAllEpic());
    }
    @Test
    public void testUpdateTheSubtask() {
        Epic epic = new Epic(11, "name", "descriptions", Status.NEW);
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11, 2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11, 3, "name", "descriptions", Status.DONE);
        ArrayList<Subtask> list = new ArrayList<>();
        list.add(subtask);
        list.add(subtask1);
        list.add(subtask2);
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        assertEquals(list,manager.getAllSubtask());
        subtask1.setStatus(Status.DONE);
        subtask2.setDescriptions("ddescriptions descriptions");
        subtask.setName("name name");
        manager.updateTheSubtask(subtask);
        manager.updateTheSubtask(subtask1);
        manager.updateTheSubtask(subtask2);
        ArrayList<Subtask> listUpdate = new ArrayList<>();
        listUpdate.add(subtask);
        listUpdate.add(subtask1);
        listUpdate.add(subtask2);
        assertEquals(listUpdate,manager.getAllSubtask());
    }
    @Test
    public void testUpdateTheTask() {
        Task task = new Task(1, "name", "descriptions", Status.NEW);
        Task task1 = new Task(2, "name", "descriptions", Status.IN_PROGRESS);
        Task task2 = new Task(3, "name", "descriptions", Status.DONE);
        ArrayList<Task> list = new ArrayList<>();
        list.add(task);
        list.add(task1);
        list.add(task2);
        manager.addTask(task);
        manager.addTask(task1);
        manager.addTask(task2);
        assertEquals(list,manager.getAllTasks());
        task1.setStatus(Status.DONE);
        task2.setDescriptions("ddescriptions descriptions");
        task.setName("name name");
        manager.updateTheTask(task);
        manager.updateTheTask(task1);
        manager.updateTheTask(task2);
        ArrayList<Task> listUpdate = new ArrayList<>();
        listUpdate.add(task);
        listUpdate.add(task1);
        listUpdate.add(task2);
        assertEquals(listUpdate,manager.getAllTasks());
    }
    @Test
    public void testGetListAllSubtaskBelongingToEpic() {
        Epic epic = new Epic(11, "name", "descriptions", Status.NEW);
        Subtask subtask = new Subtask(11, 1, "name", "descriptions", Status.NEW);
        Subtask subtask1 = new Subtask(11, 2, "name", "descriptions", Status.IN_PROGRESS);
        Subtask subtask2 = new Subtask(11, 3, "name", "descriptions", Status.DONE);
        ArrayList<Subtask> list = new ArrayList<>();
        list.add(subtask);
        list.add(subtask1);
        list.add(subtask2);
        manager.addSubtask(subtask);
        manager.addSubtask(subtask1);
        manager.addSubtask(subtask2);
        epic.addSubtaskEpic(subtask);
        epic.addSubtaskEpic(subtask1);
        epic.addSubtaskEpic(subtask2);
        assertEquals(list,manager.getListAllSubtaskBelongingToEpic(epic));
    }
}