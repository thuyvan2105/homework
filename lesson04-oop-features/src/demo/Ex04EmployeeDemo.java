package demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import bean.Director;
import bean.Manager;
import bean.Staff;

/**
 * Nhập dữ liệu gồm 1 Giám đốc, 1 Trưởng phòng, 2 Nhân viên
 * Hiển thị thông tin các nhân sự có trong công ty
 * Tính và in ra mức lương của từng loại nhân sự , biết rằng :
 * Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
 * Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
 * Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 */

public class Ex04EmployeeDemo {
	public static void main(String[] args) {
		Director director = new Director("Nakano Yoshihito", LocalDate.of(1970, 12, 12), 5, 3);
		Manager manager = new Manager("Asanuma Shizuku", LocalDate.of(1980, 5, 26), 2, 50);
		Staff s1 = new Staff("Tran Thuy Van", LocalDate.of(1997, 5, 21), 1, "IT");
		Staff s2 = new Staff("Nguyen Thi Sen", LocalDate.of(1992, 10, 13), 1, "Design");

		System.out.println("----- Salary of each type of employee -----");
		System.out.println("Director --> " + new BigDecimal(director.getSalary()).toPlainString());
		System.out.println("Manager --> " + manager.getSalary());
		System.out.println("Staff 1 --> " + s1.getSalary());
		System.out.println("Staff 2 --> " + s2.getSalary());

	}

}
