import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        //TODO Auto-generated constructor stub

        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public void setPassenger(Integer passegenger)
    {
        if(passegenger == 6)
        {
            this.passegenger = passegenger;
        }
        else
        {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
    
}
