package com.jackguo.common;


//业务码和业务消息枚举
//定义前端消息的返回值类型
public enum CodeMsg  {

    SUCCESS(200,"操作成功"),
    ERROR(110,"这真不是我能解决的了"),
    USER_NOT_HAVE_SOME_PERMISSION(4002002,"用户权限不足"),
    USER_UPDATE_PASSWORD_ERROR(4002003,"初始密码错误，无法找到密码"),
    USER_PASSWORD_ERROR(4001001,"用户名或者密码错误"),
    USER_LOGIN_NAME_EXIST_ERROR(4001002,"用户登录名已经存在"),
    USER_PHONE_EXIST_ERROR(4001003,"手机号已经存在"),
    USER_IDCARD_EXIST_ERROR(4001004,"身份证号已经存在"),
    CUSTOMER_NAME_EXIST_ERROR(4001005,"用户姓名已经存在"),
    CAR_UPLOAD_IMG_ERROR(4003001,"图片上传失败"),
    CAR_NUM_ERROR (4003002,"车牌号已经存在"),
    RENT_CAR_RENT_ERROR(4003004,"车辆已经出租"),
    CURTOMER_RENT_ERROR(4003003,"出租用户名不存在"),
    RETURN_CAR_ERROR(4003006,"车辆已经返还，请不要重复还车"),
    RETURN_RENT_ERROR(40030007,"返还车辆失败"),
    RENT_FAILD_STATE_ERROR(4003005,"车辆出组失败，车辆信息发上来变化"),
    RETURN_FAILD_CAR_CHANGE_ERROR(40030008,"车辆状态修改失败");

    public Integer code; //业务码
        public String msg; //业务消息

        CodeMsg(Integer code,String msg){
            this.code=code;
            this.msg=msg;

        }
}
