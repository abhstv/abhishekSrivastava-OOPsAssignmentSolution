package gl.gradedAssessment1.adminDept;

import gl.gradedAssessment1.superDept.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
    
    public String departmentName(){
		return "Welcome to Admin Department";
	}
	public String getTodaysWork(){
		return "Complete your documents submission";
	}
	public String getWorkDeadline(){
		return "Complete by EOD";
	}

}