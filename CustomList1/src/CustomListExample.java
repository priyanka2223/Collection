import java.util.*;
public class CustomListExample {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		System.out.println("Enter 10 values : ");
		for(int i=0;i<10;i++){
			a.add(sc.nextInt());
		}
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nEnter the index  for element to be removed :");
		int i = sc.nextInt();
		a.remove(i);
		
		System.out.println("Enter element to be check if exist in the list : ");
		i = sc.nextInt();
        System.out.println(a.contains(i));
        
		System.out.println("Enter index to get the value :");
		i = sc.nextInt();
        System.out.println("Element at index "+i+" : "+a.get(i));
        
        System.out.println("Enter the range to get the sublist :");
        i = sc.nextInt();
        int j = sc.nextInt();
		System.out.println("sublist : "+a.subList(i,j));
		
		System.out.println("Enter the index and value to be set at corresponding index : ");
		i = sc.nextInt();
        j = sc.nextInt();
		a.set(i,j);
		
		System.out.println(a);
		System.out.println("List is empty : "+a.isEmpty());
		
		System.out.println("Enter the element to get the index : ");
		i = sc.nextInt();
        System.out.println("Element "+i+" is at index :"+a.indexOf(i));
        
		System.out.println("List size :"+a.size());

	}


}
