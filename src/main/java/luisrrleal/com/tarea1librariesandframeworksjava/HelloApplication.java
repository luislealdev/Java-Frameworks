package luisrrleal.com.tarea1librariesandframeworksjava;

import com.dlsc.formsfx.model.structure.Field;
import com.dlsc.formsfx.model.structure.Form;
import com.dlsc.formsfx.model.structure.Group;
import com.dlsc.formsfx.view.renderer.FormRenderer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //FORMS FX FORM
        Form loginForm = Form.of(
                Group.of(
                        Field.ofStringType("")
                                .label("Username"),
                        Field.ofStringType("")
                                .label("Password")
                                .required("This field can’t be empty")
                )
        ).title("Login");

        //BOOTSTRAPFX BUTTON
        Button button = new Button("Hello BootstrapFX");
        button.getStyleClass().setAll("btn","btn-danger");

        //IKONLI ICON
        Button button2 = new Button("User Account");
        button2.setGraphic(new FontIcon());


        Pane root = new Pane();
        VBox vBox = new VBox();
        HBox hBox = new HBox();
        hBox.getChildren().addAll(button, button2);
        vBox.getChildren().addAll(new FormRenderer(loginForm), hBox);

        root.getChildren().addAll(vBox);


        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}