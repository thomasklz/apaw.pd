package apaw.pd.Visitor;

public class NumberOfSidersVisitor extends VisitorFigura {
	private double numberOfSiders;

	public NumberOfSidersVisitor() {

	}

	public double getNumberOfSiders() {
		return numberOfSiders;
	}

	@Override
	public void visitorCircle(Circle circle) {
		numberOfSiders += circle.numberOfSides();
	}

	@Override
	public void visitorSquare(Square square) {
		numberOfSiders += square.numberOfSides();
	}

	@Override
	public void visitorTriangle(Triangle triangle) {
		numberOfSiders += triangle.numberOfSides();
	}

}
