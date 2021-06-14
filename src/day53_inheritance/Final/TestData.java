package day53_inheritance.Final;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * TestData class that has a list of Constants
 */

public final class TestData{
    public static final String ADMIN_USERNAME = "Admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;

}

/**
 * ERROR: Cannot inherit from final class
 */

// class Child extends TestData{}
