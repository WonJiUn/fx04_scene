package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		//어제 했던거랑은 달리 두개로 나눠서 작성(load를 따로함->loader안에 있는 컨트롤러 객체를 얻어오기 위함)
		Parent root = loader.load();	//root == 앵커팬 을 로드하면서 컨트롤러가 만들어짐
		Scene scene = new Scene(root);
		
		Controller ctl = loader.getController();
		//eventTest.fxml 에서 설정한 컨트롤러 클래스파일을 객체화함
		ctl.setRoot(root);	//fxml 파일 자체를 컨트롤러 파일에 넘겨줌
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
