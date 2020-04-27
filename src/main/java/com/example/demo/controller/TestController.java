package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.vo.KlinePic;
import com.show.api.ShowApiRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Askyi
 */


@Controller
public class TestController {

    @RequestMapping("/")
    public String index(Model model) {

        String res = new ShowApiRequest("http://route.showapi.com/131-52", "167811", "fc4923e58815468891ecfd8c3819fe5c")
                .addTextPara("code", "000001")
                .addTextPara("time", "30")
                .addTextPara("beginDay", "20180625")
                .post();

        String s = res.substring(res.indexOf("["), res.indexOf("]") + 1);
        List<KlinePic> klinePics = JSON.parseArray(s, KlinePic.class);

        for (KlinePic klinePic : klinePics) {
            String time = klinePic.getMinute();
            String y = time.substring(0, 4);
            String m = time.substring(4, 6).replaceAll("0\\d", time.substring(5, 6));
            String d = time.substring(6, 8).replaceAll("0\\d", time.substring(7, 8));
            klinePic.setMinute("\'" + y + "/" + m + "/" + d + "\'");
        }

        String s1 = JSONArray.toJSONString(klinePics).replaceAll("\"", "").replaceAll("[A-Za-z]+:", "");
        String s2 = s1.replace("{", "[").replace("}", "]");

        model.addAttribute("data", s2);

        return "index";
    }


}
