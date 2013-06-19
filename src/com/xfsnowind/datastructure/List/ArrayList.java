package com.xfsnowind.datastructure.List;

import java.util.Arrays;

import com.xfsnowind.datastructure.ICollection;
import com.xfsnowind.datastructure.IIterator;

public class ArrayList<E> implements IList<E>{
   private int currentSize = 0;
   private static final int DEFAULT_SIZE = 10;
   private E[] arrays;

   public ArrayList() {
      this.arrays = (E[]) new Object[DEFAULT_SIZE];
   }

   @Override
   public boolean add(E value) {
      return this.add(this.currentSize, value);
   }
   
   @Override
   public boolean add(int index, E element) {
      if (index >= this.arrays.length) {
         //increase the length of array to index
         this.arrays = Arrays.copyOf(this.arrays, index + 1);
         this.arrays[index] = element;
      } else {
         if (this.currentSize == this.arrays.length) {
            //extend the size of array with half
            this.arrays = Arrays.copyOf(this.arrays, this.currentSize + (this.currentSize >> 1));
            return false;
         } else {
            if (null != this.get(index)) {
               return false;
            } else {
               System.arraycopy(arrays, index, arrays, index + 1, this.currentSize - index);
               this.arrays[index] = element;
            }
         }
      }

      this.currentSize++;
      return true;
   }

   @Override
   public boolean addAll(ICollection<? extends E> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void clear() {
      for (int i = 0; i < this.arrays.length; i++) {
         if (null != this.arrays[i]) {
            this.arrays[i] = null;
         }
      }
   }

   @Override
   public boolean contains(Object o) {
      for (E tempValue : this.arrays) {
         if (o.equals(tempValue)) {
            return true;
         }
      }
      return false;
   }

   @Override
   public boolean containsAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean isEmpty() {
      return this.currentSize == 0;
   }

   @Override
   public boolean remove(Object object) {
      for (int i = 0; i < this.arrays.length; i++) {
         if (object.equals(this.arrays[i])) {
            this.arrays[i] = null;
         }
      }
      return true;
   }

   @Override
   public E remove(int index) {
      E tempValue = null;
      if (index >= this.arrays.length) {
         return null;
      } 
      tempValue = this.get(index);
      this.arrays[index] = null;
      return tempValue;
   }

   @Override
   public boolean removeAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public int size() {
      return this.currentSize;
   }

   @Override
   public IIterator<E> iterator() {
      // TODO Auto-generated method stub
      return null;
   }

   

   @Override
   public E get(int index) {
      return this.arrays[index];
   }

   @Override
   public int indexOf(Object o) {
      for (int i = 0; i < this.arrays.length; i++) {
         if (o.equals(this.arrays[i])) {
            return i;
         }
      }
      return -1;
   }

   @Override
   public int lastIndexOf(Object object) {
      for (int i = this.arrays.length - 1; i >= 0; i--) {
         if (o.equals(this.arrays[i])) {
            return i;
         }
      }
      return -1;
   }

   @Override
   public E set(int index, E element) {
      E tempValue = null;
      if (index >= this.arrays.length) {
         //increase the length of array to index
         this.arrays = Arrays.copyOf(this.arrays, index + 1);
      } else if (this.currentSize == this.arrays.length) {
         //extend the size of array with half
         this.arrays = Arrays.copyOf(this.arrays, this.currentSize + (this.currentSize >> 1));
      }

      tempValue = this.get(index);
      this.arrays[index] = element;
      if (null != tempValue) {
         this.currentSize++;
      }
      return tempValue;
   }

   @Override
   public Object[] toArray() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public <T> T[] toArray(T[] a) {
      // TODO Auto-generated method stub
      return null;
   }
}
