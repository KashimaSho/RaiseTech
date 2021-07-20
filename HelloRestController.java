package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*サーバから必要なデータを取得するためのコントローラ
 * RESTではHTMLを使わず，テキストのみを送信する
 */
public class HelloRestController {
	@RequestMapping("/")
	/*indexというメソッドが一つだけ用意されている
	 * URLを設定してサーバにアクセスがあればindexを呼び出す
	 */
	public String index() {
		return "Hello World!";
	}



	@RequestMapping("/{num}")
	/*http://localhost:8080/{num}
	 * numの値によって表示される値が異なる.@PathValueでパスを引数とすることができる
	 */
	public String sum(@PathVariable int num) {
		long res = 1;
		for (int i=1; i<=num; i++) {
			res = res*2;
		}
		return "total:"+res;
	}
}


