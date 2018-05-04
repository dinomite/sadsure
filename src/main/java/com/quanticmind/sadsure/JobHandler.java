package com.quanticmind.sadsure;

import java.util.List;

public interface JobHandler<T> {
    List<T> getJobs();

    void doSomethingTo(T job);
}
