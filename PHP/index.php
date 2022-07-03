<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Sparl");
$uberX->printDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Herrera", "DES111"), "Volkswagen", "Gol trend");
$uberPool->printDataCar();
?>