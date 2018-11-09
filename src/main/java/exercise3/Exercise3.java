package exercise3;

public class Exercise3 {
	public static void main(String[] args) {
		new Panel(new Drawable[]{
			new ConvexPolygon(new Point[]{
				new Point(200, 100),
				new Point(200, 200),
				new Point(100, 200),
				new Point(100, 100),
			})
		});
	}
}
