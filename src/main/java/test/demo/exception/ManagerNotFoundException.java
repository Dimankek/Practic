package test.demo.exception;

import test.demo.model.Manager;

public class ManagerNotFoundException extends Exception {
    private long manager_id;

    public ManagerNotFoundException(long manager_id) {
        super(String.format("Manager is not found with id : '%s'", manager_id));
    }
}