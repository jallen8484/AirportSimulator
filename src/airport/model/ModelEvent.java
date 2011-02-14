package airport.model;

import java.awt.event.ActionEvent;


public class ModelEvent extends ActionEvent
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9201146513507190442L;

	public ModelEvent(Object obj, int id, String message)
	{
		super(obj, id, message);
	}
}
