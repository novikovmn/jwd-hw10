package by.epam.hw10.dragon_treasure.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw10.dragon_treasure.bean.Treasure;

public class DragonCaveHelper {

	public List<Treasure> createTreasures() {
		List<Treasure> treasures = new ArrayList<>();
		treasures.add(new Treasure("Незерак", 120.0));
		treasures.add(new Treasure("Светокамень", 75.0));
		treasures.add(new Treasure("Призмарин", 215.10));
		treasures.add(new Treasure("Поршень", 50.0));
		treasures.add(new Treasure("Динамит", 320.0));
		treasures.add(new Treasure("Лазурит", 500.0));
		treasures.add(new Treasure("Золотой меч", 700.0));
		treasures.add(new Treasure("Порох", 61.0));
		treasures.add(new Treasure("Уголь", 35.0));
		treasures.add(new Treasure("Печенье", 10.0));
		return treasures;
	}

}
