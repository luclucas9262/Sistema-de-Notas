package nota;

import java.util.Scanner;

public class aluno {

    Scanner entrada = new Scanner(System.in);

    private double n1, n2, total;
    

    public void SetNota1() {
        System.out.println("Digitie a nota n1 do aluno: ");
        this.n1 = entrada.nextDouble();
    }

    public double GetNota1() {
        return this.n1;

    }

    public void SetNota2() {
        System.out.println("Digite a nota n2 do aluno: ");
        this.n2 = entrada.nextDouble();
    }

    public Double GetNota2() {
        return n2;
    }

    public double CalNota() {
        total = n1 + n2;
        return total;
    }

    public void NotasInvalidas() {
        System.out.println("Notas Digitadas Invalidas");
    }
    
    
    

    public void Aprovado() {
        System.out.println("***Aluno Aprovado*** "+" Sua Nota final é: "+total);
    }

    
    
    public void Reprovado() {
        System.out.println("Aluno Reprovado"+" Sua Nota final é: "+total);
    }

}
