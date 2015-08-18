package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	public int k = 10;
	public String mappedvalue;

	
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    
    
    @ModelAttribute("mappedvalue")
	public String mappedvalue(){
    	k = k + 2;
    	mappedvalue = Integer.toString(k);
		return mappedvalue;
	}   
}