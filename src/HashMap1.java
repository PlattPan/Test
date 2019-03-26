import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap();
		map.put("1","2");
		map.put("2","3");
		map.put("3","4");
		String a="1";
		String x=map.get(a);
		System.out.println(x);
		//1.ͨ��Map.keySet����key��value
		map.keySet(); 
		for(String key:map.keySet()) {
			System.out.println(key+"------------"+map.get(key));
		}
		System.out.println("--------------");
		//2.ͨ��Map.entrySetʹ��iterator����key��value
		Iterator iterator= map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String,String> entry=(Entry<String, String>) iterator.next();
			System.out.println(entry.getKey()+"-----------"+entry.getValue());
		}
		System.out.println("--------------------");
		//3.��Map.entrySet����key��value
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println(entry.getKey()+"------------"+entry.getValue());
		}
		System.out.println("----------------");
		//4.ͨ��Map.values()�������е�value�������ܱ���key
		for(String v:map.values()) {
			System.out.println(v);
		}
		map.remove("1");
		for(String v:map.values()) {
			System.out.println(v);
		}
		
		
		
		

	}

}
