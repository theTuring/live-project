package com.back_end.utils;

/**
 * @author 会飞的大野鸡
 * @create 2020/3/15
 * TODO:
 */

//正则表达式检测身份证号码和手机号
public class Rex {
    private static String cardId = "^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$";
    private static String tel = "\\d{3}-\\d{8}|\\d{4}-\\{7,8}";

    public  Boolean checkCardId(String cardIda) {
        if(cardIda.length()!=18) {
            return false;
        }
        if(!cardIda.matches(tel)) {
            return false;
        }
        return true;
    }

    public  boolean checkTel(String tela) {
        if (tela.length() != 11) {
            return false;
        }
        if (!tela.matches(tel)){
            return false;
        }
        return true;
    }
}
