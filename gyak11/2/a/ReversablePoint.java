public class ReversablePoint extends Point implements Reversable {

	private int prevX,prevY;
	
	public ReversablePoint(int x, int y) {
		super(x, y);
		this.prevX = x;
		this.prevY = y;

	}
	
	@Override
	public void setX(int x ) {
		this.prevX = this.x;
		super.setX(x);
	}
	
	@Override
	public void setY(int y ) {
		this.prevY = this.y;
		super.setY(y);
	}

	@Override
	public void reverse() {
		this.x = this.prevX;
		this.y = this.prevY;
		
	}

}