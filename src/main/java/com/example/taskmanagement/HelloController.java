package com.example.taskmanagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private ListView<Task> listView;
    ObservableList<Task> tasks = FXCollections.observableArrayList();

    public void initialize() {
        // Initialize the ListView
        listView.setItems(tasks);
    }

    @FXML
    private TextField inputName;

    @FXML
    private TextField inputDesc;

    @FXML
    private Label label;

    @FXML
    private ToggleGroup taskTypeGroup;


    @FXML
    protected void onListViewSelected(){
        int i = listView.getSelectionModel().getSelectedIndex();
        label.setText(""+i);

        HomeworkTask ht = (HomeworkTask) tasks.get(i);

        inputName.setText(ht.getTaskName());
        inputDesc.setText(ht.getDescription());


    }



//    @FXML
//    protected void onSaveButtonClick(){
//        HomeworkTask ht = new HomeworkTask();
//        ht.createTask(inputName.getText(), inputDesc.getText());
//        tasks.add(ht);
//    }
@FXML
protected void onSaveButtonClick(){
    Task selectedTask = null;
    RadioButton selectedRadioButton = (RadioButton) taskTypeGroup.getSelectedToggle();

    if (selectedRadioButton != null) {
        String selectedTaskType = selectedRadioButton.getText();

        if (selectedTaskType.equals("Homework")) {
            HomeworkTask ht = new HomeworkTask();
            ht.setTask(inputName.getText(), inputDesc.getText());
            selectedTask = ht;
        } else if (selectedTaskType.equals("Meeting")) {
            MeetingTask mt = new MeetingTask();
            mt.setTask(inputName.getText(), inputDesc.getText());
            selectedTask = mt;
        } else if (selectedTaskType.equals("Shopping")) {
            ShoppingTask st = new ShoppingTask();
            st.setTask(inputName.getText(), inputDesc.getText());
            selectedTask = st;
        }
    }

    if (selectedTask != null) {
        tasks.add(selectedTask);
    }
}



}