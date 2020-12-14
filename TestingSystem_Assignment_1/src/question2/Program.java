package question2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import question1.entity.Account;
import question1.entity.Department;
import question1.entity.Position;
import question1.entity.PositionName;

public class Program {
	public static void main(String[] args) {

		List<Department> listDepartment = new ArrayList<Department>();
		// department
		Department department1 = new Department();
		department1.setDepartmentID(1);
		department1.setDepartmentName("Sale");
		Department department2 = new Department();
		department2.setDepartmentID(2);
		department2.setDepartmentName("Marketing");
		Department department4 = new Department();
		department4.setDepartmentID(4);
		department4.setDepartmentName("Human resouces");
		Department department6 = new Department();
		department6.setDepartmentID(6);
		department6.setDepartmentName("Finance");
		Department department3 = new Department();
		department3.setDepartmentID(3);
		department3.setDepartmentName("Security");
		Department department5 = new Department();
		department5.setDepartmentID(5);
		department5.setDepartmentName("Technical");

		System.out.println("============Department===========");
		System.out.println("\tID\t|\tName\t");
		System.out.println("=================================");
		listDepartment.add(department1);
		listDepartment.add(department2);
		listDepartment.add(department3);
		listDepartment.add(department4);
		listDepartment.add(department5);
		listDepartment.add(department6);
		for (Department department : listDepartment) {
			System.out.println(department);
		}
		System.out.println("=================================");
		System.out.println();
		System.out.println("=============Position============");
		System.out.println("\tID\t|\tName\t");
		System.out.println("=================================");
		List<Position> listPoisition = new ArrayList<>();
		Position poisition1 = new Position();
		poisition1.setpositionID(1);
		poisition1.setPositionName(PositionName.Dev);
		Position poisition2 = new Position();
		poisition2.setpositionID(2);
		poisition2.setPositionName(PositionName.Scrum_Master);
		Position poisition3 = new Position();
		poisition3.setpositionID(3);
		poisition3.setPositionName(PositionName.PM);
		listPoisition.add(poisition1);
		listPoisition.add(poisition2);
		listPoisition.add(poisition3);
		for (Position position : listPoisition) {
			System.out.println(position);
		}
		System.out.println("=================================");
		System.out.println();
		System.out.println(
				"==========================================================Account===========================================================");
		System.out.println("ID\t|\tUser Name\t|\tFull Name\t|\tEmail\t\t\t|\tCreate Date");
		System.out.println(
				"============================================================================================================================");
		List<Account> listAccount = new ArrayList<>();

		Account acc1 = new Account();
		acc1.setAccountID(1);
		acc1.setUserName("pinz.0510");
		acc1.setFullName("Trang");
		acc1.setEmail("pinz.0510@gmail.com");
		acc1.setCreateDate(new Date("2020/06/24"));
		acc1.setDepartmentID(5);
		acc1.setPositionID(2);
		Account acc2 = new Account();
		acc2.setAccountID(2);
		acc2.setUserName("keton.123456");
		acc2.setFullName("Kế Toán");
		acc2.setEmail("ketoan@gmail.com");
		acc2.setCreateDate(new Date("2020/06/24"));
		acc2.setDepartmentID(6);
		acc2.setPositionID(3);
		Account acc3 = new Account();
		acc3.setAccountID(3);
		acc3.setUserName("dev.abc987");
		acc3.setFullName("Develop");
		acc3.setEmail("dev.1236@gmail.com");
		acc3.setCreateDate(new Date("2020/06/24"));
		acc3.setDepartmentID(5);
		acc3.setPositionID(1);
		Account acc4 = new Account();
		acc4.setAccountID(4);
		acc4.setUserName("PM.123456");
		acc4.setFullName("Manager");
		acc4.setEmail("PM98765@gmail.com");
		acc4.setCreateDate(new Date("2020/06/24"));
		acc4.setDepartmentID(5);
		acc4.setPositionID(5);
		Account acc5 = new Account();
		acc5.setAccountID(1);
		acc5.setUserName("thuquy.xyz");
		acc5.setFullName("Thủ Quỹ");
		acc5.setEmail("thuquy@gmail.com");
		acc5.setCreateDate(new Date("2020/06/24"));
		acc5.setDepartmentID(6);
		acc5.setPositionID(4);

		listAccount.add(acc1);
		listAccount.add(acc2);
		listAccount.add(acc3);
		listAccount.add(acc4);
		listAccount.add(acc5);
		for (Account account : listAccount) {
			System.out.println(account);
		}

		System.out.println(
				"============================================================================================================================");
	}
}
