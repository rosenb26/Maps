import java.util.Map;
import java.util.HashMap;

public class Maps2{
	
	public Map<String, Integer> word0(String[] strings){
		Map<String, Integer> map = new HashMap<>();
		for(String x: strings){
			map.put(x, 0);
		}
		return map;
	}
	
	public Map<String, Integer> wordLen(String[] strings){
		Map<String, Integer> map = new HashMap<>();
		for(String x: strings){
			map.put(x, x.length());
		}
		return map;
	}
	
	public Map<String, String> pairs(String[] strings){
		Map<String, String> map = new HashMap<>();
		for(String x: strings){
			map.put(x.substring(0,1), x.substring(x.length()-1));
		}
		return map;
	}
	
	public Map<String, Integer> wordCount(String[] strings){
		Map<String, Integer> map = new HashMap<>();
		for(String x: strings){
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		return map;
	}
	
	public Map<String, String> firstChar(String[] strings){
		Map<String, String> map = new HashMap<>();
		for(String x: strings){
			map.put(x.substring(0,1), map.getOrDefault(x.substring(0,1), "") + x);
		}
		return map;
	}
	
	public String wordAppend(String[] strings){
		Map<String, Integer> map = new HashMap<>();
		String result = "";
		for(String x: strings){
			if(map.containsKey(x)){
				if(map.get(x) % 2 == 1){
					result += x;
				}
				map.put(x, map.get(x) + 1);
			}
			else{
				map.put(x, 1);
			}
		}
		return result;
	}
	
	public Map<String, Boolean> wordMultiple(String[] strings){
		Map<String, Boolean> map = new HashMap<>();
		for(String x: strings){
			map.put(x, map.containsKey(x));
		}
		return map;
	}
	
	public String[] allSwap(String[] strings){
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i < strings.length - 1; i++){
			if(!map.containsKey(i) || !map.get(i)){
				for(int j = i + 1; j < strings.length; j++){
					if(strings[i].substring(0,1).equals(strings[j].substring(0,1))){
						String temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
						map.put(j, true);
						break;
					}
				}
			}
		}
		return strings;
	}
	
	public String[] firstSwap(String[] strings){
		Map<String, Boolean> map = new HashMap<>();
		for(int i = 0; i < strings.length - 1; i++){
			if(!map.containsKey(strings[i].substring(0,1)) || !map.get(strings[i].substring(0,1))){
				for(int j = i + 1; j < strings.length; j++){
					if(strings[i].substring(0,1).equals(strings[j].substring(0,1))){
						String temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
						map.put(strings[j].substring(0,1), true);
						break;
					}
				}
			}
		}
		return strings;
	}
	
	
}