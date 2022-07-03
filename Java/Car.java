public class Car {
    Integer id;
    String license;
    Account driver;
    protected Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + this.license + " Driver: " + this.driver.name + " Passegegers: "+this.passegenger);
    }

    public void setPassenger(Integer passegenger)
    {
        if(passegenger == 4)
        {
            this.passegenger = passegenger;
        }
        else
        {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
    
    public Integer getPassenger()
    {
        return this.passegenger;
    }
}
