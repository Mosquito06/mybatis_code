package kr.or.dgit.mybatis_code;

import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_code.util.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionTest {
	private static SqlSession sqlSession;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		sqlSession = MyBatisSqlSessionFactory.openSession();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		sqlSession = null;
	}

	@Test
	public void test() {
		Assert.assertNotNull(sqlSession);
	}


}
