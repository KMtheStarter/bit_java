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
		// config/config.xml을 read
		try (Reader reader =
				Resources.getResourceAsReader("config/config.xml");){
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 클라이언트가 사용될 SqlSessionFactory를 반환하는 메서드를 정의
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
