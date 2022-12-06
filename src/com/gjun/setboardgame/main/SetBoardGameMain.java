package com.gjun.setboardgame.main;

import java.util.ArrayList;
import java.util.List;

import com.gjun.setboardgame.attributes.Color;
import com.gjun.setboardgame.attributes.FillUp;
import com.gjun.setboardgame.attributes.Quantity;
import com.gjun.setboardgame.attributes.Shape;
import com.gjun.setboardgame.card.Card;

public class SetBoardGameMain {

	public static void main(String[] args) {

		Card cardA = new Card(1, Color.red, Quantity.one, Shape.ellipse, FillUp.hollow);
		Card cardB = new Card(2, Color.purple, Quantity.two, Shape.rectangle, FillUp.solid);
		Card cardC = new Card(3, Color.red, Quantity.one, Shape.ellipse, FillUp.hollow);
		Card cardD = new Card(4, Color.red, Quantity.one, Shape.ellipse, FillUp.hollow);
		Card cardE = new Card(5, Color.green, Quantity.three, Shape.earthworm, FillUp.meshBottom);

		List<Card> list = new ArrayList<Card>();
		list.add(cardA);
		list.add(cardB);
		list.add(cardC);
		list.add(cardD);
		list.add(cardE);

		searchSet(list);

	}

	private static void searchSet(List<Card> list) {

		List<Card> listTemp = new ArrayList<Card>();

		for (int i = 0; i < list.size() - 2; i++) {
			listTemp.add(list.get(i));
			for (int j = 1 + i; j < list.size() - 1; j++) {
				listTemp.add(list.get(j));
				for (int k = 2 + j - 1; k < list.size(); k++) {
					listTemp.add(list.get(k));
					isSet(listTemp);
					listTemp.remove(listTemp.size() - 1);
				}
				listTemp.remove(listTemp.size() - 1);
			}
			listTemp.remove(listTemp.size() - 1);
		}

	}

	public static void isSet(List<Card> listTemp) {

		int color = 0;
		if (listTemp.get(0).getColor().equals(listTemp.get(1).getColor())) {
			color++;
		}
		if (listTemp.get(1).getColor().equals(listTemp.get(2).getColor())) {
			color++;
		}
		if (listTemp.get(2).getColor().equals(listTemp.get(0).getColor())) {
			color++;
		}

		if (color == 1 || color == 2) {
			System.out.println("不是一個SET");
			showSet(listTemp);
			return;
		}

		int fillUp = 0;
		if (listTemp.get(0).getFillUp().equals(listTemp.get(1).getFillUp())) {
			fillUp++;
		}
		if (listTemp.get(1).getFillUp().equals(listTemp.get(2).getFillUp())) {
			fillUp++;
		}
		if (listTemp.get(2).getFillUp().equals(listTemp.get(0).getFillUp())) {
			fillUp++;
		}

		if (fillUp == 1 || fillUp == 2) {
			System.out.println("不是一個SET");
			showSet(listTemp);
			return;
		}

		int quantity = 0;
		if (listTemp.get(0).getQuantity().equals(listTemp.get(1).getQuantity())) {
			quantity++;
		}
		if (listTemp.get(1).getQuantity().equals(listTemp.get(2).getQuantity())) {
			quantity++;
		}
		if (listTemp.get(2).getQuantity().equals(listTemp.get(0).getQuantity())) {
			quantity++;
		}

		if (quantity == 1 || quantity == 2) {
			System.out.println("不是一個SET");
			showSet(listTemp);
			return;
		}

		int shape = 0;
		if (listTemp.get(0).getShape().equals(listTemp.get(1).getShape())) {
			shape++;
		}
		if (listTemp.get(1).getShape().equals(listTemp.get(2).getShape())) {
			shape++;
		}
		if (listTemp.get(2).getShape().equals(listTemp.get(0).getShape())) {
			shape++;
		}

		if (shape == 1 || shape == 2) {
			System.out.println("不是一個SET");
			showSet(listTemp);
			return;
		}

		System.out.println("是一個SET");
		showSet(listTemp);

	}

	public static void showSet(List<Card> listTemp) {

		for (Card c : listTemp) {
			System.out.println(c);
		}
		System.out.println("---------------------------------------------------------------------------");
	}

}
