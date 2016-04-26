package hobuy.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hobuy.service.SearchService;

@Controller
public class SearchController {
	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/search.do")
	public String search(String word, HttpServletRequest request) {
		try {
			word = new String(word.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		searchService.search(word, request);
		return "jsp/Search.jsp";
	}
}
