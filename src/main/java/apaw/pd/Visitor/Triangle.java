package apaw.pd.Visitor;

public class Triangle extends Figure {
	private double base;

	private double height;

	public Triangle(String description, double base, double height) {
		super(description);
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base * height * 0.5;
	}

	@Override
	public double numberOfSides() {
		return 3;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void accept(VisitorFigura visitorFigura) {
		visitorFigura.visitorTriangle(this);
	}

}
