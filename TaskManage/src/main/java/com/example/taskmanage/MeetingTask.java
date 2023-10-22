package com.example.taskmanage;

import java.util.Date;

public class MeetingTask implements Task {

    private String taskName;
    private String taskDescription;

    @Override
    public void setTask(String taskName, String taskDescription) {

    }

    @Override
    public void setTaskName(String taskName) {

    }

    @Override
    public void setTaskDescription(String taskDescription) {

    }

    @Override
    public void markAsComplete() {

    }

    @Override
    public void setPriority(Priority priority) {

    }

    @Override
    public void setDeadline(Date date) {

    }

    @Override
    public String toString() {
        return "Homework: " + this.taskName + " " + this.taskDescription;
    }
}
