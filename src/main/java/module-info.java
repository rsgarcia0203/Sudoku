module ec.edu.espol.sudoku {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.sudoku to javafx.fxml;
    exports ec.edu.espol.sudoku;
}
