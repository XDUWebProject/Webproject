package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;
import daoImpl.RegisterDaoImpl;
import entity.Users;

/**
 * ҳ���� ע�ᰴť ��ת�����servlet
 * @author ����
 *
 */
public class RegisterAction extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
 
	
	/**
	 * ע�Ṧ�ܵ�ʵ��
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String niceName = request.getParameter("nicename");
		
		Users users = new Users();
		users.setNiceName(niceName);
		users.setPassWord(passWord);
		users.setUserName(userName);
		
		RegisterDao registerDao = new RegisterDaoImpl();
		
		boolean register = registerDao.isRegister(users);
		
		if(register == true){
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}else{
			response.sendRedirect(request.getContextPath() + "/register.jsp");
		}
		
		
	}

}
