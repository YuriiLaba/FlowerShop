package Specification;

import Specification.Spec;

/**
 * Created by jlaba on 25.10.2016.
 */
public class FlowerSpec extends Spec {
    protected double fresh = 0;

    public FlowerSpec(double length, double fresh) {
        super(length);
        this.fresh = fresh;
    }
}
