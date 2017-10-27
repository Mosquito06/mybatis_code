package kr.or.dgit.mybatis_code.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory SqlSessionFactory;

	public static SqlSessionFactory getSqlsessionfactory() {
		if(SqlSessionFactory == null) {
			try (InputStream is = Resources.getResourceAsStream("mybatis-config.xml");){
				SqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("mybatis 설정 확인 요망");
				throw new RuntimeException(e.getCause());
			}
		}
		return SqlSessionFactory;
	}
	
	public static SqlSession openSession() {
		return SqlSessionFactory.openSession();
	}
	
}
