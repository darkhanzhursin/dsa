package miu.mpp.lab7.junit;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyTestClass {
    private Collection<Object> collection;

    @Before
    public void setUp() {
        collection = new ArrayList<>();
    }

    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
    }
}
