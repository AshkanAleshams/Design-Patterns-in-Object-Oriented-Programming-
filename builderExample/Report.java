package builderExample;

public class Report {

	private String name;
	private Piece.Type winner;
	private ThreeMusketeers model;
	private Board board;
	private String moveCount = "N/A";
	private String killCount = "N/A";
	private String currPieceCount = "N/A";
	private String guardPieceCount = "N/A";
	private String originPieceCount = "N/A";
	private String muskPieceCount = "N/A";

	public Report(String name, ThreeMusketeers model, Board board) {
		this.name = name;
		this.model = model;
		this.board = board;
		this.winner = this.board.getWinner();
	
	}
	
	public void addOriginPieceCount(String originPieceCount) {
		this.originPieceCount = originPieceCount;
	}
	
	public void addMuskPieceCount(String muskPieceCount) {
		this.muskPieceCount = muskPieceCount;
	}
	
	
	public void addKillCount(String killCount) {
		this.killCount = killCount;
	}

	public void addCurrPieceCount(String currPieceCount) {
		this.currPieceCount = currPieceCount;
	}

	public void addMoveCount(String moveCount) {
		this.moveCount = moveCount;
	}

	public void addGuardPieceCount(String alliedPieceCount) {
		this.guardPieceCount = alliedPieceCount;
	}


	public String toString() {
		
		return  "\n--------------------------------- \n" +
		name + ":" + " \n Winner = " + winner + "\n Game Mode = " + model.getGameMode() + "\n Original Piece Count = "+ originPieceCount +"\n Move Count = " + moveCount + "\n Kill Count = " 
		+ killCount + "\n Current Piece Count = " + currPieceCount + "\n Guard Piece Count = " + guardPieceCount + "\n Musk Piece Count = "
		+ muskPieceCount 
		+ "\n--------------------------------- \n";
	}
}
