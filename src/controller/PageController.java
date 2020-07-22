package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("page")
@Controller
public class PageController {
    @RequestMapping(value = "{pageName1}/{pageName2}", method = RequestMethod.GET)

    public ModelAndView toPage(@PathVariable("pageName1") String pageName1,@PathVariable("pageName2") String pageName2) {

        ModelAndView mv = new ModelAndView(pageName1+"/"+pageName2);

        return mv;

    }

    @RequestMapping(value = "{pageName1}", method = RequestMethod.GET)
    public ModelAndView toPage(@PathVariable("pageName1") String pageName1) {

        ModelAndView mv = new ModelAndView(pageName1);
        return mv;

    }

}
