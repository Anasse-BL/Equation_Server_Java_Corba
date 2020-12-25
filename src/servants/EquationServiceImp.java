package servants;
import EquationCorba.EquationInterfacePOA;
public class EquationServiceImp extends EquationInterfacePOA {
	@Override
	public String equation(double a, double b, double c) {
		// TODO Auto-generated method stub
		double Delta = (b*b) - 4*a*c;;
		 double X1 ,X2, X3; 
	        X1 = (-b-Math.sqrt(Delta))/(2*a);
	        X2 = (-b+Math.sqrt(Delta))/(2*a);
	        X3 = (-b)/(2*a);
	        String echec = "L'équation n'admet pas de solution";    
	        if(Delta < 0){
	            return echec;}    
	        else if(Delta == 0){
	            String myresultat1 = "L'équation admet une solution double X = "+X3;
	            return myresultat1;} 
	        else{
	            String myresultat2 = "L'équation admet deux solutions S ={"+X1+" ; "+X2+"}";
	            return myresultat2;    
	        }}}
