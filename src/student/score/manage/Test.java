package student.score.manage;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "1";
		ScoreList studentScoreList = new ScoreList();
		System.out.println("**********学生成绩管理系统********");
		while(choice.equals("0") == false) {
			System.out.println("1.查看学生成绩单");
			System.out.println("2.添加学生成绩记录");
			System.out.println("3.修改学生成绩记录");
			System.out.println("4.删除学生成绩记录");
			System.out.println("5.查看某位学生成绩记录");
			System.out.println("6.统计这门课平均分、最高分和最低分");
			System.out.println("7.按成绩从高往低排序，并输出");
			System.out.println("0.退出程序");
			System.out.print("Enter your choice: ");
			choice = input.next();
	    	
			switch(choice) {
			    case "0": 
			    	System.out.println("谢谢您的使用，欢迎下次光临！\n" + "**********按任意键结束程序**********"); 
			        break;
			    
			    case "1":
			    	studentScoreList.transcript();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
			    case "2":
			    	int i = 1;
			    	do {
			    	studentScoreList.add();
			    	System.out.println("\n是否继续添加？" + "\n" + "0.否" + "\n" + "1.是");
			    	i = input.nextInt();
			    	}while(i == 1);
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
			    	
			    case "3": 
			    	studentScoreList.recompose();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
			    case "4":
			    	studentScoreList.delete();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
			    case "5":
			    	studentScoreList.inquire();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
			    case "6":
			    	studentScoreList.average();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
			    case "7":
			    	studentScoreList.sort();
			    	studentScoreList.transcript();
			    	System.out.println("请问您还需要什么服务？\n");
			    	break;
				
				default: 
					System.out.println("Invalid input! Please enter again."); 
				    break;
			}
			
		}
	}

}
