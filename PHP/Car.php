<?php 
require_once("account.php");

class Car {
    public $id;
    public $license;
    public $driver;
    public $passegenger;

    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar()
    {
        print("\n Licencia: ".$this->license." Driver: ".$this->driver->name);
    }
}
