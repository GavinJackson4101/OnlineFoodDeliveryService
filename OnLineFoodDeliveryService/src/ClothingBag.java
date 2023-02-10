public class ClothingBag<T> implements BagInterface<T>
{
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 20;

    public ClothingBag()
    {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ClothingBag(int capacity) {
// TODO Auto-generated constructor stub
        T[] tempBag = (T[])new Object[DEFAULT_CAPACITY];
        bag = tempBag;
        numberOfEntries = 0;
    }
//number of entries with clothing bag capacity
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast

        for (int index = 0; index < numberOfEntries; index++)
        {
            result[index] = bag[index];
        } // end for

        return result;
    }
    //number of entries index and result
    @Override
    public boolean add(T newEntry) {
// Add the ClothingItem to the Bag
        boolean result = true;
        if (isArrayFull())
        {
            result = false;
        }
        else
        { // Assertion: result is true here
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        } // end if

        return result;
    }
    //else return for false
    @Override
    public int getCurrentSize() {
        return 0;
    }

    // Returns true if the array bag is full, or false if not.
    private boolean isArrayFull()
    {
        return numberOfEntries >= bag.length;
    } // end isArrayFull

}