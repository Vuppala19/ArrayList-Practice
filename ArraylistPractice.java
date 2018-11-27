import java.util.ArrayList;
public class ArraylistPractice{
	public static void main(String[]args){

		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();

		for(int i=0; i<10; i++){
			one.add(i);
		}
		for(int i=0; i<10; i++){
			two.add(i);
		}

		ArrayList<Integer> three = new ArrayList<Integer>();
		three = combiner(one, two);
		printer(three);

		removeDuplicates(three);


	}

	public static ArrayList<Integer> combiner(ArrayList<Integer> a, ArrayList<Integer> b){

		ArrayList<Integer> x = new ArrayList<Integer>();

		for(int i=0; i<a.size(); i++){
			x.add(a.get(i));
		}
		for(int i=0; i<b.size(); i++){
			x.add(b.get(i));
		}

		return x;

	}

	public static void printer(ArrayList<Integer> a){

		for(int i=0; i<a.size(); i++){
			System.out.print(a.get(i)+" , ");
		}

	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){

		ArrayList<Integer> z = new ArrayList<>();
		int c;

		for(int i=0; i<a.size(); i++){
			c = 0;
			for(int j=0; j<z.size(); j++){
				if (a.get(i) == z.get(j))
				c++;
			}
			if (c==0)
			z.add(a.get(i));
		}

		return z;

	}

}