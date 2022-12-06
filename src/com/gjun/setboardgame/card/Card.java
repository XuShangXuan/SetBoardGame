package com.gjun.setboardgame.card;

import java.util.Objects;

import com.gjun.setboardgame.attributes.Color;
import com.gjun.setboardgame.attributes.FillUp;
import com.gjun.setboardgame.attributes.Quantity;
import com.gjun.setboardgame.attributes.Shape;

public class Card {

	private int id;
	private Color color;
	private Quantity quantity;
	private Shape shape;
	private FillUp fillUp;

	public Card(int id, Color color, Quantity quantity, Shape shape, FillUp fillUp) {
		super();
		this.id = id;
		this.color = color;
		this.quantity = quantity;
		this.shape = shape;
		this.fillUp = fillUp;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Quantity getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public FillUp getFillUp() {
		return fillUp;
	}

	public void setFillUp(FillUp fillUp) {
		this.fillUp = fillUp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, fillUp, quantity, shape);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return color == other.color && fillUp == other.fillUp && quantity == other.quantity && shape == other.shape;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", color=" + color + ", quantity=" + quantity + ", shape=" + shape + ", fillUp="
				+ fillUp + "]";
	}

}
