package builderExample;

public class GuardReportBuilder extends ReportBuilder {

	public GuardReportBuilder(ThreeMusketeers model, Board board) {
		super("Guard Player Report",model, board);
		this.addMoveCount();
		this.addCurrPieceCount();
		this.addGuardPieceCount();
		this.addMuskPieceCount();
		this.addOriginPieceCount();
	}
}
