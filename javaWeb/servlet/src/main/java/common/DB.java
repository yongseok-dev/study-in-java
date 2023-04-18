package common;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DB {
	private DataSource dataFactory;
	
	public void connection() {
		try {
			
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jbdc/oracle");
			
			
			System.out.println("Oracle driver loading success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public DataSource getDataFactory() {
		return dataFactory;
	}
}
