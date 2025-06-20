//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.06.20 a las 10:15:16 AM COT 
//


package pe.edu.cibertec.ws.operaciones;

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
 *         &lt;element name="t1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="t2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pf" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "t1",
    "t2",
    "pf"
})
@XmlRootElement(name = "getPromedioRequest")
public class GetPromedioRequest {

    protected int t1;
    protected int t2;
    protected int pf;

    /**
     * Obtiene el valor de la propiedad t1.
     * 
     */
    public int getT1() {
        return t1;
    }

    /**
     * Define el valor de la propiedad t1.
     * 
     */
    public void setT1(int value) {
        this.t1 = value;
    }

    /**
     * Obtiene el valor de la propiedad t2.
     * 
     */
    public int getT2() {
        return t2;
    }

    /**
     * Define el valor de la propiedad t2.
     * 
     */
    public void setT2(int value) {
        this.t2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pf.
     * 
     */
    public int getPf() {
        return pf;
    }

    /**
     * Define el valor de la propiedad pf.
     * 
     */
    public void setPf(int value) {
        this.pf = value;
    }

}
