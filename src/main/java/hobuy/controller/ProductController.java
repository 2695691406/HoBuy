package hobuy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hobuy.service.ProductService;

@Controller
public class ProductController {
	@Value("#{productService}")
	private ProductService productService;

	@RequestMapping(value = "/product.do")
	public String productDetal(int id, HttpServletRequest request) {
		productService.productDetal(id, request);
		return "jsp/Product.jsp";
	}
}
