package KataProgramming;


public class QuickUnion {

	private int [] id;
	
	public QuickUnion(int N) {
		for(int i=0;i < N ;i++){
			id[i] = i;
		}
	}
	
<<<<<<< HEAD
	private int root(int p){
=======
	public int root(int p){
>>>>>>> f88e2bf63b80fed789f82a144fc6ce4cefd9dacd
	
		while (id[p] != p) {
			
			p = id[p];
		}
		
		return p;
	}
	
	public boolean connected(int p, int q){
		
		return root(p) == root(q);
	}
	
	public void union(int p,int q){
		
		int rootOfq = root(q);
		int rootOfp = root(p);
		
		id[rootOfp] = rootOfq;
		
	}
}
