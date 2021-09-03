package ex01.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService {
	public void LoginProc(Parent root) {
		TextField t = (TextField)root.lookup("#fxId");
		PasswordField p = (PasswordField)root.lookup("#fxPwd");
		System.out.println("아이디 : " + t.getText());
		System.out.println("비밀번호 : " + p.getText());
	};
	public void CancelProc(Parent root) {
		TextField t = (TextField)root.lookup("#fxId");
		PasswordField p = (PasswordField)root.lookup("#fxPwd");
		t.clear();
		p.clear();
		t.requestFocus();
		
	};
	public void OpenMembershipForm() {
		System.out.println("회원가입 버튼이 눌렸습니다");
	};
}
