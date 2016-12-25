package Specification;

import Specification.Spec;

/**
 * Created by jlaba on 25.10.2016.
 */
public class CactusSpec extends Spec {
    /**
     * Special properties of cactus
     */
    protected double shape = 0;
    public CactusSpec(double length, double shape) {
        super(length);
        this.shape = shape;

    }
}
