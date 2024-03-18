module edu.farmingdale.part2challenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.part2challenge to javafx.fxml;
    exports edu.farmingdale.part2challenge;
}