package com.jackguo.Web;


import com.jackguo.Service.BusReturnService;
import com.jackguo.common.Result;
import com.jackguo.form.ReturnForm;
import com.jackguo.query.BusReturnQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class BusReturnController {

    @Autowired
    private BusReturnService busReturnService;

    @RequestMapping("/add.do")
    public Object add(ReturnForm returnForm){
       Result result= busReturnService.add(returnForm);

        return result;


    }


    @RequestMapping("/page.do")
    public Object page(BusReturnQuery query){
        Result result= busReturnService.queryPage(query);

        return result;


    }

}
