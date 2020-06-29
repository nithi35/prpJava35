
public class Box {
	 int height;
	 int width;
	 int length;
	 Box(int height,int width,int length) {
		this.height=height;
		this.width=width;
		this.length=length;
		}
		
		
		public int area() {
			return height*length*width;
		}


		public static void main(String[]args) {
			Box e=new Box(20,30,30);
			System.out.println(e.area());
		
		}
	}

	
