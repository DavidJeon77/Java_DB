public class ShapeReader {

	public void readShape(Shape shape) {
		shape.showShapeInfo();

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.rolling();
		} else if (shape instanceof Square) {
			Square square = (Square) shape;
			square.stack();
		} else if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
		} else {
			System.out.println("can`t get it");
		}

	}

}
