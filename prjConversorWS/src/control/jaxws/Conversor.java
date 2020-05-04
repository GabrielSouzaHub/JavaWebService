
package control.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "conversor", namespace = "http://control/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversor", namespace = "http://control/", propOrder = {
    "escolhaN",
    "temperat"
})
public class Conversor {

    @XmlElement(name = "escolhaN", namespace = "")
    private int escolhaN;
    @XmlElement(name = "temperat", namespace = "")
    private int temperat;

    /**
     * 
     * @return
     *     returns int
     */
    public int getEscolhaN() {
        return this.escolhaN;
    }

    /**
     * 
     * @param escolhaN
     *     the value for the escolhaN property
     */
    public void setEscolhaN(int escolhaN) {
        this.escolhaN = escolhaN;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getTemperat() {
        return this.temperat;
    }

    /**
     * 
     * @param temperat
     *     the value for the temperat property
     */
    public void setTemperat(int temperat) {
        this.temperat = temperat;
    }

}
