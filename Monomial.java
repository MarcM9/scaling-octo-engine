
public class Monomial implements Comparable<Monomial>{

	private int coefficient; 
	private int degree; 
	
	
	public Monomial(int coefficent, int degree) { 
		
		this.coefficient = coefficent; 
		this.degree = degree; 
	}
	
	public int getCoeffecient() { 
		
		return this.coefficient;
	}
	
	public int getDegree() {
		
		return this.degree;
	}
	
	public int compareTo(Monomial m) {
		
		return this.degree - m.getDegree();
	}
		
		
}
