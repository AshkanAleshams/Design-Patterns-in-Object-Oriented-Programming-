package builderExample;

public class ReportBuilder {
	
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

	public ReportBuilder(String name, ThreeMusketeers model, Board board) {
		this.name = name;
		this.model = model;
		this.board = board;
		this.winner = this.board.getWinner();
	
	}
	
	public void addOriginPieceCount() {
		int n = this.board.getOrgPieceCount();
		this.originPieceCount = String.format("%d", n);
	}
	
	public void addMuskPieceCount() {
		int n = this.board.getMusketeerCells().size();
		this.muskPieceCount = String.format("%d", n);
	}
	
	public void addKillCount() {
		int n = this.board.getOrgPieceCount() - this.board.getTotalCellCount();
		this.killCount = String.format("%d", n);
	}

	public void addCurrPieceCount() {
		int n = this.board.getGuardCells().size() + this.board.getMusketeerCells().size();
		this.currPieceCount = String.format("%d", n);
	}

	public void addMoveCount() {
		int n = this.model.getMoveCount();
		this.moveCount = String.format("%d", n);
	}

	public void addGuardPieceCount() {
		int n = this.board.getGuardCells().size();
		this.guardPieceCount = String.format("%d", n);
	}
	
	public Report getReport() {
		
		Report p = new Report(this.name, this.model, this.board);
		p.addMoveCount(moveCount);
		p.addKillCount(killCount);
		p.addCurrPieceCount(currPieceCount);
		p.addGuardPieceCount(guardPieceCount);
		p.addMoveCount(muskPieceCount);
		p.addOriginPieceCount(originPieceCount);
		p.addMuskPieceCount(muskPieceCount);
		
		return p;
		
	}
}
