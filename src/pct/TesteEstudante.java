/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Wolf390
 */
public class TesteEstudante {
    public static void main(String[] args) {
        
        //Criação da instancia do objeto EstudanteInfo
        EstudanteInfo estudante = new EstudanteInfo();
        
        //Construção do objeto Estudante.
        estudante.setNome("Harry Potter");
        estudante.setRa(12345);
        estudante.setInfoBasico(9);
        estudante.setLogica('B');
        
        //Apresentando o Estudante.
        System.out.println("\n\t\t\t --- Estudante ---\n");
        estudante.apresentarEstudante();
        
        //Criação da instancia do objeto EstudanteInfo2
        EstudanteInfo estudante2 = new EstudanteInfo();
        
        //Construção do objeto Estudante2.
        estudante2.setNome("Ronald Weasley");
        estudante2.setRa(54321);
        estudante2.setInfoBasico(6);
        estudante2.setLogica('R');
        
        //Apresentando o Estudante2.
        System.out.println("\n\t\t\t --- Estudante 2 ---\n");
        estudante2.apresentarEstudante();
        
        //Criação da instancia do objeto EstudanteInfo3
        EstudanteInfo estudante3 = new EstudanteInfo();
        
        //Construção do objeto Estudante3.
        estudante3.setNome("Hermione Granger");
        estudante3.setRa(13542);
        estudante3.setInfoBasico(10);
        estudante3.setLogica('B');
        
        //Apresentando o Estudante3.
        System.out.println("\n\t\t\t --- Estudante 3 ---\n");
        estudante3.apresentarEstudante();
        
        
        
    }
    
}
