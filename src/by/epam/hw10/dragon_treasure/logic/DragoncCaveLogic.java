package by.epam.hw10.dragon_treasure.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw10.dragon_treasure.bean.DragonCave;
import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.view.DragonCaveView;

public class DragoncCaveLogic {

	public void showAllTreasures(List<Treasure> treasures) {
		new DragonCaveView().printTreasures(treasures);
	}

	public Treasure showMostExpensiveTreasure(DragonCave dragonCave) {
		List<Treasure> treasures = dragonCave.getDragonTreasures();
		Treasure result;

		double maxPrice = treasures.get(0).getPrice();
		int maxPriceIndex = 0;
		for (int i = 0; i < treasures.size(); i++) {
			if (treasures.get(i).getPrice() > maxPrice) {
				maxPrice = treasures.get(i).getPrice();
				maxPriceIndex = i;
			}
		}

		result = treasures.get(maxPriceIndex);

		return result;
	}

	public List<Treasure> selectTreasuresForAGivenTotalSum(DragonCave dragonCave, double totalSum) {
		List<Treasure> treasures = dragonCave.getDragonTreasures();
		List<Treasure> result = new ArrayList<>();

		double sum = 0;
		boolean flag = false;

		while (!flag) {
			for (int i = 0; i < treasures.size(); i++) {
				if (sum + treasures.get(i).getPrice() <= totalSum) {
					result.add(treasures.get(i));
					sum += treasures.get(i).getPrice();
				} else {
					flag = true;
					break;
				}
			}
		}

		return result;
	}

}
