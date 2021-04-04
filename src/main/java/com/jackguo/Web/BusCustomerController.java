package com.jackguo.Web;


import com.jackguo.Service.BusCustomerService;
import com.jackguo.common.Result;
import com.jackguo.common.validator.ValidatorUtil;
import com.jackguo.form.CustomerForm;
import com.jackguo.form.SysUserForm;
import com.jackguo.query.BusCustomerQuery;
import com.jackguo.query.SysUserQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "客户管理数据接口")
@RestController
@RequestMapping("/customer")
public class BusCustomerController {

    @Autowired
    private BusCustomerService busCustomerService;

    @ApiOperation("分页查询数据")
    @RequestMapping("/page.do")
    public Object page(BusCustomerQuery query){
        Result result = busCustomerService.queryPage(query);
        return  result;


    }

    @ApiOperation("客户新增数据")
    @RequestMapping("/add.do")
    public Object add(CustomerForm customerForm){
        ValidatorUtil.validator(customerForm);
        Result result = busCustomerService.add(customerForm);
        return  result;


    }

    @ApiOperation("修改客户数据")
    @RequestMapping("/update.do")
    public Object update(CustomerForm customerForm){
        ValidatorUtil.validator(customerForm);
        Result result = busCustomerService.update(customerForm);
        return  result;


    }

    @ApiOperation("修改客户数据")
    @RequestMapping("/delete.do")
    public Object delete(int id){
        ValidatorUtil.validator(id);
        Result result = busCustomerService.delete(id);
        return  result;


    }

}
