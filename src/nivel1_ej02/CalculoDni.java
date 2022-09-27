package nivel1_ej02;

public class CalculoDni {
	private int numeroDNI;
    private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
   
    public CalculoDni(int num){
        this.numeroDNI = num;
    }
    public void setNumeroDNI(int nuevoNum){
        this.numeroDNI = nuevoNum;
    }
    public int getNumeroDNI(){
        return numeroDNI;
    }
    public char obtenerLetra(){
        int resto;
        resto = numeroDNI % 23;
        return letras[resto];
    }
}
