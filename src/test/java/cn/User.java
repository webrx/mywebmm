package cn;

import cn.webrx.MyQrTools;

/**
 * <p>功能描述: </p>
 *
 * @author webrx
 * @version 1.0
 * @date 2019-07-31 17:04
 */
public class User {
    public static void main(String[] args) throws Exception {
        String i = "c:/g66.jpg";
        MyQrTools mt = new MyQrTools();
        if(mt.exists(i)){
            System.out.println("有二维码");
        }else{
            System.out.println("没有二维码");
        }
    }
}
