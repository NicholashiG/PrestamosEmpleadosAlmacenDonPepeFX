module com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.commons.configuration2;


    opens com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx to javafx.fxml;
    exports com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx;
    exports com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;
    opens com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller to javafx.fxml;
}