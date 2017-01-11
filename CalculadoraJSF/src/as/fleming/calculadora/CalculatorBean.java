package as.fleming.calculadora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculatorBean {
	  private int firstNumber = 0;
	  private int secondNumber = 0;
	  private String operation = "+";
	  private int result = 0;
	 
	  public void setFirstNumber(int firstNumber) {
	    this.firstNumber = firstNumber;
	  }
	 
	  public void setResult(int result) {
	    this.result = result;
	  }
	 
	  public int getFirstNumber() {
	    return firstNumber;
	  }
	 
	  public void setSecondNumber(int secondNumber) {
	    this.secondNumber = secondNumber;
	  }
	 
	  public int getSecondNumber() {
	    return secondNumber;
	  }
	 
	  public void setOperation(String operation) {
	    this.operation = operation;
	  }
	 
	  public String getOperation() {
	    return operation;
	  }
	 
	  public int getResult() {
	    return result;
	  }
	}

