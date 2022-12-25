package number;

public class Demo01 {
    public static void main(String[] args) {
        Boolean b=true;
        boolean a=true;
        Integer c=10;
        c=c+5;
        System.out.println(c);
        int x=10,y=20;
        System.out.println(Math.log(100));
        System.out.println(c.compareTo(20));
        System.out.println(c.equals(20));

        Integer z=10;
        System.out.println(z);
        z=Integer.valueOf(20);
        System.out.println(z);
        z=Integer.valueOf("20",8);//八进制的20转为十进制输出
        System.out.println(z);
        z.toString();
    }
}
