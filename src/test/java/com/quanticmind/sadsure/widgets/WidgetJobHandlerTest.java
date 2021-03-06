package com.quanticmind.sadsure.widgets;

import com.quanticmind.sadsure.JobMonitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WidgetJobHandlerTest {
    private WidgetJobHandler widgetJobHandler;
    private Runnable jobMonitorRunnable;

    @BeforeEach
    void setup() {
        widgetJobHandler = new WidgetJobHandler();
        jobMonitorRunnable = JobMonitor.getRunnable(widgetJobHandler);
    }

    @Test
    void testMonitoring() {
        // TODO actually test it
        jobMonitorRunnable.run();
    }
}
