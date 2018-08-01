package cn.lubing36.accountBook;

import java.security.Provider;
import java.security.Security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountBookController {

	@SuppressWarnings({ "static-method", "nls" })
	@RequestMapping(value = "/accountBook")
	public String home(Model model){
		return "accountBook.page";
	}
	public static void main(String[] args) {
		
		int[] arrays = {32, 43, 23, 13, 5, 7, 12, 3, 9};
		int y =0;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length-i-1; j++) {
				y++;
				if(arrays[j]>arrays[j+1]){
					int temp = arrays[j];
					arrays[j] = arrays[j+1];
					arrays[j+1] = temp;
				}
			}
		}
		System.out.println(y);
//		for(int i =0; i<arrays.length; i++){
//			System.out.println(arrays[i]);
//		}
		
	}

}
