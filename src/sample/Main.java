package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    public Button btn1 = new Button();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Adam's Playlist Application");

        btn1.setText("Click to create new LinkedList");
        btn1.setOnAction(this::handle);
        StackPane layout1 = new StackPane();
        layout1.getChildren().add(btn1);
        primaryStage.setScene(new Scene(layout1, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == btn1){
            Song wakeUp = new Song("Wake up", "Arcade Fire", 4.3, 2005);
            SimpleLinkedList s1 = new SimpleLinkedList();
            s1.insertSong(s1, wakeUp);

            s1.printList(s1);
        }
    }
}
