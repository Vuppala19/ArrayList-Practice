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

}