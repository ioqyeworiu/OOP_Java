
public class Pair<K, V> {
	private K first;
	private V second;

	public Pair(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	public boolean prime(Integer num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime() {
		return this.prime((Integer) this.first) && this.prime((Integer) this.second);
	}
	
	@Override
	public String toString() {
		return this.first + " " + this.second;
	}
}
