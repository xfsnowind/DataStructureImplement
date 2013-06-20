package com.xfsnowind.datastructure;

public interface ICollection<E> extends IIterable<E>{
   /**
    * Add value to the end of collection.
    * 
    * @param value to add.
    * @return True if added.
    */
   public boolean add(E value);
   
   /**
    * Adds all of the elements in the specified collection to this collection.
    * 
    * @param values - collection containing elements to be added to this collection 
    * @return True if this collection changed as a result of the call.
    */
   public boolean addAll(ICollection<? extends E> values);
   
   /**
    * Clean the collection.
    */
   public void clear();
   
   /**
    * Check if the object exists in the collection.
    * 
    * @param o to be checked.
    * @return True if exists.
    */
   public boolean contains(Object o);
   
   /**
    * Returns true if this collection contains all of the elements in the specified collection.
    * 
    * @param values - collection to be checked for containment in this collection.
    * @return True if the collection contains all the elements in the given collection.
    */
   public boolean containsAll(ICollection<?> values);
   
   /**
    * Check if collection is empty.
    * 
    * @return True if empty.
    */
   public boolean isEmpty();
   
   /**
    * Remove the given object.
    * 
    * @param object to be removed.
    * @return True if removed.
    */
   public boolean remove(Object object);
   
   /**
    * Remove all elements in this collection which are also contained in the given collection.
    * 
    * @param values - collection containing elements to be removed from this collection.
    * @return True if this collection changed as a result of the call. 
    */
   public boolean removeAll(ICollection<?> values);

   /**
    * @return The size of collection.
    */
   public int size();
}
