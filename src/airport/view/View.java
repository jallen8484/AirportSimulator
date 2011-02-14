package airport.view;

import airport.controller.Controller;
import airport.model.Model;

public interface View
{
	Controller GetController();
	void SetController(Controller controller);
	Model GetModel();
	void SetModel(Model model);
}
