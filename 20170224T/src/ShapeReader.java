
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
		
		//shape.rolling();		//���� �ִ� �޼ҵ�
		//shape.stack();			//�簢���� �ִ� �޼ҵ�
		//������ ���������� �� ������ ���� Ȯ��� ����� ȣ�� �� �� ����.
		
		if(shape instanceof Circle){
			Circle circle = (Circle)shape;
			circle.rolling();
		}else if (shape instanceof Square){
			Square square = (Square)shape;
			square.stack();
		}else if(shape instanceof Triangle){
			System.out.println("�ﰢ��~");
		}
	}
	
	
	
	
	
	
	
	
	
}
