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

/**
 * The listener interface for receiving model events. The class that is
 * interested in processing a model event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addModelListener<code> method. When
 * the model event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see ModelEvent
 * @author Joshua Charles
 * @version 5.0
 */
public interface ModelListener
{
	/**
	 * Model changed.
	 * 
	 * @param event
	 *            the event
	 */
	public void modelChanged(ModelEvent event);
}
