import java.util.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<String> s = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
        	String input = sc.next();
        	if(!s.contains(input))
        		s.add(input);
        }
       
        s.sort(new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		if(s1.length() == s2.length())
        			return s1.compareTo(s2);
        		return s1.length() - s2.length();
        	}
        });
        
        for(String res : s)
        	System.out.println(res);
    }
}