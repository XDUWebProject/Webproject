package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DianpraiseDao;
import daoImpl.DianpraiseDaoImpl;
import entity.Users;

/**
 * ��ҳ���� ���ް�ť ��ת�����servlet 
 * @author ����
 *
 */
public class DianpraiseAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
 
	
	/**
	 * ���޹���
	 */
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String topicId = request.getParameter("topicId");
		
		HttpSession session = request.getSession();
		Users users = new Users();
		
		if(session != null){
			users = (Users)session.getAttribute("loginUser"); 
			
			DianpraiseDao dianpraiseDao = new DianpraiseDaoImpl();
			dianpraiseDao.dianpraise(users.getUserId(), Integer.parseInt(topicId));
			
			request.getRequestDispatcher("/servlet/TopicListAction").forward(request, response);
		}
		
	}

}
