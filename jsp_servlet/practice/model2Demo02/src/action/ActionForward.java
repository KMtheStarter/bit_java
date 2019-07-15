package action;

public class ActionForward {
	private String url; // 모델이 수행 후 이동할 View
	private boolean method; // 모델이 수행 후 이동할 방식, false = forwarding 방식
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
