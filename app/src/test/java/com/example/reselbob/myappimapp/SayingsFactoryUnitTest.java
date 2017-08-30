package com.example.reselbob.myappimapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SayingsFactoryUnitTest {
    @Test
    public void canGetStringFromFactory() throws Exception {
        String str = SayingsFactory.getInstance().getNextSaying();
        assertNotNull(str);
        assertNotEquals(SayingsFactory.getInstance().getNextSaying(), SayingsFactory.getInstance().getNextSaying());
    }

    @Test
    public void sayingFactoryReturnsDiffentStings() throws Exception {
        String str = SayingsFactory.getInstance().getNextSaying();
        assertNotNull(str);
        for(int i = 0; i < 10; i++){
            assertNotEquals(SayingsFactory.getInstance().getNextSaying(), SayingsFactory.getInstance().getNextSaying());
        }
    }
}