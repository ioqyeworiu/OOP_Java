
public class Pair<T1, T2> {
	private T1 first;
	private T2 last;

	public Pair(T1 first, T2 last) {
		this.first = first;
		this.last = last;
	}

	public boolean isPrime() {
		if(elementIsPrime((Integer) first) && elementIsPrime((Integer) last)) {
			return true;
		}
		return false;
	}
	
	public boolean elementIsPrime(Integer element) {
		if(element == 0 || element == 1) {
			return false;
		}
		for(int i=2; i<=(int) Math.sqrt(element); i++) {
			if(element%i==0)
				return false;
		}
		return true;
	}
	
	@Override 
	public String toString() {
		return first + " " + last;
	}
}
