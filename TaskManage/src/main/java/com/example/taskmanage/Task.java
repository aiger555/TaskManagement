package com.example.taskmanage;

import com.example.taskmanage.Priority;

import java.util.Date;

public interface Task {
    void setTask(String taskName, String taskDescription);
    void setTaskName(String taskName);
    void setTaskDescription(String taskDescription);
    void markAsComplete();
    void setPriority(Priority priority);
    void setDeadline(Date date);
}

