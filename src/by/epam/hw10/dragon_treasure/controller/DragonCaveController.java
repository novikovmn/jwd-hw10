package by.epam.hw10.dragon_treasure.controller;

import by.epam.hw10.dragon_treasure.view.DragonCaveView;

public class DragonCaveController {

	private DragonCaveView view;

	public DragonCaveController(DragonCaveView view) {
		this.view = view;
	}

	public DragonCaveView getView() {
		return view;
	}

	public void setView(DragonCaveView view) {
		this.view = view;
	}

}
