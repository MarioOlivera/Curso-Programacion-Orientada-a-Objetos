import this
from car import Car

class UberBlack(Car):
    typeCarAccepted= []
    seatsMaterial=[]

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver)
        this.typeCarAccepted= typeCarAccepted
        this.seatsMaterial= seatsMaterial
