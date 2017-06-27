package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import entity.Users;

/**
 * ҳ���� ��¼��ť ��ת�����servlet
 * @author ����
 *
 */
public class LoginAction extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
 
	/**
	 * ��¼���ܵ�ʵ��
	 */
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String method = request.getParameter("method");
		
		if("logout".equals(method)){
			 
		}
		
		if("login".equals(method)){
			
			String userName = request.getParameter("username"); 
			String passWord = request.getParameter("password");
			 
			Users users = new Users();
			users.setUserName(userName);
			users.setPassWord(passWord);
			
			UserDao userDao = new UserDaoImpl();
			
			users = userDao.isLogin(users); 
			
			if(users != null){
				request.getSession().setAttribute("loginUser", users); 
				request.getRequestDispatcher("/servlet/TopicListAction").forward(request, response);
				
			}else{
				response.sendRedirect(request.getContextPath() + "/register.jsp");
			}
		}
	}

}
