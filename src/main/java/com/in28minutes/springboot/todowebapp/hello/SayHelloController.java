package com.in28minutes.springboot.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {


    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you doing today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuilder sb =  new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Todo Web Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello! What are you doing today?</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }


    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {

        return "sayHello";
    }


}
