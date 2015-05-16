package KataProgramming;

public class ResizingArrayStackOfString {

	String [] s;
	int N = 0;
	
	public ResizingArrayStackOfString() {
		s = new String[1];
	}
	
	public void push(String item){
		
		if(N == s.length) resize(2 * s.length);
		s[N++] = item;
	}

	private void resize(int i) {
		String[] copy = new String[i];
		
		for (int j = 0; j < N; j++) {
			copy[j] = s[j];
		}
		
		s = copy;
		
	}
}
