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
 * The Interface Model.
 * @author Joshua Charles
 * @version 5.0
 */
public interface Model
{
	/**
	 * Notify changed.
	 * 
	 * @param e
	 *            the e
	 */
	public void notifyChanged(ModelEvent e);
}
