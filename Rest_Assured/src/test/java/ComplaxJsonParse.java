import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplaxJsonParse {

	public static void main(String[] Arg) {
	JsonPath js =  new JsonPath(Payload.CoursePrice());
	
	// Get the no of courses in the Json Array
	
	int count = js.getInt("courses.size()");
	System.out.println(count);
	
	// Get the Perchase Amount in the Json Array
	
	int Amount = js.getInt("dashboard.purchaseAmount");
	System.out.println(Amount);
	
	//Print title of the first course
	
	String CourseName = js.getString("courses[0].title");
	System.out.println(CourseName);
	
	//Print title of the all courses
	
	for(int i=0 ; i<count ; i++) {
		System.out.println("Course "+ i +" name is = "+js.getString("courses["+i+"].title"));
	}
	
	
	}
	
	
	
}
