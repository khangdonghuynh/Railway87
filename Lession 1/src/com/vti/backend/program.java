package com.vti.backend;

import java.util.Date;

public class program {
    public static void main(String arg[]){
    Department department1 = new Department();
    department1.departmentID = 1;
    department1.departmentName = "Phong HR";

    Department department2 = new Department();
    department2.departmentID = 2;
    department2.departmentName = "Phong Marketing";

    Position position1 = new Position();
    position1.positionID = 1;
    position1.positionName = "Nhan su";

    Position position2 = new Position();
    position2.positionID = 2;
    position2.positionName = "Media Marketing";


    User user1 = new User();
    user1.userID = 1;
    user1.fullName = "Huynh Dong Khang";
    user1.email = "dongkhang511@gmail.com";
    user1.departmentID = department1;
    user1.Gender = Gender.MALE;
    user1.dateofBirth = new Date("2024/07/19");


    User user2 = new User();
    user2.userID = 2;
    user2.fullName = "Nguyen Van Anh";
    user2.email = "vananh@gmail.com";
    user2.departmentID = department2;
    user2.Gender = Gender.FEMALE;
    user2.dateofBirth = new Date("2024/07/18");


    System.out.println("************ Thong tin user 1***********");
    System.out.println("userID:" + user1.userID);
    System.out.println("fullname:" + user1.fullName);
    System.out.println("email:" + user1.email);
    System.out.println("departmentID:" + department1.departmentID);
    System.out.println("departmentName:" + department1.departmentName);
    System.out.println("Gender:" + Gender.MALE);
    System.out.println("positionID:" + position1.positionID);
    System.out.println("positionName:" + position1.positionName);
    System.out.println("Date of Birth:" + user1.dateofBirth);

    System.out.println("************ Thong tin user 2***********");
    System.out.println("userID:" + user2.userID);
    System.out.println("fullname:" + user2.fullName);
    System.out.println("email:" + user2.email);
    System.out.println("departmentID:" + department2.departmentID);
    System.out.println("departmentName:" + department2.departmentName);
    System.out.println("Gender:" + Gender.FEMALE);
    System.out.println("positionID:" + position2.positionID);
    System.out.println("positionName:" + position2.positionName);
    System.out.println("Date of Birth:" + user2.dateofBirth);








    }
}
