module com.example.taskmanage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.taskmanage to javafx.fxml;
    exports com.example.taskmanage;
}