package hobuy.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hobuy.domain.Product;
import hobuy.domain.ProductPK;
import hobuy.domain.dao.ProductDao;

@Service("productService")
public class ProductService {
	@Autowired
	private ProductDao productDaoImpl;

	public void productDetal(int id, HttpServletRequest request) {
		Product product = productDaoImpl.load(new ProductPK(id));
		request.setAttribute("product", product);
	}
}
