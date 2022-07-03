import Car from './Car.mjs'

class UberVan extends Car
{
    constructor(license, driver, typeCarAccepted, seatsMaterial)
    {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}

export default UberVan;