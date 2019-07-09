package test.demo.exception;

import test.demo.model.SpareParts;

public class SparePartsNotFoundException extends Exception {
    private long sparepart_id;

    public SparePartsNotFoundException(long sparepart_id) {
        super(String.format("SparePart is not found with id : '%s'", sparepart_id));
    }
}