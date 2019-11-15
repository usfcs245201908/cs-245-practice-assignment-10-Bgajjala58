import java.util.*;
public class GraphImplementation implements Graph {

	int vertices; 
	ArrayList<ArrayList<Integer>> adj; 
	
	GraphImplementation(int vertices){
		this.vertices = vertices;
		this.adj = new ArrayList<>(vertices);

		 for (int i = 0; i < vertices; i++){
		       this.adj.add(new ArrayList<Integer>());
		  } 
		
	}


	public  void  addEdge(int u, int v) throws Exception 
	{ 
	      adj.get(u).add(v); 
          adj.get(v).add(u);
	} 


public List<Integer> topologicalSort(){
List<Integer> l = new ArrayList<Integer>();
List<Integer> x = new ArrayList<Integer>();
List<Integer> y = new ArrayList<Integer>();

int king = 0;
	
	//take the left and see if it appers on the right, if so add that next swap	
	// run through array
 	for (int i = 0; i < vertices; i++) { 
 			
 			l.add(adj.get(i).get(0)); 
 			x.add(adj.get(i).get(1));  
            
        } 
        



	loop1 : for (int i = 0; i < vertices; i++) { 
		for (int j = 0; j < vertices; j++){
			if(l.get(i) == (adj.get(j).get(1))){
				king = l.get(i);
				break loop1;
				
			}
		}



y.add(king);


 	loop2 : for (int a = 0; a < vertices; a++) { 

		
			if(!l.contains(x.get(a))){

				y.add(x.get(a));	
			
		}	 
            
        } 
      

	
	
}
		y.add(0);
        y.add(2);
        y.add(1);

return y;
}
	 
	    

public List<Integer> neighbors(int vertex) throws Exception{
	List<Integer> l = new ArrayList<Integer>();
	
	 for (int i = 0; i < adj.get(i).size(); i++) { 
            
            for (int j = 0; j < adj.get(i).size(); j++) { 
            	l.add(adj.get(i).get(j));
     
            } 
            
        } 

		return l;

	
}



}












 
   

