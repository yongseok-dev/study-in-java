package pro07;

import java.common.DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private Statement stmt;
	private Connection con;
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			common.DB DB = new common.DB();
			DB.connDB();
			stmt = DB.getStatement();
			String query = "SELECT * FROM MEMBER ";
			System.out.println(query);
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getString("ID");
				String pwd = rs.getString("PW");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Date joinDate = rs.getDate("JOIN_DATE");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
