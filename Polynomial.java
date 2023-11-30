
public class Polynomial {
	
	private OrderedLinkedList<Monomial> polynomialList; 
	
	public Polynomial() { 
		
		polynomialList = new OrderedLinkedList<>();
		
	}
	
	public void add (int coefficient, int degree) { 
		
		Monomial m  = new Monomial(coefficient, degree);
		
		polynomialList.insert(m);
	}
	
	public Polynomial derivative() { 
		
		Polynomial derivPoly = new Polynomial(); 
		
		for(int i = 0; i < polynomialList.size; i++) {
			
			int coefficient = polynomialList.get(i).getCoeffecient()*polynomialList.get(i).getDegree();
			int degree = polynomialList.get(i).getDegree()-1;
			
			derivPoly.add(coefficient, degree);
			
		}
		

		return derivPoly;
	}
	
	public double eval(double z) { 
		
		double result = 0.0; 
		
		for(int i = 0; i < polynomialList.getSize(); i++) {
			
			result += (polynomialList.get(i).getCoeffecient() * (Math.pow(z,polynomialList.get(i).getDegree())));
		}
		
		return result; 
		
	}
	
	public String toString() { 
		
		
	}

}
