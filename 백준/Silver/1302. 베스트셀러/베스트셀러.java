import java.util.*;

class Main
{
	
	
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        TreeMap<String, Integer> books = new TreeMap<>();

        for(int i = 0; i < N; i++) {
        	String book = sc.next();
        	books.put(book, books.getOrDefault(book, 0) + 1 );
        }
        String resultBook = "";
        int max = 0;
  
        for(String key : books.keySet()) {
        	if(max < books.get(key)) {
        		resultBook = key;
            	max = books.get(key);
        	}
        }
        System.out.println(resultBook);
    }
}
