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
 *         &lt;element name="talla" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "talla",
    "peso"
})
@XmlRootElement(name = "getImcRequest")
public class GetImcRequest {

    protected int talla;
    protected int peso;

    /**
     * Obtiene el valor de la propiedad talla.
     * 
     */
    public int getTalla() {
        return talla;
    }

    /**
     * Define el valor de la propiedad talla.
     * 
     */
    public void setTalla(int value) {
        this.talla = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     */
    public void setPeso(int value) {
        this.peso = value;
    }

}
