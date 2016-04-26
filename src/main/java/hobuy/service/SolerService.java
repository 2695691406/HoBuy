package hobuy.service;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.EncryptUtils;
import hobuy.domain.Soler;
import hobuy.domain.Soler_property;
import hobuy.domain.University;
import hobuy.domain.UniversityPK;
import hobuy.domain.dao.SolerDao;
import hobuy.domain.dao.UniversityDao;

@Service("solerService")
public class SolerService {

	@Autowired
	private SolerDao solerDaoImpl;
	@Autowired
	private UniversityDao universityDaoImpl;

	public void solerCenter(HttpServletRequest request) {

	}

	/**
	 * 检查注册信息数据
	 * 
	 * @param soler
	 * @return
	 */
	public boolean checkRegistData(Integer unid, Soler soler, HttpServletRequest request) {
		request.setAttribute("soler", soler);
		if (!Pattern.matches("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$",
				soler.getEmail().trim())) {
			request.setAttribute("emailmsg", "邮箱格式错误！");
			return false;
		} else if (!Pattern.matches("[A-Za-z0-9\u4e00-\u9fa5\\s]{1,16}", soler.getName().trim())) {
			request.setAttribute("namemsg", "名字不能为空！");
			return false;
		} else if (!Pattern.matches("^[1][358]{1}[0-9]{9}", soler.getPhone().trim())) {
			request.setAttribute("phonemsg", "手机号格式不正确！");
			return false;
		} else if (!Pattern.matches("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}", soler.getPwd())) {
			request.setAttribute("pwdmsg", "密码格式不正确！");
			return false;
		} else if (!Pattern.matches("[0-9]{1,4}", unid + "")) {
			request.setAttribute("universitymsg", "大学数据非法！");
			return false;
		} else if (!Pattern.matches("[01]{1}", soler.getArrage() + "")) {
			request.setAttribute("arragemsg", "请同意协议！");
			return false;
		}

		List<Soler> solers = solerDaoImpl.findByPhone(soler.getPhone());
		if (solers != null && solers.size() > 0) {
			request.setAttribute("phonemsg", "手机号已经存在");
			return false;
		}
		University university = universityDaoImpl.load(new UniversityPK(unid));
		if (university == null) {
			request.setAttribute("universitymsg", "大学不存在");
			return false;
		}
		soler.setUniversity(university);
		soler.setPwd(new EncryptUtils().MD5(soler.getPwd()));
		soler.setCreatetime(new Date());
		soler.setAuthentication(0);
		Long sid = (Long) solerDaoImpl.save(soler);
		soler.setId(sid);
		Soler_property property = new Soler_property();
		property.setName("无");
		property.setSoler(soler);

		request.getSession().setAttribute("soler", soler);
		request.removeAttribute("soler");
		return true;
	}

	/**
	 * get方法获得注册页面
	 * 
	 * @param request
	 */
	public void registGet(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<University> universities = universityDaoImpl.getUniversityList();
		request.setAttribute("universities", universities);
	}

	/**
	 * 检查登陆信息数据
	 * 
	 * @param soler
	 * @return
	 */
	public boolean checkLoginData(Soler soler, HttpServletRequest request) {
		request.setAttribute("soler", soler);
		if (!Pattern.matches("^[1][358]{1}[0-9]{9}", soler.getPhone().trim())) {
			request.setAttribute("solerloginmsg", "用户输入错误！");
			return false;
		} else if (!Pattern.matches("(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,30}", soler.getPwd())) {
			request.setAttribute("solerloginmsg", "密码输入错误！");
			return false;
		}
		List<Soler> solers = solerDaoImpl.findByPhone(soler.getPhone());
		if (solers == null || solers.size() < 1) {
			System.out.println("用户不存在！");
			request.setAttribute("solerloginmsg", "用户不存在！");
			return false;
		}
		System.out.println("用户存在！");
		Soler solerRL = solers.get(0);
		try {
			System.out.println(new EncryptUtils().MD5(soler.getPwd()));
			System.out.println(solerRL.getPwd());
			if (solerRL.getPwd().equals(new EncryptUtils().MD5(soler.getPwd()))) {
				System.out.println("匹配正确！");
				request.removeAttribute("soler");
				System.out.println(solerRL);
				request.getSession().setAttribute("soler", solerRL);
				return true;
			} else {
				System.out.println("密码不正确！");
				request.setAttribute("solerloginmsg", "密码不正确");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("solerloginmsg", "用户或密码不正确");
		return false;
	}

	public boolean forgetUserPwdPost(String phone, String pwd, HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Soler> list = solerDaoImpl.findByPhone(phone);
		if (list.isEmpty()) {
			request.setAttribute("msg", "密码修改失败");
			return false;
		} else {
			Soler soler = list.get(0);
			EncryptUtils utils = new EncryptUtils();
			soler.setPwd(utils.MD5(pwd));
			solerDaoImpl.update(soler);
			request.getSession().removeAttribute(phone);
			request.setAttribute("msg", "密码修改成功");
			return true;
		}
	}
}
