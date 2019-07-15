package action;

public class ActionForward {
	private String url; // ���� ���� �� �̵��� View
	private boolean method; // ���� ���� �� �̵��� ���, false = forwarding ���
	public ActionForward(String url, boolean method) {
		this.url = url;
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public boolean isMethod() {
		return method;
	}
	
}
