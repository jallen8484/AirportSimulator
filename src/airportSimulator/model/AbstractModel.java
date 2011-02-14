/**
 * @project AirportSimulator
 * @package AirportSimulator.Model
 * @author Brian Bagley
 * @author David Cook
 * @author Jeremy Allen
 * @author Joshua Charles
 * @version 3.0
 */
package AirportSimulator.Model;

import java.util.ArrayList;
import java.util.Iterator;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractModel.
 */
public abstract class AbstractModel implements Model {

	/** The listeners. */
	private ArrayList<ModelListener> listeners = new ArrayList<ModelListener>(5);

	/**
	 * Adds the model listener.
	 * 
	 * @param l
	 *            the l
	 */
	public void addModelListener(ModelListener l) {
		listeners.add(l);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * AirportSimulator.Model.Model#notifyChanged(AirportSimulator.Model.ModelEvent
	 * )
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(ModelEvent event) {

		ArrayList<ModelListener> list = (ArrayList<ModelListener>) listeners.clone();
		Iterator<ModelListener> it = list.iterator();
		while (it.hasNext()) {
			ModelListener ml = it.next();
			ml.modelChanged(event);
		}
	}

	/**
	 * Removes the model listener.
	 * 
	 * @param l
	 *            the l
	 */
	public void removeModelListener(ModelListener l) {
		listeners.remove(l);
	}
}
