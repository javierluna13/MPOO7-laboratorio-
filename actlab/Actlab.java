/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actlab;

/**
 *
 * @author javierluna
 */
public class Actlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LABORATORIO.
        Gerente ger1= new Gerente();
        
        ger1.setNombre("Luis");
        ger1.setNumEmpleado(8532);
        ger1.setPresupuesto(50000);
        ger1.setSueldo(10);
        
        System.out.println(ger1);
        
    }
    
}
