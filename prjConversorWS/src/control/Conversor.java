package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Conversor {
    @WebMethod
    public String conversor(@WebParam(name="escolhaN")int escolT, @WebParam(name="temperat") int temp) {
        if(escolT==1) {
                temp=(int) ((temp*1.8)+32);
        }
        else if(escolT==2) {
            temp=(int) ((temp-32)/1.8);
        }
        return "A temperatura ficou: "+temp;
    }
}