/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author marco
 */
public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public DocenteFactura() {

    }

    public void establecerValorFactura(double s) {
        valorFactura = s;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorIva(double ivades) {
        valorIvaDescuento = ivades;
    }

    public double obtenerValorIva() {
        return valorIvaDescuento;
    }

    public void calcularValorCancelar() {
        double valorc;
        valorc = valorFactura - (valorFactura * (valorIvaDescuento / 100));
        valorCancelar = valorc;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format(super.toString());
        reporte = String.format("""
                        %s
                        Valor Factura: %.2f
                        Valor Iva: %.2f
                        Valor a  Cancelar: %.2f
                        """, reporte,
                obtenerValorFactura(),
                obtenerValorIva(),
                obtenerValorCancelar());
        return reporte;

    }

}
