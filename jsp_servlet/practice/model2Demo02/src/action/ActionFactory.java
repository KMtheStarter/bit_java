package action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ActionFactory {
	private static ActionFactory factory;
	private Properties prop;
	public static synchronized ActionFactory getFactory() {
		if (factory == null) factory = new ActionFactory();
		return factory;
	}
	public ActionFactory() {
		prop = new Properties();
	}
	public Action getAction(String cmd) {
		Action action = null;
		String path = "C:\\Users\\bit\\Documents\\km\\java_servlet\\jsp_servlet\\practice\\model2Demo02\\src\\controller\\classinfo.properties";
		try {
			prop.load(new FileInputStream(path));
			System.out.println("key: " + prop.getProperty("index"));
			String rPath = prop.getProperty(cmd);
			System.out.println("kk: " + rPath);
			if (rPath == null) {
				cmd = "index"; // cmd���� properties�� Ű ��
				rPath = prop.getProperty(cmd);
			}
			// Ű ������ ������ Ŭ������ ��θ� ����ؼ� ��ü�� ����
			Class<Action> handlerClass = (Class<Action>) Class.forName(rPath);
			action = handlerClass.newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}
}
