package Salud;

import java.util.Scanner;

public class Empleado extends Persona{
    private String cargo,departamento;
    private double valorHora ,honorarios;    
    private int horasTrabajadas;
    Scanner sc = new Scanner(System.in);
    public Empleado(){

    }
    public Empleado(String tipoDoc, String documento, String nombre, String apellido, String sexo, int edad, float estatura, float peso, String cargo, String departamento, double valorHora, int horasTrabajadas,double honorarios) {
        super(tipoDoc, documento, nombre, apellido, sexo, edad, estatura, peso);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.honorarios=honorarios;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getHonorarios() {
        return honorarios;
    }
    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }
    public void calcularHonorarios(){
        System.out.println("Digite el cargo");
        this.cargo=sc.next();
        System.out.println("Digite la cantidad de horas trabajadas");
        this.horasTrabajadas=sc.nextInt();
        System.out.println("Digite el valor de la hora: ");
        this.valorHora = sc.nextDouble();
        honorarios=(valorHora*horasTrabajadas)-(valorHora*horasTrabajadas*0.00966);
        mostraPersona();
        calcularmc();
        mayoredad();
        System.out.println("Cargo :" +getCargo());
        System.out.println("Horas trabajadas :" + getHorasTrabajadas());
        System.out.println("Valor hora :" + getValorHora());
        System.out.println("Total a pagar :" + getHonorarios());
    }
    
}
