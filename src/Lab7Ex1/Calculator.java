package Lab7Ex1;

import Lab7Ex1.Exceptii.NullParameterException;
import Lab7Ex1.Exceptii.OverflowException;
import Lab7Ex1.Exceptii.UnderflowException;
import Lab7Ex1.Exceptii.MyArithmeticException;

public interface Calculator {
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException, MyArithmeticException;
    double average(double[] numbers) throws NullParameterException, MyArithmeticException;
}