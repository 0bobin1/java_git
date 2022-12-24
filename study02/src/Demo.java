public class Demo {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";

        /* Java 增强 for 循环
        Java5 引入了一种主要用于数组的增强型 for 循环。

        Java 增强 for 循环语法格式如下:

        for(声明语句 : 表达式)
        {
           //代码句子
        }*/
        for (String s : str) {
            System.out.print(s+" ");
            if(s=="3"){
                System.out.println("开始执行break");
                break;
            }
        }

        int b=0;
        while(b<=2){
            for (String s : str) {
                System.out.print(s+" ");
                if(s=="3"){
                    System.out.println("开始执行continue");
                    continue;
                }else{
                    System.out.println(s+" ");
                }
            }
            b+=1;
        }

        System.out.println("for循环结束");
        System.out.println(str);
    }


}
