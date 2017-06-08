package javatest3;

/* 如果您需要一組可以隨時抽換的元件，並且希望可以簡單地 一次抽換，
 * 則可以考慮使用Abstract Factory。例如視窗程式中視感（Look-and- feel）元件的調換，
 * 就是Abstract Factory的應用場合。
 */

public class Factory {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(25, 10);
		PointCornerFactory factory = new PointCornerFactory() {
			public Point getPoint() {
				return new Point() {
					public void line(int width) {
						
						
						for(int i = 0; i < width; i++) {
							System.out.print("-");
						}
						
					}
				};
			}

			public Corner getCorner() {
				return new Corner() {
					public void leftUp() { System.out.print('+'); }
					public void rightUp() { System.out.print('+'); }
					public void leftDown() { System.out.print('+'); }
					public void rightDown() { System.out.print('+'); }
				};
			}
		};
		
		
		rect.paint(factory);        
	}

}
