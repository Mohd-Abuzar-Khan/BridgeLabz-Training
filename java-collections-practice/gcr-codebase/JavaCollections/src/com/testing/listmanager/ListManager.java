package com.testing.listmanager;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }
    
    public boolean removeElement(List<Integer> list, int element) {
        if (list != null) {
            return list.remove(Integer.valueOf(element));
        }
        return false;
    }
    
    public int getSize(List<Integer> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
