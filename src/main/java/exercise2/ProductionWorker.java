package exercise2;

public class ProductionWorker implements Payable{

	private int producedPieceRate;
	private int producedPiece=0;

	public ProductionWorker(int producedPieceRate){
		this.producedPieceRate=producedPieceRate;
	}

	protected void produceOnePiece() {
			producedPiece++;
	}

	public int computeSalary() {
		return producedPiece*producedPieceRate ;
	}

}
