package JSONFormat;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonFormat {

	public static void main(String[] args) throws JSONException {
		JSONArray array = new JSONArray();
		JSONObject obj = new JSONObject();
		obj.put("Name", "Yogurt Deport");
		obj.put("Revenue", 2000);
		obj.put("Cost", 100);
		obj.put("id", 1);
		JSONArray array1 = new JSONArray();
		array1.put( "dessert");
		array1.put("food");
		array1.put("yogurt");
		obj.put("Category", array1);
		JSONArray array2 = new JSONArray();
		JSONObject obj1 = new JSONObject ();
		obj1.put("day", "Mon");
		obj1.put("visit_count", 300);
		JSONObject obj2 = new JSONObject();
		obj2.put("day", "Tue");
		obj2.put("visit_count", 700);

		obj.put("city", "Tucson");
		obj.put("Category", array1);
		array2.put(obj1);
		array2.put(obj2);
		obj.put("Visits", array2);
		JSONArray array3 = new JSONArray();

		JSONObject obj3 = new JSONObject();
		obj3.put("starts", 5);
		obj3.put("customers_rated", 10);
		array3.put(obj3);
		JSONObject obj4 = new JSONObject();
		obj4.put("starts", 4);
		obj4.put("customers_rated", 8);
		array3.put(obj4);
		JSONObject obj5 = new JSONObject();
		obj5.put("starts", 3);
		obj5.put("customers_rated", 120);
		array3.put(obj5);
		JSONObject obj6 = new JSONObject();
		obj6.put("starts", 2);
		obj6.put("customers_rated", 6);
		array3.put(obj6);
		JSONObject obj7 = new JSONObject();
		obj7.put("starts", 1);
		obj7.put("customers_rated", 0);
		array3.put(obj7);
		obj.put("Stars_rated", array3);
		

		/*obj.put("Name", "Corner Bakery");
	obj.put("Id", 2);
	obj.put("Revenue", 6100);
	obj.put("Cost", 120);
	array.put("bakery");
	array.put("food");
	obj.put("Category", array);*/
		System.out.println(obj.toString());



			Iterator key = obj.keys();

			while (key.hasNext()) {
				String k = key.next().toString();
				if(k.equals("Category")) {
					
					for(int i=0;i<obj.getJSONArray("Category").length();i++) {
						
						System.out.println ( obj.getJSONArray("Category").get(i));
					}
					
				}
				else if(k.equals("Visits")) {
					
					for(int i=0;i<obj.getJSONArray("Visits").length(); i++) {
						JSONObject a = obj.getJSONArray("Visits").getJSONObject(i);
						Iterator key1 = a.keys();	
						while (key1.hasNext()) {
							String k2 = key1.next().toString();
							System.out.println(a.get(k2));
						}
						
					
					//System.out.println( obj.getJSONArray("Visits").get(i));
					
				}
				}
				else if(k.equals("Stars_rated")) {
					for(int i=0;i<obj.getJSONArray("Stars_rated").length(); i++) {
						JSONObject a = obj.getJSONArray("Stars_rated").getJSONObject(i);
						Iterator key1 = a.keys();	
						while (key1.hasNext()) {
							String k2 = key1.next().toString();
							System.out.println(a.get(k2));
					}
					
				}
				}
				else {
					System.out.println(obj.get(k));
				}
			}
		}

}

