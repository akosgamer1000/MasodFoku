module hu.petrik_13e.masodfoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik_13e.masodfoku to javafx.fxml;
    exports hu.petrik_13e.masodfoku;
}