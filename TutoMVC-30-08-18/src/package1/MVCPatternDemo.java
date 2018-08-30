package package1;

public class MVCPatternDemo {

	public static void main(String[] args) {

		Student model = retriveStudentFromDatabase();

		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update model data

		controller.setStudentName("Pierre");

		controller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Hamed");
		student.setRollNo("10");
		return student;
	}

}
