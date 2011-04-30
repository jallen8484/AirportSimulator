/**
 * @project AirportSimulator
 * @package AirportSimulator.Model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 5.0
 */
package AirportSimulator.Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Class AbstractModel.
 * @author Joshua Charles
 * @version 5.0
 */
public abstract class AbstractModel implements Model
{
	/** The listeners. */
	private ArrayList<ModelListener> listeners = new ArrayList<ModelListener>(5);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.Model#notifyChanged(AirportSimulator.Model.ModelEvent
	 * )
	 */
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

	/**
	 * Adds the model listener.
	 * 
	 * @param l
	 *            the l
	 */
	public void addModelListener(ModelListener l)
	{
		listeners.add(l);
	}

	/**
	 * Removes the model listener.
	 * 
	 * @param l
	 *            the l
	 */
	public void removeModelListener(ModelListener l)
	{
		listeners.remove(l);
	}
}
