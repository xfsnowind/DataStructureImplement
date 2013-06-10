package com.xfsnowind.datastructure.List;

import com.xfsnowind.datastructure.ICollection;

/**
 * @author feng
 *
 * @param <E>
 */
public interface IList<E> extends ICollection<E>{
   /**
    * Add value to the position of index.
    * 
    * @param index of position
    * @param element to add.
    * @return True if added.
    */
   public boolean add(int index, E element);

   
   /**
    * Get the member given index.
    * 
    * @param index of member.
    * @return The object.
    */
   public E get(int index);

   
   /**
    * Get the index of given object.
    * 
    * @param o to be checked.
    * @return The index of the input.
    */
   public int indexOf(Object o);

   
   /**
    * Get the last index of the object when list contains multiple same object.
    * 
    * @param object to be checked.
    * @return The last index of the object.
    */
   public int lastIndexOf(Object object);

   
   /**
    * Remove the element at the given position in the list.
    * 
    * @param index - the index of the element to be removed.
    * @return The element previously at the specified position 
    */
   public E remove(int index);

   
   /**
    * Replace or insert object to list. 
    * 
    * @param index - the index of the element to be replaced.
    * @param element - the element to be replaced or inserted.
    * @return The elment previously at the given position.
    */
   public E set(int index, E element);
   
   
   public Object[] toArray();

   
   public <T> T[] toArray(T[] a);
}
