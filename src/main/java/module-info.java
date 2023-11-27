module com.example.snakeladdernov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladdernov to javafx.fxml;
    exports com.example.snakeladdernov;
}