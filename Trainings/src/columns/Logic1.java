package columns;

public class Logic1 {
	
	public State1 state;
	
	public Logic1(State1 state) {
		this.state = state;
	}
	
	public boolean moveLeft() {
		state.col--;
		if (!state.isFigureFitTheField()) {
			state.col++;
			return false;
		}
		return true;
	}

	public boolean moveRight() {
		state.col++;
		if (!state.isFigureFitTheField()) {
			state.col--;
			return false;
		}
		return true;
	}
	
	public boolean moveDown() {
		state.row++;
		if (!state.isFigureFitTheField()) {
			state.row--;
			state.pasteFigureIntoTheField();
//			state.field.removeFilledRows();
			state.launchNewFigure();
			// TODO:  homework:  determine GAME OVER
			return true;
		}
		return true;
	}
	
	public void dropDown() {
		while (state.isFigureFitTheField()) {
			state.row++;
		}
		state.row--;
	}
}
