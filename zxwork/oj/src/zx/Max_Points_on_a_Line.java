package zx;

public class Max_Points_on_a_Line {

	public static int maxPoints(Point[] points) {
		if (points == null) {
			return 0;
		}
		if (points.length == 0)
			return 0;
		if (points.length == 1)
			return 1;
		if (points.length == 2)
			return 2;
		int max = 2;

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				int num = 2;
				for (int j2 = 0; j2 < points.length; j2++) {
					if (i != j && j != j2 && i != j2)
						if (points[i].x == points[j].x
								&& points[j].x == points[j2].x)
							num++;
						else if (points[i].y == points[j].y
								&& points[j].y == points[j2].y)
							num++;
						else if ((points[i].y == points[j2].y && points[i].x == points[j2].x)
								|| (points[j].y == points[j2].y && points[j].x == points[j2].x))
							num++;
						else if ((double) (points[i].y - points[j].y)
								/ (double) (points[i].x - points[j].x) == (double) (points[i].y - points[j2].y)
								/ (double) (points[i].x - points[j2].x))
							num++;
				}
				if (num > max)
					max = num;

			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(1, 2);
		Point b = new Point(2, 2);
		Point c = new Point(1, 3);
		Point d = new Point(1, 4);
		Point[] points = { a, b, c, d };
		System.out.println(maxPoints(points));
	}

}

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}
