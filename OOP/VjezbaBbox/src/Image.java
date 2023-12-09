
public class Image {
	private int[][] image;
	private Bbox[] boxes;
	private int numBoxes;
	private int capacity;
	private int width;
	private int height;
	public Image(int height, int width, int capacity) {
		this.capacity = capacity;
		this.width = width;
		this.height = height;
		this.boxes = new Bbox[this.capacity];
		this.image = new int[this.width][this.height];
		this.numBoxes=0;
	}
	public Image(int[][] image,Bbox[] boxes,int capacity,int width,int height) {
		this.capacity=capacity;
		this.height=height;
		this.width =width;
		this.numBoxes = 0;
		this.image = new int[this.height][this.width];
		for(int i = 0;i < this.height;i++) {
			for(int j = 0;i<this.width;j++) {
				this.image[i][j] = image[i][j];
			}
		}
		for(int i = 0;i<this.capacity;i++) {
			this.boxes[i]=boxes[i];
			this.numBoxes++;
		}
	}
	public void add(Bbox b) {
		if(this.numBoxes<this.capacity) {
			this.boxes[numBoxes] = b;
			numBoxes++;
		}else System.out.println("Niz je pun");
	}
	public Bbox get(Bbox b) {
		 Bbox max = null;
		 for(int i = 0;i<this.numBoxes;i++) {
			 if(max == null||b.iou(max) < b.iou(this.boxes[i])) {
				 max = this.boxes[i];
			 }
		 }
		 return max;
	}
	public void clean() {
		for(int i = 0; i<this.numBoxes;i++) {
			for(int j=i+1;j<this.numBoxes;j++) {
				if(this.boxes[i].equals(this.boxes[j])) {
					for(int k = j+1;k<this.numBoxes;k++) {
						this.boxes[k-1] = this.boxes[k];
					}
				}
			}
		}
	}
}
