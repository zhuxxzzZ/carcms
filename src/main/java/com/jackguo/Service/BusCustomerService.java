package com.jackguo.Service;

import com.jackguo.common.Result;
import com.jackguo.entil.BusCustomer;
import com.jackguo.form.CustomerForm;
import com.jackguo.query.BusCustomerQuery;

public interface BusCustomerService{


    Result queryPage(BusCustomerQuery query);

    Result add(CustomerForm customerForm);

    Result update(CustomerForm customerForm);

    Result delete(int id);
}
