public class Test {
    public static void main(String[] args) {

        String username = "zhangsan";
        String password = "88888888";

        loginUser(username, password);

    }

    public static int loginUser(String username, String password) {
        String RUsername = "zhangsan";
        String RPassword = "123456";

        if (username.equals(username) && password.equals(RPassword)) {
            System.out.println("登录成功");
            return 1;
        } else {
            System.out.println("登录失败，请检查用户名和密码");
            return 0;
        }
    }
}
