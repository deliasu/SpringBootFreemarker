package net.csdcodes.controller;

import net.csdcodes.utils.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author csdcodes.net
 */
@Controller
@RequestMapping("/ftl")
public class FreeMarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    private String index(ModelMap map){
        map.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("/users")
    public String  center(ModelMap map){
        map.put("users",parseUsers());
        map.put("title","users table");
        return "freemarker/users";
    }

    private List<Map> parseUsers(){
        List<Map> list= new ArrayList();
        for(int i=0;i<10;i++){
            Map map= new HashMap();
            map.put("id", i+1);
            map.put("name","csdcodes_" + i);
            map.put("age",12+i);
            map.put("address","Street_" + i);
            map.put("phone","77646464" + i);
            list.add(map);
        }
        return list;
    }

}
