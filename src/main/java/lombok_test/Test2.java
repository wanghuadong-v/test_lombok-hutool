package lombok_test;


import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Console.log("caolili");
        int a = 1;
//aStr为"1"
        String aStr = Convert.toStr(a);

        long[] b = {1,2,3,4,5};
//bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);
        System.out.println(bStr);
        String ab= "2017-05-06";
        Date value = Convert.toDate(ab);
        System.out.println(value);


    }
}
