/**
 * The class represents for the circular sorted linked list
 * @author Varik Hoang <varikmp@uw.edu>
 * @author FIRST_NAME LAST_NAME
 * @param <Type> the generic data type
 */
public class SortedList<Type extends Comparable<? super Type>>
extends AbstractList<Type>
implements List<Type>
{
	/**
	 * The constructor for the circular sorted linked list.
	 */
	public SortedList()
	{
		super();
	}
	
	@Override
	public boolean contains(Type value)
	{
		return getIndex(value) >= 0;
	}

	@Override
	public void insert(Type value)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type remove(Type value)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type removeAtIndex(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int index, Type value)
	{
		throw new UnsupportedOperationException("The SortedList does not support set method");
	}

	@Override
	public Type get(int index)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
