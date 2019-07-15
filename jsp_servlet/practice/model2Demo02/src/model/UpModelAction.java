package model;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import action.Action;
import action.ActionForward;

public class UpModelAction implements Action {
	private static final String SAVE_DIR = "uploadsFiles";
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("UpSaveTest");
		
		try {
			update(req, resp);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ActionForward("success.jsp", false);
	}
	
	private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		// ���� ��θ� �����ͼ� File ��ü�� �����Ѵ�.
		String appPath = req.getServletContext().getRealPath("");
		System.out.println("getRealPath: " + appPath);
		// separator: �ü���� ��� ǥ��, /, \
		String savePath = appPath + File.separator + SAVE_DIR;
		System.out.println("savePath: " + savePath);
		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}
		for (Part part: req.getParts()) {
			System.out.println("Part: " + part.getName());
			if (part.getName().equals("file")) { // ���Ͼ��ε�: part ������ �����ͼ� ��
				String fileName = extractFileName(part);
				System.out.println("fileName: " + fileName);
				fileName = new File(fileName).getName();
				part.write(savePath + File.separator + fileName);
			}
		}
	}
	
	private String extractFileName(Part part) {
		// ����
		String contentDisp = part.getHeader("content-disposition");
		System.out.println("contentDisp: " + contentDisp);
		String[] items = contentDisp.split(";");
		for (String s: items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

}
