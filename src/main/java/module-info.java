module com.example.kafkaproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.kafkaproject to javafx.fxml;
    exports com.example.kafkaproject;
}