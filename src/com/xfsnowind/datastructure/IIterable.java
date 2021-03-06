package com.xfsnowind.datastructure;

public interface IIterable<E> {
   /**
    * Returns an iterator over a set of elements of type E. 
    * 
    * @return an Iterator.
    */
   public IIterable<E> iterator();
}
