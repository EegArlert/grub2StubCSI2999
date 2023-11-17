module com.example.copy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.copy to javafx.fxml;
    exports com.example.copy;
}