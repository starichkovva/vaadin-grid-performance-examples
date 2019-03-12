# vaadin-grid-performance-examples
Examples of the Grid component for multiple Vaadin versions.

Main idea - compare loading time of the Grid with 78 columns in it.

### Performance

Vaadin | Spring Boot | Spring | Loading time
-------|-------------|--------|-------------
8.7.x|1.5.19.RELEASE|4.3.22.RELEASE|~ 14 sec
10.0.x|2.0.8.RELEASE|5.0.12.RELEASE|~ 2 sec
13.0.x|2.1.3.RELEASE|5.1.5.RELEASE|~ 2 sec

#### P.S.

They finally did it! Grid creation algorithm fixed in Vaadin 10+.
