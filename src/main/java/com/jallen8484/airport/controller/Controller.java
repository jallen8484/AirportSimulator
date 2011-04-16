package controller;

import model.Model;
import view.View;

public interface Controller
{
	void SetModel(Model model);
	Model GetModel();
	View GetView();
	void SetView(View view);
}
