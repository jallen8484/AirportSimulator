package airport.controller;

import airport.model.Model;
import airport.view.View;

public abstract class AbstractController implements Controller {
	private View view = null;
	private Model model = null;
	
	public void setModel(Model model)	{	this.model = model;	}
	public Model getModel()	{	return model;	}
	public View getView()	{	return view;	}
	public void setView(View view) {	this.view = view;	}
}
