
class SuperDepartment {
	public static void main(String[] args) {

		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();

		// Administration Department
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());

		// Human Resource Department
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayHoliday());

		// Technical Department
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());

	}

	public String departmentName() {

		return "Super Department";
	}

	public String getTodaysWork() {

		return "No Work as of now";
	}

	public String getWorkDeadline() {

		return "Nil";
	}

	public String isTodayHoliday() {

		return "Today is not a holiday";
	}

}

class AdminDepartment extends SuperDepartment {

	public String departmentName() {

		return "Welcome to Admin Department";
	}

	public String getTodaysWork() {

		return "Complete your documents submission";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

}

 class HrDepartment extends SuperDepartment {

	public String departmentName() {

		return "\nWelcome to HR Department";
	}

	public String getTodaysWork() {

		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

	String doActivity() {

		return "team Lunch";
	}

}

class TechDepartment extends SuperDepartment {

	public String departmentName() {

		return "\nWelcome to Tech Department";
	}

	public String getTodaysWork() {

		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

	public String getTechStackInformation() {

		return "Core Java";
	}

}