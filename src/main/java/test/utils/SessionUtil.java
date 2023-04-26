package test.utils;
import test.entity.User;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName SessionUtil
 * @Author zrx
 * @Date 2021/7/20 10:10
 */
public class SessionUtil {

	private static final String SESSION_USER_TOKEN_KEY = "token";

	/**
	 * 登录
	 * @param user
	 * @param request
	 */
    public static void onLogin(User user, HttpServletRequest request) {
		request.getSession().setAttribute(SESSION_USER_TOKEN_KEY, user);
	}

	/**
	 * 退出
	 * @param request
	 */
    public static void logOut(HttpServletRequest request) {
		request.getSession().removeAttribute(SESSION_USER_TOKEN_KEY);
		request.getSession().invalidate();
	}

	/**
	 * 获取当前用户
	 * @param request
	 * @return
	 */
    public static User getUser(HttpServletRequest request) {
		return (User) request.getSession().getAttribute(SESSION_USER_TOKEN_KEY);
	}
}

