package question2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import question1.entity.Account;
import question1.entity.Department;
import question1.entity.Position;
import question1.entity.enumValue.PositionName;

public class Program {
	public static void main(String[] args) {

		System.out.println("============Department===========");
		System.out.println("\tID\t|\tName\t");
		System.out.println("=================================");
		List<Department> listDepartment = new ArrayList<Department>();
		// department
		Department department1 = new Department(1, "Sale");
		Department department2 = new Department(2, "Marketing");
		Department department3 = new Department(3, "Security");
		Department department4 = new Department(4, "Human resouces");
		Department department5 = new Department(5, "Technical");
		Department department6 = new Department(6, "Finance");
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
		Position poisition1 = new Position(1, PositionName.Dev);
		Position poisition2 = new Position(2, PositionName.Scrum_Master);
		Position poisition3 = new Position(3, PositionName.PM);
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
		System.out.println("ID\t|\tUser Name\t|\tFull Name\t|\t\tEmail\t\t|\t\tCreate Date");
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
