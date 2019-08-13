package com.ydw.subsystem.constant;

/**
 * @ClassName: YongyouConstant
 * @Description: 交易类型 ：
 * @Author 胡科
 * @Date 2019-08-13 10:24
 * @Version 1.0
 */
public enum YongyouConstant {
    /**
     * @Author hu_ke
     * @Description 退保证金{含利息
     * @Param
     * @return
     **/

    REDRPTTYPE("1", "退保证金{含利息}"),
    /**
     * @Author hu_ke
     * @Description 付财政转价款和交易服务费
     * @Param
     * @return
     **/

    TRADE("2", "付财政转价款和交易服务费"),
    /**
     * @Author hu_ke
     * @Description 罚没保证金
     * @Param
     * @return
     **/

    FINEDEPOSIT("3", "罚没保证金 "),

    /**
     * @Author hu_ke
     * @Description 交易服务费
     * @Param
     * @return
     **/

    TRANSERVICE("4", "交易服务费"),
    /**
     * @Author hu_ke
     * @Description 开票
     * @Param
     * @return
     **/

    OPENTICKET("5", "开票");


    private String code;
    private String message;


    YongyouConstant(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }}
