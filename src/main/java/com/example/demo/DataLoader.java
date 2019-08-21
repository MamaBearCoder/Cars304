 package com.example.demo;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.CommandLineRunner;
 import org.springframework.stereotype.Component;

 @Component
     public class DataLoader implements CommandLineRunner {

         @Autowired
         CarsRepository repository;

         @Override
         public void run(String... strings) throws Exception{
             Car car;
             car = new Car(2012, "Honda", "CRVV");
             repository.save(car);

             car = new Car(2019, "Toyota", "Highlander");
             repository.save(car);

             car = new Car(2013, "VWWW", "Bugg");
             repository.save(car);
         }
     }

