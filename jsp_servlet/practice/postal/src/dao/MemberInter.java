package dao;

import java.util.List;

import dto.MemberDTO;

public interface MemberInter {

	public void addMember(MemberDTO dto);
	public int getIdCount(String id);
	public List<MemberDTO> listMember();
	public MemberDTO searchMember(String name);
}
