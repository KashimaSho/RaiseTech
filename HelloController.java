package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*HTMLファイルを表示するために使うアノテーション
 * templeteにあるindex.htmlが呼び出される
 */
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "index";
	}
}
