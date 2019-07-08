/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bit
 */
public class HomeworkImple implements HomeworkInter {

    private static HomeworkImple homeworkDAO;

    public synchronized static HomeworkImple getHomeworkDAO() {
        if (homeworkDAO == null) {
            homeworkDAO = new HomeworkImple();
        }
        return homeworkDAO;
    }

    @Override
    public List<SawonDTO> getFirst() {
        String sql = "select deptno, saname, sahire, sysdate, trunc(to_char(sysdate - sahire + 1), 0) as worked from sawon";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<SawonDTO> list = new ArrayList<>();

        try {
            con = conn.ConnDriver.getMyConnection();
            System.out.println("연결성공: " + con);
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                // deptno, saname, sahire, sysdate, worked
                SawonDTO vo = new SawonDTO();
                vo.setDeptno(rs.getInt("deptno"));
                vo.setSaname(rs.getString("saname"));
                vo.setSahire(rs.getString("sahire"));
                vo.setEtc1(rs.getString("sysdate"));
                vo.setEtc2(rs.getString("worked"));
                list.add(vo);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return list;
    }

    @Override
    public List<SawonDTO> getSecond() {
        String sql = "select saname, sahire, next_day(sahire+60, '월') as next_mon from sawon";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<SawonDTO> list = new ArrayList<>();

        try {
            con = conn.ConnDriver.getMyConnection();
            System.out.println("연결성공: " + con);
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                // deptno, saname, sahire, sysdate, worked
                SawonDTO vo = new SawonDTO();
                vo.setSaname(rs.getString("saname"));
                vo.setSahire(rs.getString("sahire"));
                vo.setEtc1(rs.getString("next_mon"));
                list.add(vo);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return list;
    }

}
