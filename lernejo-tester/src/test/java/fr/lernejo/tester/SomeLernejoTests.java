package fr.lernejo.tester;

import fr.lernejo.tester.api.TestMethod;

public class SomeLernejoTests {
    @TestMethod
    public void ok() {return;}

    @TestMethod
    public void ko() {throw new IllegalStateException();}

    public void none() {return;}
}
