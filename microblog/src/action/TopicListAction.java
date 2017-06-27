package action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TopicListDao;
import daoImpl.TopicListDaoImpl;
import entity.Topic;
import entity.Users;


/**
 * ��¼֮����ת��΢����ҳ����������΢����ѯ��servlet
 * @author ����
 *
 */
public class TopicListAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
 
	/**
	 * ΢����ҳ�������ֵ��ѯ�ķ���
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		  
		TopicListDao topicListDao = new TopicListDaoImpl(); 
		List<Topic> meAndAllFriendTopic = topicListDao.getMeAndAllFriendTopic(); 
		
		request.setAttribute("meAndAllFriendTopic", meAndAllFriendTopic);
		
		request.getRequestDispatcher("/main.jsp").forward(request, response);
		
			 
	}

}
