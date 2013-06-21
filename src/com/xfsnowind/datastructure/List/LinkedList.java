package com.xfsnowind.datastructure.List;

import com.xfsnowind.datastructure.ICollection;
import com.xfsnowind.datastructure.IIterable;

/**
 * http://en.wikipedia.org/wiki/Linked_list
 * 
 * @author feng
 *
 * @param <E>
 */
public class LinkedList<E> implements IList<E> {
   
   private int currentSize = 0;
   private Node<E> head = null;
   private Node<E> tail = null;

   @Override
   public boolean add(E value) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean addAll(ICollection<? extends E> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void clear() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public boolean contains(Object o) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean containsAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean isEmpty() {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean remove(Object object) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean removeAll(ICollection<?> values) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public int size() {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public IIterable<E> iterator() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean add(int index, E element) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public E get(int index) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int indexOf(Object o) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int lastIndexOf(Object object) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public E remove(int index) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public E set(int index, E element) {
      // TODO Auto-generated method stub
      return null;
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
   
   private static class Node<T> {

      private T value = null;
      private Node<T> prev = null;
      private Node<T> next = null;

      private Node() { }

      private Node(T value) {
          this.value = value;
      }

  }


}
