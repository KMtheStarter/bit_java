package dao;

import java.sql.SQLException;
import java.util.List;

import dto.MyMemberDTO;

public interface MemberInter {
	public List<MyMemberDTO> getListMember(String searchValue) throws SQLException;
	public void addMember(MyMemberDTO vo) throws SQLException;
}
