abstract class Obst {
	
	
}


class Apfel extends Obst {
	
	 final int gewicht;
	
	public Apfel(int gewicht) {
		
		this.gewicht = gewicht;
	}
}

 class Birne extends Obst {

	final int gewicht;

	public Birne(int gewicht) {
		
		this.gewicht = gewicht;
	}
	
}

class Kirsche extends Obst {
	
	
}



public class MaximumContainer<T extends Comparable<T>>{
	
	T maxElem = null; 
	T elem; 
		
	public T get() {
		
		return maxElem;
	}	
	
	
	
	public void store(T newElement) {
        if (maxElem == null || maxElem.compareTo(newElement) < 0) {
            maxElem = newElement;
        }
    }

}



class Test {
	
	public static void main(String[] args) {
		
		MaximumContainer<Integer> mc = new MaximumContainer<Integer>();
		
		Apfel a = new Apfel(23);
		Birne b = new Birne(88);
		
		mc.store(a.gewicht);
		mc.store(b.gewicht);
		

		System.out.print(mc.get());
		
	}
}