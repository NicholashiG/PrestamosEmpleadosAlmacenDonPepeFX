module com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.commons.configuration2;
    requires static lombok;
    requires java.mail;

    exports com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller;
    opens com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.controller to javafx.fxml;
    exports com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services;
    opens com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx.services to javafx.fxml;
    exports com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx;
    opens com.uniquindio.basesuno.prestamosempleadosalmacendonpepefx to javafx.fxml;
}