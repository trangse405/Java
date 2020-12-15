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
		System.out.println("ID\t|\tUser Name\t|\tFull Name\t|\t\tEmail\t\t\t|\tCreate Date");
		System.out.println(
				"============================================================================================================================");
		List<Account> listAccount = new ArrayList<>();

		Account acc1 = new Account(1, "pinz.0510@gmail.com", "pinz.0510", "Trang", 5, 2, new Date("2020/06/24"));
		Account acc2 = new Account(2, "ketoan@gmail.com", "keton.123", "Kế Toán", 6, 3, new Date("2020/06/24"));
		Account acc3 = new Account(3, "dev.1236@gmail.com", "dev.abc987", "Develop", 5, 1, new Date("2020/06/24"));
		Account acc4 = new Account(4, "PM98765@gmail.com", "PM.123456", "Manager", 5, 5, new Date("2020/06/24"));
		Account acc5 = new Account(5, "thuquy@gmail.com", "thuquy.xyz", "Thủ Quỹ", 6, 4, new Date("2020/06/24"));

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
