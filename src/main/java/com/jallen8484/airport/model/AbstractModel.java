package model;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class AbstractModel implements Model
{
	private ArrayList<ModelListener> listeners = new ArrayList<ModelListener>(5);

	public void notifyChanged(ModelEvent event)
	{
		@SuppressWarnings("unchecked")
		ArrayList<ModelListener> list = (ArrayList<ModelListener>)listeners.clone();
		Iterator<ModelListener> it = list.iterator();
		while(it.hasNext())
		{
			ModelListener ml = (ModelListener)it.next();
			ml.modelChanged(event);
		}
	}

	public void addModelListener(ModelListener l)
	{
		listeners.add(l);
	}

	public void removeModelListener(ModelListener l)
	{
		listeners.remove(l);
	}
}
