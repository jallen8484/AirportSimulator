package controller;

import model.Model;
import view.View;

public abstract class AbstractController implements Controller
{
	private View view;
	private Model model;
	
	public void SetModel(Model model)
	{
		this.model = model;
	}

	public Model GetModel()
	{
		return model;
	}

	public View GetView()
	{
		return view;
	}

	public void SetView(View view)
	{
		this.view = view;
	}
}
