package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator(String name, String color) {
        super(name, color);
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
