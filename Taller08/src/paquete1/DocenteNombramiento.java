package paquete1;

public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private double numeroHorasExtras;
    private double sueldoFinal;

    public DocenteNombramiento() {

    }

    public void establecerValorSueldo(double s) {
        valorSueldo = s;
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public void establecerValorHoraExtra(double horaEx) {
        valorHoraExtra = horaEx;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public void establecerCantidadHoras(double numeroHorasE) {
        numeroHorasExtras = numeroHorasE;
    }

    public double obtenerCantidadhoras() {
        return numeroHorasExtras;
    }

    public void calcularSueldoTotal() {
        double sf;
        sf=(valorHoraExtra*numeroHorasExtras)+valorSueldo;
        
        sueldoFinal=sf;
    }
    public double obtenerSueldoTotal(){
        return sueldoFinal;
    }

    @Override
    public String toString() {
        String reporte = String.format(super.toString());
        reporte=String.format("""
                        %s
                        Valor Sueldo: %.2f
                        Valor Hora Extra: %.2f
                        Numero Horas Extras: %.2f
                        Sueldo Final: %.2f
                        """,reporte,
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerCantidadhoras(),
                obtenerSueldoTotal()
                );
        return reporte;
    }
    
    
}