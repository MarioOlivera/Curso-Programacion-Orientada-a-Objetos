import Car from './Car.mjs'

class UberPool extends Car
{
    constructor(license, driver, brand, model)
    {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}

export default UberPool;