package topicoscalculadora;
import java.util.*;
public class TopicosCalculadora {
public static void main(String[] args) {
Scanner ler= new Scanner(System.in);
Operacoes op = new Operacoes();
    int x = 0, y = 0,operacao;
    char parar = ' '; 
    
    do{
    
    System.out.println("Informe qual a operação desejada:\n1 - Soma\t\t2 - Subtração\n3 - Multiplicação\t4 - Divisão\n5 - Potenciação");
    operacao = ler.nextInt();
    
    System.out.println("Informe o primeiro elemento da operação");
    x = ler.nextInt();
    System.out.println("Informe o segundo elemento da operação");
    y = ler.nextInt();
    
    if(operacao == 1){
        System.out.println(x+" + "+y+" = "+op.soma(x, y));
    }
    else if(operacao == 2){
        System.out.println(x+" - "+y+" = "+op.subtracao(x, y));
    }
    else if(operacao == 3){
        System.out.println(x+" x "+y+" = "+op.multiplicacao(x, y));
    }
    else if(operacao == 4){
        System.out.println(x+" ÷ "+y+" = "+op.divisao(x, y));
    }
    else{
        System.out.println(x+" ^ "+y+" = "+op.potencia(x, y));
    }
        System.out.println("Deseja parar? S/N");
        parar = ler.next().charAt(0);
        parar = Character.toUpperCase(parar);
    }while(parar != 'S');
    }
    
}
