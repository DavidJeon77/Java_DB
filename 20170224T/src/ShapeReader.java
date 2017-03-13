
public class ShapeReader {

//	public void readShape(Circle circle){
//		
//	}
//	
//	public void readShape(Square square){
//		
//	}
	
	public void readShape(Shape shape){
		shape.showShapeInfo();
		
		//shape.rolling();		//원에 있는 메소드
		//shape.stack();			//사각형에 있는 메소드
		//때문에 도형에서는 각 도형의 따로 확장된 기능을 호출 할 수 없다.
		
		if(shape instanceof Circle){
			Circle circle = (Circle)shape;
			circle.rolling();
		}else if (shape instanceof Square){
			Square square = (Square)shape;
			square.stack();
		}else if(shape instanceof Triangle){
			System.out.println("삼각형~");
		}
	}
	
	
	
	
	
	
	
	
	
}
