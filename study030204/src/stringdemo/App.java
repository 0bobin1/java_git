package stringdemo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean flag = true;
        StringBuffer stringBuffer = new StringBuffer();
        while (flag) {
            Menu.menu();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入学生信息(格式:姓名;年级;学校;年龄;性别;电话)");
                    String s = sc.next();
                    stringBuffer.append(addInfo(s));
                    System.out.println(stringBuffer);
                    break;
                case 2:
                    updateInfo(stringBuffer);
                    System.out.println(stringBuffer);
                    break;
                case 3:
                    deleteInfo(stringBuffer);
                    System.out.println(stringBuffer);
                    break;
                default:
                    System.out.println("没有这个选项！");
            }
        }

    }

    //信息添加
    public static String addInfo(String student) {
        String[] arr = student.split(";");
       /* for(String s: arr){
            System.out.println(s);
        }*/
        Student s = new Student();
        s.setName(arr[0]);
        s.setGrade(arr[1]);
        s.setSchool(arr[2]);
        s.setAge(arr[3]);
        s.setSex(arr[4]);
        s.setPhone(arr[5]);
        //System.out.println(s.toString());
        return s.toString();
    }


    //信息修改
    public static void updateInfo(StringBuffer stringBuffer) {
        System.out.println("以修改学校为例");

        int schoolIndexStart = stringBuffer.indexOf("school='");

        int schoolIndexEnd = stringBuffer.indexOf("', age=");

        System.out.println("请输入要修改的学校名");
        Scanner sc = new Scanner(System.in);

        stringBuffer.replace(schoolIndexStart + 8, schoolIndexEnd, sc.next());

    }


    //信息删除
    public static void deleteInfo(StringBuffer stringBuffer) {
        System.out.println("以删除学校为例");

        int schoolIndexStart = stringBuffer.indexOf("school='");

        int schoolIndexEnd = stringBuffer.indexOf("', age=");
        //删除学校为例
        stringBuffer.delete(schoolIndexStart + 8, schoolIndexEnd);

    }

}
