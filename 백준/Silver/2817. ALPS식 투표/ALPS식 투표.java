import java.util.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        
        TreeMap<Character, List<Integer>> map = new TreeMap<>();
        TreeMap<Character, Integer> result = new TreeMap<>();
        
        for(int i = 0; i < N; i++) {
        	String c = sc.next();
        	int point = sc.nextInt();
        	
        	if(point /(double) X * 100 < 5)
        		continue;
        	
        	List<Integer> score = new ArrayList<>();
        	for(int j = 1; j <= 14; j++) {
        		score.add(point / j);
        	}
        	map.put(c.charAt(0), score);
        	result.put(c.charAt(0), 0);
        }
        
        
        
        for(int i = 0; i < 14; i++) {
        	int max = 0;
            char maxKey = ' ';
	        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
	        	char key = entry.getKey();
	        	List<Integer> list = entry.getValue();
	        	
	        	if(list.get(0) > max) {
	        		max = list.get(0);
	        		maxKey = key;
	        	}
	        }
	        result.put(maxKey, result.getOrDefault(maxKey, 0)+1);
	        map.get(maxKey).remove(0);
        }
        
        for(Map.Entry<Character, Integer> entry : result.entrySet()) {
        	System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}