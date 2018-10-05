/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package val.daw.desd;

/**
 *
 * @author David
 */
 
public class OteroDavid
{
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
			System.out.println(getOteroDavid(2,5));
		}
		
		public static String getOteroDavid (float num1, float num2)
		{
			float num3 = num1*num2;
			String codi = "El codi super interesant es una multiplicacio entre el numero: "+num1+" i el numero: "+num2+". "+num1+" * "+num2+" = "+num3+"!";
			return codi;
		}
}
