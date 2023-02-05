public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("真丝羊毛白色休闲西装外套女高级感小个子春秋新款2022设计感小众");
        stringBuffer.replace(27, 35, "...");
        System.out.println(stringBuffer);
    }
}
