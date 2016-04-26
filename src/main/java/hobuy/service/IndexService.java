package hobuy.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.api.alidayu.PhoneMessage;
import hobuy.domain.Clazz;
import hobuy.domain.ClazzPK;
import hobuy.domain.Product;
import hobuy.domain.dao.ClazzDao;
import hobuy.domain.dao.ProductDao;
import hobuy.domain.dao.SolerDao;
import hobuy.domain.dao.UserDao;

@Service("indexService")
public class IndexService {
	@Autowired
	ProductDao productDaoImpl;
	@Autowired
	ClazzDao clazzDaoImpl;
	@Autowired
	private UserDao userDaoImpl;
	@Autowired
	private SolerDao solerDaoImpl;

	public void indexData(HttpServletRequest request) {

		Clazz clazz = clazzDaoImpl.load(new ClazzPK(1));
		List<Product> products = productDaoImpl.findByClazz(clazz, 0, 5);
	}

	public void showIndex(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Clazz clazz2 = clazzDaoImpl.load(new ClazzPK(2));
		Clazz clazz3 = clazzDaoImpl.load(new ClazzPK(3));
		Clazz clazz6 = clazzDaoImpl.load(new ClazzPK(6));
		Clazz clazz11 = clazzDaoImpl.load(new ClazzPK(11));
		Clazz clazz14 = clazzDaoImpl.load(new ClazzPK(14));
		List<Product> products = productDaoImpl.findByClazz(clazz2, 0, 8);
		List<Product> phones = productDaoImpl.findByClazz(clazz3, 0, 8);
		List<Product> foods = productDaoImpl.findByClazz(clazz6, 0, 8);
		List<Product> mzs = productDaoImpl.findByClazz(clazz11, 0, 8);
		List<Product> olds = productDaoImpl.findByClazz(clazz14, 0, 8);
		request.setAttribute("products", products);
		request.setAttribute("mzs", mzs);
		request.setAttribute("olds", olds);
		request.setAttribute("phones", phones);
		request.setAttribute("foods", foods);
	}

	public Boolean checkPhone(String phone, HttpServletRequest request) {
		String refer = request.getHeader("Referer");
		List list = null;
		if (refer != null && refer.contains("soler")) {
			list = solerDaoImpl.findByPhone(phone);
		} else if (refer != null && refer.contains("user")) {
			list = userDaoImpl.findByPhone(phone);
		} else {
			return true;
		}
		if (list == null || list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean phoneMessage(String phone, HttpServletRequest request) {
		PhoneMessage messageutil = new PhoneMessage();
		String code = null;
		try {
			code = messageutil.randomNumber(4);
			if (messageutil.registMessage(phone, code)) {
				System.out.println(code);
				request.getSession().setAttribute(phone, code);
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

}
