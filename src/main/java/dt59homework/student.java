/**
 * Project Name:lession1
 * File Name:student.java
 * Package Name:lession4
 * Date:2017年12月24日上午11:14:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 上午11:14:07 <br/>
 * 
 * @author 57745
 * @version
 * @see
 */
public class student {
    public static void main(String[] args) {
        studentinfo student;
        student = new studentinfo();
        student.name = "张三";
        student.height = 172;
        student.age = 120;
        System.out.println("学生的名字：" + student.name + "\n" + "身高：" + student.height + "cm" + "\n" + "体重：" + student.age);

        System.out.println();

        studentinfo student2;
        student2 = new studentinfo();
        student2.name = "李四";
        student2.height = 140;
        student2.age = 280;
        System.out.println("学生的名字：" + student2.name + "\n" + "身高：" + student2.height + "cm" + "\n" + "体重："
                + student2.age);

        System.out.println();
        student.grade();
        System.out.println("他的学号是" + student.number());
        System.out.println("他在班级的职位是" + student.post());
    }

}