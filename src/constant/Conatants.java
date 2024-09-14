package constant;

public class Conatants {

	public Conatants() {
		// TODO Auto-generated constructor stub
	}
	public enum ELoginDialog {
		width("300"),
		height("200"),
		nameLabel("회원가입"),
		sizeNameText("10"),
		passwordLabel("비밀번호"),
		sizePasswordText("10"),
		okButtonLabel("ok"),
		cancelButtonLabel("cancel"),
		loginFailed("로그인에 실패하셨습니다.");
		
		private String text;
		private ELoginDialog(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

}
