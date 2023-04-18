package pro07;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private Connection con;
	private common.DB DB = new common.DB();

	public boolean addMember(MemberVO memberVo) {
		try {
			DB.connection();
			con = DB.getDataFactory().getConnection();
			String id = memberVo.getId();
			String pwd = memberVo.getPwd();
			String name = memberVo.getName();
			String email = memberVo.getEmail();

			String query = "INSERT INTO MEMBER (id,pw,name,email) values(?,?,?,?)";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean removeMember(MemberVO memberVo) {
		try {
			DB.connection();
			con = DB.getDataFactory().getConnection();
			String id = memberVo.getId();
			String pwd = memberVo.getPwd();
			String name = memberVo.getName();
			String email = memberVo.getEmail();

			String query = "INSERT INTO MEMBER (id,pw,name,email) values(?,?,?,?)";
			System.out.println(query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<MemberVO> listMembers(String keyword) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			DB.connection();
			con = DB.getDataFactory().getConnection();
			stmt = con.createStatement();
			String query = "SELECT * FROM MEMBER ";
			if (keyword != null && !"".equals(keyword)) {
				query += "WHERE NAME LIKE '%" + keyword + "%' OR ID LIKE '%" + keyword + "%' OR EMAIL LIKE '%" + keyword
						+ "%'";
			}
			System.out.println(query);

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
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
