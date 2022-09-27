package nivel1_ej01;

import java.util.ArrayList;

public class Month {

	public static void main(String[] args) {
		
		ArrayList<String> monthList = new ArrayList<String>();
		genList(monthList);
		
	}
	
	public static ArrayList<String> genList (ArrayList<String> monthList){
		monthList.add("Enero");
		monthList.add("Febrero");
		monthList.add("Marzo");
		monthList.add("Abril");
		monthList.add("Mayo");
		monthList.add("Junio");
		monthList.add("Julio");
		monthList.add("Agosto");
		monthList.add("Septiembre");
		monthList.add("Noviembre");
		monthList.add("Octubre");
		monthList.add("Diciembre");
		return monthList;
	}
}
