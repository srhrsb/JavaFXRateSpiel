module com.brh.javafxratespiel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.brh.javafxratespiel to javafx.fxml;
    exports com.brh.javafxratespiel;
}