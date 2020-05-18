package com.example.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @auther David
 * @date 2020/5/18 23:29
 * @Version 1.0
 */
@RestController("HelloController")
public class HelloController {

    //访问 http://localhost:8080/hello,
    //返回 Hello World!到网页
   @RequestMapping("/hello1")
    private String helloWorldTest1(){
       return "Hello World Test1!";
   }

   //关于RequestMapping, 里面有很多的参数, 需要研究
   //http://localhost:8080/hello2, 返回Hello World Test2!到前端
   @ResponseBody
   @RequestMapping(path="/hello2",name="mapping1",method={RequestMethod.GET,RequestMethod.POST})
   private String helloWorldTest2(){
       return "Hello World Test2!";
   }

    //http://localhost:8080/hello3,
    //返回json形式的数据到前端, {"result":"Hello World Test3!"}
    @ResponseBody
    @RequestMapping(path="/hello3",name="mapping1",method={RequestMethod.GET,RequestMethod.POST})
    private HashMap helloWorldTest3(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("result", "Hello World Test3!");
        return map;
    }

}
