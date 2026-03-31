import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        Integer [] num = new Integer[N];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
        	num[i] = sc.nextInt();
        	if(!map.containsKey(num[i]))    
        		map.put(num[i], i);
        }
        
        Arrays.sort(num);
        int tmp = num[0];
        int j = 0;
        Var[] var = new Var[map.size()];
        
        for(int i = 0; i < N; i++) {
        	if( i == 0) {
        		var[j] = new Var(num[i],map.get(num[i]));
        		var[j].upCount();
        	}else if( num[i] != tmp) {
        		j++;
        		var[j] = new Var(num[i],map.get(num[i]));
        		var[j].upCount();
        		tmp = num[i];
        	}else {
        		var[j].upCount();
        	}
        }
        Arrays.sort(var);
       
        for(Var v : var) {
        	v.printNum();
        }
    }
}

class Var implements Comparable<Var>{
	int num;
	int count = 0;
	int index;
	
	public Var(int num, int index) {
		this.num = num;
		this.index = index;
	}
	
	public void upCount() {
		this.count++;
	}
	
	public void printNum() {
		for(int i = 0; i < this.count; i++) {
			System.out.print(num+ " ");
		}
	}

	@Override
	public int compareTo(Var o) {
		// TODO Auto-generated method stub
		if(this.count == o.count)
			return this.index - o.index;
		return  o.count - this.count;
	}
	
	
}