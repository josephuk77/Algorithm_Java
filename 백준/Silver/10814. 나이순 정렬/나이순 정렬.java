import java.util.*;

class Main
{
	
	
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Member> member = new ArrayList<>();
    	sc.nextLine();
        for(int i = 0; i < N; i++) {
        	String[] input = sc.nextLine().split(" ");
        
        	member.add(new Member(input[1], Integer.parseInt(input[0]), i));
        }
       
        member.sort(new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				if(o1.age == o2.age)
					return o1.count - o2.count;
				return o1.age-o2.age;
			}
        });
        
        for(Member m : member)
        	System.out.println(m.age+" "+m.name);
    }
}

class Member {
	String name;
	int age;
	int count;
	
	public Member(String name, int age, int count) {
		this.name = name;
		this.age = age;
		this.count = count;
	}
	
}