
package session9;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		Hdtv t1 = new Hdtv(50, "S");
		Hdtv t2 = new Hdtv(70, "R");
		Hdtv t3 = new Hdtv(40, "P");
 
		ArrayList<Hdtv> al = new ArrayList<Hdtv>();
		al.add(t1);
		al.add(t2);
		al.add(t3);
 
		Collections.sort(al, new SizeComparator());
		for (Hdtv a : al) {
			System.out.println(a.getSize());
		}
	}


}
