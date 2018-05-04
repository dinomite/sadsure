package com.quanticmind.sadsure.fobbles;

import com.quanticmind.sadsure.JobHandler;
import com.quanticmind.sadsure.widgets.Widget;

import java.util.Arrays;
import java.util.List;

public class FobbleJobHandler implements JobHandler<Fobble> {
    @Override
    public List<Fobble> getJobs() {
        return Arrays.asList(new Fobble("client-1", "request-5"));
    }

    @Override
    public void doSomethingTo(Fobble job) {
        job.submit();
    }
}
