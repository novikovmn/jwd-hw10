package by.epam.hw10.dragon_treasure.menu;

import java.util.Scanner;

import by.epam.hw10.dragon_treasure.bean.DragonCave;
import by.epam.hw10.dragon_treasure.controller.DragonCaveController;
import by.epam.hw10.dragon_treasure.helper.DragonCaveHelper;
import by.epam.hw10.dragon_treasure.logic.DragoncCaveLogic;
import by.epam.hw10.dragon_treasure.view.DragonCaveView;

public class UserMenu {

	// create cave with list of treasures
	DragonCave cave = new DragonCave(new DragonCaveHelper().createTreasures());

	// create logic methods
	DragoncCaveLogic logic = new DragoncCaveLogic();

	// create view methods
	DragonCaveView view = new DragonCaveView(logic);

	// create controller
	DragonCaveController controller = new DragonCaveController(view);

	public void runMenu() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("=========================================================");
			System.out.println("\tPlease, enter the required item:");
			System.out.println("1 - to show all treasures list;");
			System.out.println("2 - to show the most expensive treasure;");
			System.out.println("3 - to show treasures list for a given total sum;");
			System.out.println("0 - to end the application.");
			System.out.print(">> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Your input is not an integer! Try again.\n>> ");
			}

			int item = sc.nextInt();

			switch (item) {

			case 1:
				System.out.println("\tAll dragon's treasures:");
				controller.getView().getLogic().showAllTreasures(cave.getDragonTreasures());
				break;

			case 2:
				System.out.println("\tThe most expensive treasure:");
				controller.getView().printTreasures(controller.getView().getLogic().showMostExpensiveTreasure(cave));
				break;

			case 3:
				System.out.println("Enter total sum:");
				System.out.print(">> ");

				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.print("Your input is not number! Try again.\n>> ");
				}

				double totalSum = sc.nextDouble();
				System.out.println("\tTreasures list for a given total sum:");
				controller.getView().printTreasures(
						controller.getView().getLogic().selectTreasuresForAGivenTotalSum(cave, totalSum));
				break;

			case 0:
				controller.getView().printLastGoodBye();
				return;

			default:
				System.out.println("Sorry. Incorrect input(");
			}

		}

	}

}
