package com.example.taskmanage;

import com.example.taskmanage.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label selectedText;

    @FXML
    private ListView<Task> listView;

    @FXML
    private TextField taskNameField;

    @FXML
    private TextArea taskDescriptionArea;

    @FXML
    private ChoiceBox<Priority> priorityChoiceBox;

    private ObservableList<Task> tasks = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        listView.setItems(tasks);
    }

    @FXML
    private void addTask() {
        String taskName = taskNameField.getText();
        String taskDescription = taskDescriptionArea.getText();
        Priority priority = priorityChoiceBox.getValue();

        // Create a new task based on user input
        // Add the task to the tasks list
        // Update the ListView
    }

    @FXML
    private void markAsComplete() {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Task selectedTask = listView.getSelectionModel().getSelectedItem();
            selectedTask.markAsComplete();
            listView.getItems().set(selectedIndex, selectedTask);
        }
    }

    @FXML
    private void removeTask() {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            listView.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void onListClicked() {
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            selectedText.setText(listView.getItems().get(selectedIndex).toString());
        }
    }


}
