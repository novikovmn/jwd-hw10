package by.epam.hw10.dragon_treasure.view;

import java.util.List;

import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.logic.DragoncCaveLogic;

public class DragonCaveView {

	private DragoncCaveLogic logic;

	public DragonCaveView() {
	}

	public DragonCaveView(DragoncCaveLogic logic) {
		this.logic = logic;
	}

	public DragoncCaveLogic getLogic() {
		return logic;
	}

	public void setLogic(DragoncCaveLogic logic) {
		this.logic = logic;
	}

	public void printLastGoodBye() {
		System.out.println("Have a nice day)");
	}

	public void printTreasures(List<Treasure> treasures) {
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}

	public void printTreasures(Treasure treasures) {
		System.out.println(treasures);
	}

}
