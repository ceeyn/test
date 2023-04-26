package test.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.method.HandlerMethod;
import test.core.annotation.LoginRequired;
import java.io.PrintWriter;
import test.utils.SessionUtil;
import test.entity.User;

public class MVCInterceptor extends HandlerInterceptorAdapter {

	/**
	 * Handler执行之前调用这个方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		if (handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			LoginRequired loginRequired = handlerMethod.getMethodAnnotation(LoginRequired.class);
			if (null == loginRequired) {
				return true;
			}
			// 预请求
            if (RequestMethod.OPTIONS.name().equals(request.getMethod())) {
				return true;
			}
                User user = SessionUtil.getUser(request);
			if (user == null) {
				response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
                response.setHeader("Access-Control-Allow-Methods", "*");
                response.setHeader("Access-Control-Max-Age", "3600");
                response.setHeader("Access-Control-Allow-Credentials", "true");
                response.setContentType("application/json; charset=utf-8");
                response.setCharacterEncoding("utf-8");
                PrintWriter pw = response.getWriter();
                pw.write("{\"code\":" + HttpServletResponse.SC_UNAUTHORIZED + ",\"status\":\"no\",\"msg\":\"无授权访问，请先登录\"}");
                pw.flush();
                pw.close();
                return false;
			}
		}
		return true;
	}

	/**
	 * Handler执行完成之后调用这个方法
	 */
	@Override
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse resp, Object handle, Exception ex)
			throws Exception {
		//System.out.println("出拦截器");
	}

	/**
	 * Handler执行之后，ModelAndView返回之前调用这个方法
	 */
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse resp,
			Object handle, ModelAndView mav) throws Exception {
		//System.out.println("拦截器执行中……");
	}

}
