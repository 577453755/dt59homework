/**
 * Project Name:lession1
 * File Name:student.java
 * Package Name:lession4
 * Date:2017��12��24������11:14:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lession4;

/**
 * Description: <br/>
 * Date: 2017��12��24�� ����11:14:07 <br/>
 * 
 * @author 57745
 * @version
 * @see
 */
public class student {
    public static void main(String[] args) {
        studentinfo student;
        student = new studentinfo();
        student.name = "����";
        student.height = 172;
        student.age = 120;
        System.out.println("ѧ�������֣�" + student.name + "\n" + "��ߣ�" + student.height + "cm" + "\n" + "���أ�" + student.age);

        System.out.println();

        studentinfo student2;
        student2 = new studentinfo();
        student2.name = "����";
        student2.height = 140;
        student2.age = 280;
        System.out.println("ѧ�������֣�" + student2.name + "\n" + "��ߣ�" + student2.height + "cm" + "\n" + "���أ�"
                + student2.age);

        System.out.println();
        student.grade();
        System.out.println("����ѧ����" + student.number());
        System.out.println("���ڰ༶��ְλ��" + student.post());
    }

}