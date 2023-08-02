module com.devjmestrada.chatfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.devjmestrada.chatfx to javafx.fxml;
    exports com.devjmestrada.chatfx;
}