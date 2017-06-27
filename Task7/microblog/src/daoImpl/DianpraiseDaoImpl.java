package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DianpraiseDao;
import db.BaseDao;

public class DianpraiseDaoImpl extends BaseDao implements DianpraiseDao {

	/**
	 * ��ѯ���û��Ƿ��Ѿ����ޣ�������޹��ˣ���likeMe����ɾ��˵˵��topic�����û��ĵ��޹�ϵ�ٵ��һ�Σ���ȡ������
	 * ��û�е��ޣ���
	 * 
	 */
	
	public void dianpraise(int userId,int topicId) {
		Connection conn  = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			conn = super.getConn();
			pst = conn.prepareStatement("select like_id from likeMe where like_userId = ? and like_topicId = ?");
			pst.setInt(1, userId); 
			pst.setInt(2, topicId);
			
			rs = pst.executeQuery();
			int likeId;
			if(rs.next()){
				likeId = rs.getInt(1);
			}else{
				likeId = 0;
			}
			 
			if(likeId != 0){ 
				pst = conn.prepareStatement("delete from likeMe where like_id = ?");
				pst.setInt(1, likeId);
				pst.executeUpdate(); 
				
			}else{
				pst = conn.prepareStatement("insert into likeMe values(null,?,?)");
				pst.setInt(1, topicId);
				pst.setInt(2, userId);
				pst.executeUpdate(); 
			} 
			
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally{
			super.close(conn, pst, rs);
		}
		
		

	}

}
