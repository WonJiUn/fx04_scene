package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import ex01.loginService.LoginServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	//@FXML TextField fxId; 	//어제 했던방식
	private Parent root;	//오늘 방식
	private LoginServiceImpl funcClass = new LoginServiceImpl();
	
	public void setRoot(Parent root) {
		this.root = root;	//메인에서 넘겨받은 컨트롤러 파일을 자기 자신에게 넣음
		//fxml = 메인 에 있는것과 같은정보를 가지게 되므로 그 안에있는 버튼 등의 제어권도 가질 수 있음
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	//씬빌더에서 로그인버튼 액션에 LoginProc을 연결해놓음
	public void LoginProc() {
		//System.out.println("로그인 버튼 클릭");
		//TextField t = (TextField)root.lookup("#fxId");
		//fxml 텍스트필드에 있는 값을 가져옴
		//PasswordField p = (PasswordField)root.lookup("#fxPwd");
		
		//System.out.println(t.getText());
		//System.out.println("어노테이션 사용 : " + fxId.getText());
		//두 방식의 다른점 : 컨트롤러는 연결만 시켜주는 역할이어야 한다.
		//하지만 어노테이션(@FXML) 방식으로 값을 얻어오는것은 씬빌더에서 지정해준 컨트롤러 클래스에서만 사용가능
		//즉, 씬빌더와 연결되어 있지 않은 타 클래스에서 값을 사용하기 위해서는 이 방식으로 사용하는 것이 좋음
		//값이 많아질수록 앵커팬(root)자체를 다른 클래스로 넘겨주는게 더 편해짐
		
		funcClass.LoginProc(root);
	}
	public void CancelProc() {
		funcClass.CancelProc(root);
	}
	public void OpenMembershipForm() {
		funcClass.OpenMembershipForm();
	}
	
}
