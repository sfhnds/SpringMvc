package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import pojo.User;

import javax.servlet.http.HttpSession;
import javax.sound.midi.SoundbankResource;

//标示为SpringMVC的控制器
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Model model) {
        if (username.equals("admin") && password.equals("admin")) {
            model.addAttribute("username", username);
            return "welcome";
        } else {
            model.addAttribute("username", username);
            return "register";
        }
    }
//    public String login(User user, Model model, HttpSession session) {
//        System.out.println(user.getUserName());
//        if ("qqqqq".equals(user.getUserName())
//                && "wwwww".equals(user.getPassword())) {
//            return "welcome";
//        }
//        model.addAttribute("msg", "用户名或密码错误！ ");
//        return "register";
//    }
}