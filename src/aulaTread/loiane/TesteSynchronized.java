package aulaTread.loiane;

public class TesteSynchronized {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		MinhaThreadSynchronized t1 = new MinhaThreadSynchronized("#1", array);
		MinhaThreadSynchronized t2 = new MinhaThreadSynchronized("#2", array);
		//MinhaThreadSynchronized t3 = new MinhaThreadSynchronized("#3", array);
	}

}
 