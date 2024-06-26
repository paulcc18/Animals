module org.example.classexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.classexercise to javafx.fxml;
    exports org.example.classexercise;
}