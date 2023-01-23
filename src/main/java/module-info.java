module com.example.issplayground {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.issplayground to javafx.fxml;
    exports com.example.issplayground;
}