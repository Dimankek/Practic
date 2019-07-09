package test.demo.exception;


import test.demo.model.Car;

public class CarNotFoundException extends Exception {
    private long car_id;

    public CarNotFoundException(long car_id) {
        super(String.format("Car is not found with id : '%s'", car_id));
    }
}