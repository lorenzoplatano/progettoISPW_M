module it.runyourdog.progettoispw {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens it.runyourdog.progettoispw to javafx.fxml;
    exports it.runyourdog.progettoispw;
}