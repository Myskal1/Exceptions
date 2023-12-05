module com.calculator.mycalculator1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.calculator.mycalculator1 to javafx.fxml;
    exports com.calculator.mycalculator1;
}