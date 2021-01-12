package cn.edu.hcnu.ui;


import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServericeImpl;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  //创建sc对象，接受键盘的输入
        while (true) {
            System.out.println("请输入相应的数字进行操作：");

            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，推出系统");

            int choice = sc.nextInt();  //对象sc调用nestInt方法

            if (choice == 1) {
                String id = UUID.randomUUID().toString();  //生成随机id，作为数据库的主键

                System.out.println("请输入航班编号");
                String flightid = sc.next();  //调用对象fligthid的方法
                System.out.print("请输入机型：");
                String planeType = sc.next();
                System.out.print("请输入座位数：");
                int currentSeatsNum = sc.nextInt();
                System.out.print("请输入起飞机场：");
                String departureAirPort = sc.next();
                System.out.print("请输入目的机场：");
                String destinationAirPort = sc.next();
                System.out.print("请输入起飞时间：");
                String departureTime = sc.next();

                //Flight类

                Flight flight = new Flight(id,flightid, planeType, departureAirPort
                        , departureTime);   //调用Flight中方法
                IFlightService iFlightService =new FlightServericeImpl();
                IFlightService.insertFlight(flight);

            }
        }
        }
    }
