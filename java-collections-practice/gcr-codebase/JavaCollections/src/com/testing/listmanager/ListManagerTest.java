package com.testing.listmanager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;
    
    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }
    
    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertEquals(1, list.size());
        assertTrue(list.contains(10));
        
        listManager.addElement(list, 20);
        assertEquals(2, list.size());
    }
    
    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);
        
        assertTrue(listManager.removeElement(list, 20));
        assertEquals(2, list.size());
        assertFalse(list.contains(20));
        
        assertFalse(listManager.removeElement(list, 99));
    }
    
    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));
        
        list.add(10);
        assertEquals(1, listManager.getSize(list));
        
        list.add(20);
        assertEquals(2, listManager.getSize(list));
    }
}
