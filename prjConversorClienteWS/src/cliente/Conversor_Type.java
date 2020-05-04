
package cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de conversor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="conversor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escolhaN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversor", propOrder = {
    "escolhaN",
    "temperat"
})
public class Conversor_Type {

    protected int escolhaN;
    protected int temperat;

    /**
     * Obtém o valor da propriedade escolhaN.
     * 
     */
    public int getEscolhaN() {
        return escolhaN;
    }

    /**
     * Define o valor da propriedade escolhaN.
     * 
     */
    public void setEscolhaN(int value) {
        this.escolhaN = value;
    }

    /**
     * Obtém o valor da propriedade temperat.
     * 
     */
    public int getTemperat() {
        return temperat;
    }

    /**
     * Define o valor da propriedade temperat.
     * 
     */
    public void setTemperat(int value) {
        this.temperat = value;
    }

}
