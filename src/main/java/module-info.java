module luisrrleal.com.tarea1librariesandframeworksjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens luisrrleal.com.tarea1librariesandframeworksjava to javafx.fxml;
    exports luisrrleal.com.tarea1librariesandframeworksjava;
}