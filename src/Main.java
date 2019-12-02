import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;





public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setResizable(false);

            BorderPane root = new BorderPane();
            Scene scene = new Scene(root,1920,1080);

            Image stein7 = new Image(getClass().getResource("/Stein_7.png").toExternalForm(),200,0,true,false);
            ImageView stein7_V = new ImageView(stein7);
            Image stein10 = new Image(getClass().getResource("/Stein_10.png").toExternalForm(),200,0,true,false);
            ImageView stein10_V = new ImageView(stein10);
            Image stein27 = new Image(getClass().getResource("/Stein_27.png").toExternalForm(),200,0,true,false);
            ImageView stein27_V = new ImageView(stein27);
            Image stein39 = new Image(getClass().getResource("/Stein_39.png").toExternalForm(),200,0,true,false);
            ImageView stein39_V = new ImageView(stein39);










            root.setStyle("-fx-background-color: green");
            root.setPadding(new Insets(50));

            BorderPane spielFeld = new BorderPane();
            spielFeld.setStyle("-fx-background-color: blue");


            BorderPane feldL = new BorderPane();
            feldL.setStyle("-fx-background-color: grey");

            VBox steine = new VBox();
            steine.getChildren().addAll(stein7_V,stein10_V,stein27_V,stein39_V);
            steine.setPadding(new Insets(50));
            steine.setSpacing(20);

            VBox aktueler_stein = new VBox();
            aktueler_stein.setPrefSize(100,100);
            aktueler_stein.setStyle("-fx-background-color: red");

            BorderPane spielFeld_M = new BorderPane();
            spielFeld.setStyle("-fx-background-color: blue");
            spielFeld_M.setPadding(new Insets(50));

            GridPane reich = new GridPane();
            reich.setStyle("-fx-background-color: pink");


            BorderPane feldR = new BorderPane();
            feldR.setStyle("-fx-background-color: grey");
            feldR.setPadding(new Insets(10));


            //ToolBar t = new ToolBar(new Button("M"), new Button("S"),new Button("X"));
            //irgendwas schmeist ne exeption

            VBox reiche = new VBox();
            reiche.setSpacing(20);
            reiche.setAlignment(Pos.CENTER);

            GridPane reich_k1 = new GridPane();
            reich_k1.setPrefSize(100,100);
            reich_k1.setStyle("-fx-background-color: pink");
            GridPane reich_k2 = new GridPane();
            reich_k2.setPrefSize(100,100);
            reich_k2.setStyle("-fx-background-color: pink");
            GridPane reich_k3 = new GridPane();
            reich_k3.setPrefSize(100,100);
            reich_k3.setStyle("-fx-background-color: pink");




            feldL.setTop(steine);
            feldL.setBottom(aktueler_stein);
            spielFeld.setLeft(feldL);

            spielFeld_M.setCenter(reich);
            spielFeld.setCenter(spielFeld_M);


            reiche.getChildren().addAll(reich_k1,reich_k2,reich_k3);
            feldR.setCenter(reiche);
            //feldR.setTop(t);
            spielFeld.setRight(feldR);


            root.setCenter(spielFeld);


            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
