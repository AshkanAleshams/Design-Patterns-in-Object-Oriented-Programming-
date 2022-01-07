package builderExample;

public class MusketeerReportBuilder extends ReportBuilder {


	public MusketeerReportBuilder(ThreeMusketeers model, Board board) {
		super("Musketeer Player Report",model, board);
		this.addMoveCount();
		this.addKillCount();
		this.addGuardPieceCount();
		this.addCurrPieceCount();
		this.addOriginPieceCount();
		this.addMuskPieceCount();
	}
}
