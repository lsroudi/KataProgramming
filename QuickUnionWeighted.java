package KataProgramming;


public class QuickUnionWeighted {

	private int [] id;
	private int [] sz;
	
	public QuickUnionWeighted(int N) {
		id = new int[N];
		sz = new int[N];
		
		for(int i=0;i < N ;i++){
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	private int root(int p){
	
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
		
		if(rootOfp == rootOfq) return;
		
		if(sz[rootOfp]< sz[rootOfq]){	
			
			id[rootOfp] = q;
			sz[rootOfq] += sz[rootOfp];
		}
		else{
			sz[rootOfq] = p;
			sz[rootOfp] += sz[rootOfq];
		}
		
		id[rootOfp] = rootOfq;
		
	}
}
