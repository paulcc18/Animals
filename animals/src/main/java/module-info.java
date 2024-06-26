module org.example.animals {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.animals to javafx.fxml;
    exports org.example.animals;
}