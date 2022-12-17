package topicoscalculadora;
public class Operacoes {

	public int potencia(int a, int b){
		//Rogerio Silva Palafoz Junior
	   int c = 1;
       for(int i = 0;i < b;i++){
           c *= a;
       }
        return c;
    }
    public int subtracao(int a,int b){
        return a-b;
    }
	public int multiplicacao(int a, int b){
	  return a*b;
    } 

     // Mª Luisa
    public int soma( int numero, int numero2){
        return numero + numero2;
    }
    public int divisao(int a,int b){
        return a/b;
    }
}
