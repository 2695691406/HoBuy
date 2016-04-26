package hobuy.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.coreseek.hobuy.ProductSphinx;
import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.dao.ProductDao;

@Service("searchService")
public class SearchService {
	@Autowired
	private ProductDao productDaoImpl;

	public void search(String word, HttpServletRequest request) {
		// 使用：sphinx技術
		ProductSphinx productSphinx = new ProductSphinx();
		List<Product> products = new ArrayList<Product>();
		try {
			List<Long> list = productSphinx.query(word, 0, 30);
			for (Long pid : list) {
				Product product = productDaoImpl.load(new ProductPK(pid));
				products.add(product);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("products", products);
	}
}
