package package1;

/*
 * We are going to create a Student object acting as a model.StudentView will be a view class which can print student details on console and StudentController is the controller class responsible to store data in Student object and update view StudentView accordingly.

MVCPatternDemo, our demo class, will use StudentController to demonstrate use of MVC pattern.
 */
public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
