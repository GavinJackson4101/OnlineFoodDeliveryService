public interface BagInterface<T>
{

//Gets the current number of entries in this bag.


    public int getCurrentSize();

// Adds a new entry to this bag.

    public boolean add(T newEntry);

    // Retrieves all entries that are in this bag.
    public T[] toArray();
}