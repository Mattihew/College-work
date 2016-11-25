package adapters;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<E> implements Enumeration<E>
{
	private Iterator<E> iterator;
	
	public IteratorEnumeration(final Iterator<E> iterator)
	{
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements()
	{
		return this.iterator.hasNext();
	}

	@Override
	public E nextElement()
	{
		return this.iterator.next();
	}

}
