package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {

    //Buttons
    Button _sweKey;
    Button _japKey;

    //Flags
    Group _flagOfJapan = new Group();
    StackPane _flagOfSweden = new StackPane();

    //Define all main GUI elements
    HBox _buttonBox = new HBox();
    Group _root = new Group(buttons());
    Scene _mainScene = new Scene(_root, 300, 200);
    Stage _window;

    @Override
    public void start(Stage window) throws Exception {
        _window = window;

        generateFlags();

        _window.setScene(_mainScene);

        _window.show();
    }

    private void generateFlags() {
        sweden();
        japan();
    }

    private HBox buttons(){
        _sweKey = new Button("Sweden");
        _sweKey.setOnAction(this);

        _japKey = new Button("Japan");
        _japKey.setOnAction(this);

        _buttonBox.getChildren().addAll(_sweKey);

        return _buttonBox;
    }

    private void japan() {
        Circle circle = new Circle(150,100,75, Color.RED);

        _flagOfJapan.getChildren().add(circle);

        _mainScene.setFill(Color.WHITE);
    }

    private void sweden() {
        Rectangle horizontalLine = new Rectangle(50, 200, Color.YELLOW);
        Rectangle vericalLine = new Rectangle(300, 50, Color.YELLOW);

        _flagOfSweden.getChildren().addAll(horizontalLine, vericalLine);

        _mainScene.setFill(Color.BLUE);
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if (actionEvent.getSource() == _sweKey) {
            if (!_buttonBox.getChildren().contains(_flagOfJapan)){
                _buttonBox.getChildren().add(_flagOfSweden);
                return;
            }

            _buttonBox.getChildren().remove(_flagOfJapan);
            _buttonBox.getChildren().add(_flagOfSweden);
            return;
        }

        if (actionEvent.getSource() == _japKey) {
            if (!_buttonBox.getChildren().contains(_flagOfSweden)){
                _buttonBox.getChildren().add(_flagOfJapan);
                return;
            }

            _buttonBox.getChildren().remove(_flagOfSweden);
            _buttonBox.getChildren().add(_flagOfJapan);
            return;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
