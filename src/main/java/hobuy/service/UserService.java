package hobuy.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.EncryptUtils;
import hobuy.domain.University;
import hobuy.domain.UniversityPK;
import hobuy.domain.User;
import hobuy.domain.dao.UniversityDao;
import hobuy.domain.dao.UserDao;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDaoImpl;
	@Autowired
	private UniversityDao universityDaoImpl;

	/**
	 * 检查注册信息数据
	 * 
	 * @param user
	 * @return
	 */
	public boolean checkRegistData(Integer unid, String checknumber, User user, HttpServletRequest request) {
		String checkcode = (String) request.getSession().getAttribute(user.getPhone());
		if (checkcode == null || !checkcode.equals(checknumber)) {
			request.setAttribute("checknumbermsg", "验证码错误！");
			return false;
		}
		request.setAttribute("user", user);
		if (!Pattern.matches("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$",
				user.getEmail().trim())) {
			request.setAttribute("emailmsg", "邮箱格式错误！");
			return false;
		} else if (!Pattern.matches("[A-Za-z0-9\u4e00-\u9fa5\\s]{1,16}", user.getName().trim())) {
			request.setAttribute("namemsg", "名字不能为空！");
			return false;
		} else if (!Pattern.matches("^[1][358]{1}[0-9]{9}", user.getPhone().trim())) {
			request.setAttribute("phonemsg", "手机号格式不正确！");
			return false;
		} else if (!Pattern.matches("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}", user.getPwd())) {
			request.setAttribute("pwdmsg", "密码格式不正确！");
			return false;
		} else if (!Pattern.matches("[0-9]{1,4}", unid + "")) {
			request.setAttribute("universitymsg", "大学数据非法！");
			return false;
		} else if (!Pattern.matches("[01]{1}", user.getArrage() + "")) {
			request.setAttribute("arragemsg", "请同意协议！");
			return false;
		}

		List<User> users = userDaoImpl.findByPhone(user.getPhone());
		if (users != null && users.size() > 0) {
			request.setAttribute("phonemsg", "手机号已经存在");
			return false;
		}
		University university = universityDaoImpl.load(new UniversityPK(unid));
		if (university == null) {
			request.setAttribute("universitymsg", "大学不存在");
			return false;
		}
		user.setUniversity(university);
		user.setPwd(new EncryptUtils().MD5(user.getPwd()));
		user.setCreatetime(new Date());
		user.setAuthentication(0);
		Long id = (Long) userDaoImpl.save(user);

		request.getSession().setAttribute("user", user);
		request.getSession().removeAttribute("checkPhone");
		request.removeAttribute("user");
		return true;
	}

	/**
	 * 检查登陆信息数据
	 * 
	 * @param user
	 * @return
	 */
	public boolean checkLoginData(User user, HttpServletRequest request) {
		request.setAttribute("user", user);
		if (!Pattern.matches("^[1][358]{1}[0-9]{9}", user.getPhone().trim())) {
			request.setAttribute("loginmsg", "用户输入错误！");
			return false;
		} else if (!Pattern.matches("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}", user.getPwd())) {
			request.setAttribute("loginmsg", "密码输入错误！");
			return false;
		}
		List<User> users = userDaoImpl.findByPhone(user.getPhone());
		if (users == null || users.size() < 1) {
			System.out.println("用户不存在！");
			request.setAttribute("loginmsg", "用户不存在！");
			return false;
		}
		System.out.println("用户存在！");
		User userRL = users.get(0);
		try {
			System.out.println(new EncryptUtils().MD5(user.getPwd()));
			System.out.println(userRL.getPwd());
			if (userRL.getPwd().equals(new EncryptUtils().MD5(user.getPwd()))) {
				System.out.println("匹配正确！");
				request.removeAttribute("user");
				request.getSession().setAttribute("user", userRL);
				return true;
			} else {
				System.out.println("密码不正确！");
				request.setAttribute("loginmsg", "密码不正确");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("loginmsg", "用户或密码不正确");
		return false;
	}

	@Test
	public void test() throws Exception {
		System.err.println(Pattern.matches(
				"^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$", "hahah@163.com"));
		MessageDigest digest = MessageDigest.getInstance("MD5");
		digest.digest("wadsds".getBytes());
		byte[] md5Byte = digest.digest();
		BigInteger bigInteger = new BigInteger(1, md5Byte);
		String pwd = bigInteger.toString(16);
		pwd = pwd + pwd.substring(11, 13);
		System.out.println(pwd);
		System.out.println(new EncryptUtils().MD5("abc"));
		System.out.println(new EncryptUtils().MD5("ab2c"));

	}

	public Boolean checkEmail(String email, HttpServletRequest request) {
		List<User> users = userDaoImpl.findByEmail(email);
		if (users == null || users.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean forgetUserPwdPost(String phone, String pwd, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<User> list = userDaoImpl.findByPhone(phone);
		if (list.isEmpty()) {
			request.setAttribute("msg", "密码修改失败");
			return false;
		} else {
			User user = list.get(0);
			EncryptUtils utils = new EncryptUtils();
			user.setPwd(utils.MD5(pwd));
			userDaoImpl.update(user);
			request.getSession().removeAttribute(phone);
			request.setAttribute("msg", "密码修改成功");
			return true;
		}
	}

	public void registGet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<University> universities = universityDaoImpl.getUniversityList();
		request.setAttribute("universities", universities);
	}

}
