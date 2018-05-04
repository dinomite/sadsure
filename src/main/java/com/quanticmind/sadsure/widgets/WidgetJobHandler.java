package com.quanticmind.sadsure.widgets;

import com.quanticmind.sadsure.JobHandler;

import java.util.Arrays;
import java.util.List;

public class WidgetJobHandler implements JobHandler<Widget> {
    @Override
    public List<Widget> getJobs() {
        return Arrays.asList(new Widget("client-1", "request-5"));
    }

    @Override
    public void doSomethingTo(Widget job) {
        job.submit();
    }
}
