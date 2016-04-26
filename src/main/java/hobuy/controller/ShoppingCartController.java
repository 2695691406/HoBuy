package hobuy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
	@RequestMapping("/mycart.do")
	public String getCart(HttpServletRequest request) {

		return "";
	}
}
