package newpackage;

/**
 *
 * @author Optiplex
 */
public class Empleado11 {
    //atributos
    String codigo;
    String nombre;
    String area;
    double sueldoBase;
    double horasExtras;
    String tipo_seg;
    //constructor
    public Empleado11(String codigo, String nombre, String area, 
            double sueldoBase,double horasExtras, String seguro) {
        // Actualizar la información de los atributos de la clase
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = seguro;
    }

    // Calcular el monto extra
    public double montoHExtras() {
       return sueldoBase * horasExtras / 240;
    }

    // Calcular el monto de seguro
    public double montoSeguro() {
       if (tipo_seg.equalsIgnoreCase("AFP"))
           return sueldoBase * 0.17;
       if (tipo_seg.equalsIgnoreCase("SNP"))
           return sueldoBase * 0.05;
       return 0;
    }

    // Calcular monto de Essalud
    public double montoEssalud() {
        return sueldoBase * 0.03;
    }

    // Calcular monto de descuentos
    public double montoDescuentos() {
        return montoSeguro() + montoEssalud();
    }

    // Calcular sueldo bruto
    public double sueldoBruto() {
        return sueldoBase + montoHExtras();
    }

    // Calcular sueldo neto
    public double sueldoNeto() {
        return sueldoBruto() - montoDescuentos();
    }
}
