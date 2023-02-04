public class Demo {
    public static void main(String[] args) {
        String name = "zhangsan";
        String str1 = new String("lisi");

        //String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建

        String str = "HelloWorld";
        System.out.println(str.length());

        String s6 = "hel";
        String s7 = "lo";
        String result = s6.concat(s7);
        System.out.println(result);

        String s8 = "wo" + "rld";
        System.out.println(s8);
    }
}
