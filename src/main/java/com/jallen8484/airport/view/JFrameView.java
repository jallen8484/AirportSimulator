package view;

import javax.swing.JFrame;

import controller.Controller;
import model.Model;
import model.AbstractModel;
import model.ModelListener;


public abstract class JFrameView extends JFrame implements View, ModelListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -93958393837877814L;
	private Model model;
	private Controller controller;

	public JFrameView(Model model, Controller controller)
	{
		SetModel(model);
		SetController(controller);
	}

	public void RegisterWithModel()
	{
		((AbstractModel)model).addModelListener(this);
	}

	public Controller GetController()
	{
		return controller;
	}

	public void SetController(Controller controller)
	{
		this.controller = controller;
	}

	public Model GetModel()
	{
		return model;
	}

	public void SetModel(Model model)
	{
		this.model = model;
		RegisterWithModel();
	}
}
