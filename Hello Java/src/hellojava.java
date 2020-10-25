
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
public class hellojava {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
//		System.out.println("hello java");
//	System.out.println("changes");
//	System.out.println("Hello Bosi");
//	JSONObject f = new JSONObject();
//	f.put("Emer", "fani");
//	f.put("Mbiemer", "gjoni");
//	f.put("mosha", 30);
	
//	System.out.println(f);
	/* String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";  
	 Object obj=JSONValue.parse(s);  
	    JSONObject jsonObject = new JSONObject(obj);
	    String name = (String) jsonObject.get("name");  
	    double salary = (Double) jsonObject.get("salary");  
	    long age = (Long) jsonObject.get("age");  
	    System.out.println(name+" "+salary+" "+age); */
		JSONArray array1 = new JSONArray();
		
		JSONObject obj = new JSONObject();
		obj.put("orderno", "748745375");
		obj.put("date :", "June 30, 2088 1:54:23 AM");
		obj.put("trackingno", "TN0039291");
		obj.put("custid", "11045");
		JSONObject obj1= new JSONObject();
		obj1.put("custid", "11045");
		obj1.put("fname", "Sue");
		obj1.put("lname", "Hatfied");
		obj1.put("address", "1409 Silver Street");
		obj1.put("city", "Ashland");
		obj1.put("state", "NE");
		obj1.put("zip", "68003");
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		
		
		
		array1.put(obj1);
		obj.put("customer", array1);
		array.put(obj);
		object.put("orders", array);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(object);
		System.out.println(json);
	
		
	}

}
