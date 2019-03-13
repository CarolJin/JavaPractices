package tracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 Rule:- Split the input string by delimiter ‘&’.
	- Each line looks like ‘xxx=xxx’. Split it by ‘=’, and take the left part as key, right part as value, finally put to the map.
	- The input string is supposed like “n1=v1&n2=v2&n3=v3”. Please do necessary validation.
*/
public class ParseTrackingInfo {
	
	public static void main(String[] args) {
		String trackingInfo = "n1=v1&n2=v2&n3=v3&version=";
		Map<String, String> tracking = Parse(trackingInfo);
		System.out.println(tracking); 
		Set keys = tracking.entrySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Map.Entry keyValuePair = (Map.Entry) it.next();
			System.out.println("The key is: " + keyValuePair.getKey());
			System.out.println("The value is: " + keyValuePair.getValue());
		}
	}

	public static Map<String, String> Parse(String str) {
		Map<String, String> result = new HashMap<String, String>();

		if (str == null || str.trim() == null)
			return null;

		String[] arr = str.split("&");
		for (int i = 0; i < arr.length; i++) {
			String key = null;
			String value = null;
			if(arr[i]!=null && arr[i].trim()!=null){
				if (arr[i].indexOf("=") > 0) {
					key = arr[i].substring(0, arr[i].indexOf("="));
					value = arr[i].substring(arr[i].indexOf("=")+1);					
				} else {
					key = arr[i];
					value ="";
				}
			}	
			result.put(key, value);
		}
		Set entrySets = result.entrySet();
		Iterator it = entrySets.iterator();
		while(it.hasNext()) {
			Map.Entry keyValuePair = (Map.Entry) it.next();
			System.out.print(keyValuePair.getKey() + "  ");
			System.out.println(keyValuePair.getValue());
		}
		return result;
	}
}
