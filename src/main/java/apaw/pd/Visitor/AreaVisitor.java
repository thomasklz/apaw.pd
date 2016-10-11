package apaw.pd.Visitor;

public class AreaVisitor extends VisitorFigura {

	private double area;

	public double getArea() {
		return area;
	}

	public AreaVisitor() {

	}

	@Override
	public void visitorCircle(Circle circle) {
		area += circle.area();
	}

	@Override
	public void visitorSquare(Square square) {
		area += square.area();
	}

	@Override
	public void visitorTriangle(Triangle triangle) {
		area += triangle.area();
	}

}
