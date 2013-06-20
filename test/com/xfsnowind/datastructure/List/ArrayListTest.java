package com.xfsnowind.datastructure.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
   
   private ArrayList<Integer> list;
   
   @Before
   public void init() {
      this.list = new ArrayList<Integer>();
      assertTrue(this.list.isEmpty());
   }


   @Test
   public void testAdd() {
      assertTrue(this.list.add(0));
      assertFalse(this.list.add(2, 2));
      assertFalse(this.list.add(12, 12));
      assertEquals(1, this.list.size());
      assertTrue(this.list.add(13));
      assertTrue(this.list.add(2, 3));
      assertEquals(new Integer(3), this.list.get(2));
      assertEquals(3, list.size());
   }
   
   @Test
   public void testSet() {
      testAdd();
      assertEquals(new Integer(3), this.list.set(2, 20));
      assertEquals(new Integer(20), this.list.get(2));
      assertEquals(3, list.size());
   }
   
   @Test
   public void testRemove() {
      testSet();
      assertEquals(new Integer(20), this.list.remove(2));
      assertEquals(2, list.size());
      assertEquals(null, this.list.remove(2));
      assertEquals(2, list.size());
      assertTrue(this.list.remove(new Integer(13)));
      assertEquals(1, list.size());
   }

}
