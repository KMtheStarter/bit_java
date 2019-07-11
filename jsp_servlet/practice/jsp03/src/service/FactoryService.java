package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {

	private static SqlSessionFactory factory;
	private FactoryService() {}
	static {
		// config/config.xml�� read
		try (Reader reader =
				Resources.getResourceAsReader("config/config.xml");){
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Ŭ���̾�Ʈ�� ���� SqlSessionFactory�� ��ȯ�ϴ� �޼��带 ����
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
