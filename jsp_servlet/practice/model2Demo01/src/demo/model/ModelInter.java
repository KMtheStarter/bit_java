package demo.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ModelInter {

	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
