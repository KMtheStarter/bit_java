package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.ConnDriver;
import dto.MyMemberDTO;

public class MemberDAO implements MemberInter{

	private static MemberDAO dao;
	
	public synchronized static MemberDAO getDao() {
		if (dao == null) dao = new MemberDAO();
		return dao;
	}
	
	@Override
	public void addMember(MyMemberDTO vo) throws SQLException {
		
		Connection con = ConnDriver.getMyConnection();
		PreparedStatement pstm = null;
		
		String sql = "insert into mymember values (mymember_seq.nextVal, ?, ?, ?, sysdate)";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, vo.getId());
		pstm.setString(2, vo.getPwd());
		pstm.setString(3, vo.getName());
		pstm.executeUpdate();
		
		if (pstm != null) pstm = null;
		if (con != null) con = null;
	}

	@Override
	public List<MyMemberDTO> getListMember(String searchValue) throws SQLException {
		
		Connection con = ConnDriver.getMyConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		List<MyMemberDTO> list = new ArrayList<MyMemberDTO>();
		
		String sql = "select id, name, edate from mymember where name like ? order by 1";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, "%" + searchValue + "%");
		rs = pstm.executeQuery();
		
		while (rs.next()) {
			MyMemberDTO dto = new MyMemberDTO();
			dto.setId(rs.getString("id"));
			dto.setName(rs.getString("name"));
			dto.setEdate(rs.getString("edate"));
			list.add(dto);
		}
		
		if (rs != null) rs = null;
		if (pstm != null) pstm = null;
		if (con != null) con = null;
		
		return list;
	}

	
}
