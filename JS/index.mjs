import Car from './Car.mjs'
import Account from './Account.mjs'
import UberX from './UberX.mjs'

let car = new Car("AMQ123",new Account("Andres Herrera","AND123"))
car.passegenger = 4;
car.printDataCar()

let car2 = new UberX("HUJ999",new Account("Andrea Herrera","AND321"), "Volkswagen", "Gol Trend")
car2.passegenger = 3;
car2.printDataCar()
