package com.jackguo.form;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class ReturnForm {

    /**
     * 还车记录ID
     */
    private Integer id;

    /**
     * 车牌号
     */

    @NotEmpty(message = "车牌号不能为空")
    @Length(min = 7,max = 8,message = "车牌号7~8位")
    private String num;

    /**
     * 出租记录ID
     */

    @NotNull(message = "出租记录ID不能为空")
    private Integer rentId;

    /**
     * 还车时间
     */
    @NotEmpty(message = "还车时间不能为空")
    private String returnTime;

    /**
     * 租金
     */
    private Integer rentPrice;

    /**
     * 赔付金额
     */
    @NotNull(message = "赔付金额不能为空")
    @Min(value = 0,message = "赔付金额最少0")
    private Integer payMoney;

    /**
     * 问题
     */
    private String problem;

    /**
     * 总金额
     */
    private Integer totalMoney;

    /**
     * 业务员ID
     */
    private Integer userId;


}


