module com.calculator.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.internal.le;
    opens com.calculator.simplecalculator to javafx.fxml;
    exports com.calculator.simplecalculator;
}