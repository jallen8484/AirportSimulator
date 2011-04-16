package view;

import controller.Controller;
import model.Model;

public interface View
{
	Controller GetController();
	void SetController(Controller controller);
	Model GetModel();
	void SetModel(Model model);
}
