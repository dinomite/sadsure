# sadsure
An example of Java type erasure sadness.

`Widgets` & `Fobbles` are two different things that need work done on them.  They don't share a common supertype, but both implement the `Identifiable` interface, which we want to be able to log general information about the `Widget` & `Fobble` jobs.  The `JobHandler`s (`WidgetJobHandlers` and `FobbleJobHandlers`) are parameterized so the `JobMonitor` can `getJobs()` from them, and then pass back each individual job to the `JobHandler` via `doSomethingTo()`.

Java's type erasure makes this impossible, as demonstrated in `WidgetJobHandlerTest` on line 14.
