package nota;

import java.util.Locale;

public class Nota {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        aluno n = new aluno();
        
        do{
        n.SetNota1();
        n.SetNota2();
        
        
        if (n.GetNota1() < 0 && n.GetNota2() < 0) {
            
            n.NotasInvalidas();
            
        } else {
            
           
            if (n.CalNota() < 60.0) {
                
                n.Reprovado();
                
            } else {
                
                n.Aprovado();
                
            }
            
        }

        
        
        }while(n.GetNota1() !=0 &&n.GetNota2() !=0);
        
        
    }

}
