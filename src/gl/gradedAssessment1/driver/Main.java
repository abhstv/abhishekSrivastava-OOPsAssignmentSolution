package gl.gradedAssessment1.driver;

import gl.gradedAssessment1.adminDept.AdminDepartment;
import gl.gradedAssessment1.hrDept.HrDepartment;
import gl.gradedAssessment1.techDept.TechDepartment;

public class Main {

    public static void main(String[] args) {
		AdminDepartment admin1 = new AdminDepartment();
		HrDepartment hr1 = new HrDepartment();
		TechDepartment techie1 = new TechDepartment();

		System.out.println(admin1.departmentName());
		System.out.println(admin1.getTodaysWork());
		System.out.println(admin1.getWorkDeadline());
		System.out.println(admin1.isTodayAHoliday());
		System.out.println();
		System.out.println(hr1.departmentName());
		System.out.println(hr1.doActivity());
		System.out.println(hr1.getTodaysWork());
		System.out.println(hr1.getWorkDeadline());
		System.out.println(hr1.isTodayAHoliday());
		System.out.println();	
		System.out.println(techie1.departmentName());
		System.out.println(techie1.getTodaysWork());
		System.out.println(techie1.getWorkDeadline());
		System.out.println(techie1.getTechStackInformation());
		System.out.println(techie1.isTodayAHoliday());

	}
    
}
