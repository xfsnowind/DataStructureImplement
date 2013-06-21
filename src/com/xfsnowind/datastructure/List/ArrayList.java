package com.xfsnowind.datastructure.List;

import java.util.Arrays;

import com.xfsnowind.datastructure.ICollection;
import com.xfsnowind.datastructure.IIterable;

/**
 * http://en.wikipedia.org/wiki/Dynamic_array
 * The data in the ArrayList should be continously
 * 
 * @author feng
 *
 * @param <E>
 */
public class ArrayList<E> implements IList<E>{
   private int currentSize = 0;
   private static final int DEFAULT_SIZE = 10;
   private E[] arrays;

   @SuppressWarnings("unchecked")
   public ArrayList() {
      this.arrays = (E[]) new Object[DEFAULT_SIZE];
   }

   
   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#add(java.lang.Object)
    */
   @Override
   public boolean add(E value) {
      return this.add(this.currentSize, value);
   }
   
   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#add(int, java.lang.Object)
    */
   @Override
   public boolean add(int index, E element) {
      if (this.currentSize >= this.arrays.length) {
         //increase the length of array to index
         this.arrays = Arrays.copyOf(this.arrays, this.arrays.length + (this.currentSize >> 1));
      } else {
         if (index > this.currentSize) {
            return false;
         } else if (index < this.currentSize){
            //extend the size of array with half
            System.arraycopy(arrays, index, arrays, index + 1, this.currentSize - index);
         }
      }
      
      this.arrays[index] = element;
      this.currentSize++;
      return true;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#addAll(com.xfsnowind.datastructure.ICollection)
    */
   @Override
   public boolean addAll(ICollection<? extends E> values) {
      return false;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#clear()
    */
   @Override
   public void clear() {
      for (int i = 0; i < this.arrays.length; i++) {
         if (null != this.arrays[i]) {
            this.arrays[i] = null;
         }
      }
      this.currentSize = 0;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#contains(java.lang.Object)
    */
   @Override
   public boolean contains(Object o) {
      for (E tempValue : this.arrays) {
         if (o.equals(tempValue)) {
            return true;
         }
      }
      return false;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#containsAll(com.xfsnowind.datastructure.ICollection)
    */
   @Override
   public boolean containsAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#isEmpty()
    */
   @Override
   public boolean isEmpty() {
      return this.currentSize == 0;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#remove(java.lang.Object)
    */
   @Override
   public boolean remove(Object object) {
      for (int i = 0; i < this.arrays.length; i++) {
         if (object.equals(this.arrays[i])) {
            if (null == this.remove(i)) {
               return false;
            } else {
               return true;
            }
         }
      }
      return true;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#remove(int)
    */
   @Override
   public E remove(int index) {
      E tempValue = null;
      if (index < 0 || index >= this.currentSize) {
         return null;
      }
      
      tempValue = this.get(index);
      this.arrays[index] = null;
      if (index != --this.currentSize) {
         System.arraycopy(this.arrays, index + 1, this.arrays, index, this.currentSize - index);
      }
      
      return tempValue;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#removeAll(com.xfsnowind.datastructure.ICollection)
    */
   @Override
   public boolean removeAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.ICollection#size()
    */
   @Override
   public int size() {
      return this.currentSize;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.IIterator#iterator()
    */
   @Override
   public IIterable<E> iterator() {
      // TODO Auto-generated method stub
      return null;
   }

   

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#get(int)
    */
   @Override
   public E get(int index) {
      if (index < 0 || index >= this.arrays.length) {
         return null;
      }
      return this.arrays[index];
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#indexOf(java.lang.Object)
    */
   @Override
   public int indexOf(Object o) {
      for (int i = 0; i < this.arrays.length; i++) {
         if (o.equals(this.arrays[i])) {
            return i;
         }
      }
      return -1;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#lastIndexOf(java.lang.Object)
    */
   @Override
   public int lastIndexOf(Object object) {
      for (int i = this.currentSize - 1; i >= 0; i--) {
         if (object.equals(this.arrays[i])) {
            return i;
         }
      }
      return -1;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#set(int, java.lang.Object)
    */
   @Override
   public E set(int index, E element) {
      E tempValue = null;
      if (this.currentSize >= this.arrays.length) {
         //increase the length of array to index
         this.arrays = Arrays.copyOf(this.arrays, this.arrays.length + (this.currentSize >> 1));
      }
      
      if (index < 0 || index > this.currentSize) {
         return null;
      }
      
      tempValue = this.get(index);
      this.arrays[index] = element;
      if (null == tempValue) {
         this.currentSize++;
      }
      return tempValue;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#toArray()
    */
   @Override
   public Object[] toArray() {
      // TODO Auto-generated method stub
      return null;
   }

   /* (non-Javadoc)
    * @see com.xfsnowind.datastructure.List.IList#toArray(T[])
    */
   @Override
   public <T> T[] toArray(T[] a) {
      // TODO Auto-generated method stub
      return null;
   }
}
