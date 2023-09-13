// Fiz com o Gustavo Coradin
import java.util.Scanner;


public class ArvoreBinaria {
 
public static int busca_binaria(int dado[],int x, int inferior,int superior){
    int meio;
    if(inferior>superior){
        return -1;
    }
    meio = (inferior + superior)/2;
    if(x == dado[meio]){
      return meio;
    }
    if(x<dado[meio]){
        return busca_binaria(dado,x,inferior,meio-1);
    }
    else{
        return busca_binaria(dado,x,meio+1,superior);
    }
}
}

