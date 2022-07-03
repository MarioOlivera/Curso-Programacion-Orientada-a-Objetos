
class Main
{
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        UberX uberx = new UberX("AMQ123",new Account("Andres Herrera","AND123"), "Volkswagen", "Gol Trend");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("AMQ123",new Account("Andres Herrera","AND123"), null, null);
        ubervan.setPassenger(4);
        ubervan.printDataCar();

        /* 
        Car car2 = new Car("QWE567",new Account("Andrea Herrera","AND321"));
        car2.passegenger = 3;

        car2.printDataCar();
        */
    }
}