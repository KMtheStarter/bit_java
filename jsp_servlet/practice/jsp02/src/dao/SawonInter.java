/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import dto.SawonDTO;

/**
 *
 * @author bit
 */
public interface SawonInter {
    
    // 입력기능
    public void addSawon(SawonDTO dto);
    // 출력기능
    public List<SawonDTO> getListSawon(String searchValue);
    // 수정
    // 삭제...
}
