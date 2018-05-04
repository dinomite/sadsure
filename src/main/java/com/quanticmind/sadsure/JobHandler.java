package com.quanticmind.sadsure;

import java.util.List;

public interface JobHandler<T extends Identifiable> {
    List<T> getJobs();

    void doSomethingTo(T job);
}
