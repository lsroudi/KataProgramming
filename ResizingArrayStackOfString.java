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
	
	public String pop()
	{
		String item = s[--N];
		s[N] = null;
		if(N > 0 && N == s.length / 4) resize(s.length/2); // diviser le tableau a 1/2 une fois il est rempli a 1/4
		
		return item;
	}
}
