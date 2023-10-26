package com.example.taskmanagement;

import java.util.Date;

public interface Task {
    String getTaskName();
    String getDescription();
    boolean isCompleted();
    void setCompleted(boolean completed);
    String getTaskType(); // You can use this to distinguish between task types
    Priority getPriority();
    Date getDeadline(); // Add the getDeadline method
    void setDeadline(Date date);
}

