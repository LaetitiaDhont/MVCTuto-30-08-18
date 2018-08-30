package package1;

public class MVCPatternDemo {

	
	public static void main(String[] args) {

		// R�cup�rer les infos de l'�tudiant comme si on avait qu'un seul �tudiant dans
		// notre BDD.
		// Ici on simule notre BDD
		
		// model est un objet de type Student

		Student model = retriveStudentFromDatabase();
		
		// view est un objet de type StudentView on simule la partie view du pc

		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update model data

		controller.setStudentName("Pierre");
		
		System.out.println("name :" + model.getName());

		controller.updateView();

	}

	// Cette m�thode sert � simuler la BDD
	
	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Hamed");
		student.setRollNo("10");
		return student;
	}

}
