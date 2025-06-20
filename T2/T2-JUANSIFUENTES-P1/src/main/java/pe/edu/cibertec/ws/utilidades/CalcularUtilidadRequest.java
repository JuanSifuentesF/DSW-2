//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.06.20 a las 06:26:24 PM COT 
//


package pe.edu.cibertec.ws.utilidades;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salarioMensual" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="aniosTrabajando" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "salarioMensual",
    "aniosTrabajando"
})
@XmlRootElement(name = "calcularUtilidadRequest")
public class CalcularUtilidadRequest {

    protected double salarioMensual;
    protected int aniosTrabajando;

    /**
     * Obtiene el valor de la propiedad salarioMensual.
     * 
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Define el valor de la propiedad salarioMensual.
     * 
     */
    public void setSalarioMensual(double value) {
        this.salarioMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad aniosTrabajando.
     * 
     */
    public int getAniosTrabajando() {
        return aniosTrabajando;
    }

    /**
     * Define el valor de la propiedad aniosTrabajando.
     * 
     */
    public void setAniosTrabajando(int value) {
        this.aniosTrabajando = value;
    }

}
