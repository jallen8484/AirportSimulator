package airport.controller;

import airport.model.Model;
import airport.view.View;

public interface Controller
{
	void setModel(Model model);
	Model getModel();
	View getView();
	void setView(View view);
}
