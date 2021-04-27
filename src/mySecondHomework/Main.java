package mySecondHomework;

public class Main {

	public static void main(String[] args) {
	
		Category category = new Category(1, "Kurslarým");
		
		Category categoryInstance = new Category();
		categoryInstance.id =2;
		categoryInstance.name="Tüm Kurslar";
		
		Category categoryInstance2 = new Category();
		categoryInstance2.id =3;
		categoryInstance2.name="Kampa Hazýrlýk";
		
		Category categoryInstance3 = new Category();
		categoryInstance3.id =4;
		categoryInstance3.name="Sýk Sorulan Sorular";
		
		Category[] categories = {category,categoryInstance,categoryInstance2,categoryInstance3};
		
		for(Category catgory : categories) {
			System.out.println(catgory.id  +" " + catgory.name);
		}
		
		System.out.println("-------------------------------------------");
		
		Course course = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)","Engin Demiroð",37);
		Course courseJava = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð",18);
		
		Course[] courses = {course,courseJava};
		
		for(Course courseArray : courses ) {
			System.out.println(courseArray.id);
			System.out.println(courseArray.description);
			System.out.println(courseArray.trainer);
			System.out.println(courseArray.completeRange);
			
		}
		
		System.out.println("-------------------------------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.getCourse(course);
		courseManager.getCourse(courseJava);
		
		System.out.println("-------------------------------------------");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.getCategory(categoryInstance);
		categoryManager.getCategory(categoryInstance2);
		categoryManager.getCategory(categoryInstance3);
		

	}

}
