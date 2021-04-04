package com.jackguo.Dao;

import com.jackguo.form.CustomerForm;
import com.jackguo.query.BusCustomerQuery;
import com.jackguo.vo.BusCustomerVo;

import java.util.List;

public interface BusCustomerMapper {


    List<BusCustomerVo> selectList(BusCustomerQuery query);

    BusCustomerVo selectCustomerByNameOrPhoneOrIdCard(BusCustomerQuery query);

    void insert(CustomerForm customerForm);

    void update(CustomerForm customerForm);

    void delete(int id);
}