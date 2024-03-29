package conn;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnDriver {

	private static DataSource ds;
	// static 초기화: main 메서드보다 선행되어서 실행
    static{
    	// context.xml
        try{
        	InitialContext ctx = new InitialContext();
        	// java:comp/env/[name] 기억해두기!
        	ds = (DataSource) ctx.lookup("java:comp/env/jdbc/javabook");
        } catch(NamingException ex){
            ex.printStackTrace();
        }
    }
    
    // JNDI와 DataSource를 사용해서 Connection을 반환하는 메스드를 정의
    public static Connection getMyConnection() throws SQLException{
        return ds.getConnection();
    }
}
