package as.fleming.calculadora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CalculatorController {
	 @ManagedProperty(value="#{calculatorBean}")
	  private CalculatorBean numbers;
	  private CalculatorBO calculator = new CalculatorBO();
	  private boolean selectOperationFormRendered=false;
	  private boolean newOperationCommandRendered=true;
	    
	  public boolean isSelectOperationFormRendered() {
	    return selectOperationFormRendered;
	  }
	 
	  public void setSelectOperationFormRendered(boolean selectOperationFormRendered) {
	    this.selectOperationFormRendered = selectOperationFormRendered;
	  }
	 
	  public boolean isNewOperationCommandRendered() {
	    return newOperationCommandRendered;
	  }
	 
	  public void setNewOperationCommandRendered(boolean newOperationCommandRendered) {
	    this.newOperationCommandRendered = newOperationCommandRendered;
	  }
	   
	  public CalculatorBean getNumbers() {
	    return numbers;
	  }
	 
	  public void setNumbers(CalculatorBean numbers) {
	    this.numbers = numbers;
	  }
	 
	  public String doNewOperation() {
	    selectOperationFormRendered=true;
	    newOperationCommandRendered=false;
	    return null;
	  }
	    
	  public String doSelectOperation() {
	    selectOperationFormRendered=false;
	    newOperationCommandRendered=true;
	    doOperation();
	    return null;
	  }
	 
	  public String doOperation() {
	    String operation = numbers.getOperation();
	    int firstNumber = numbers.getFirstNumber();
	    int secondNumber = numbers.getSecondNumber();
	    int result = 0;
	    String resultStr = "OK";
	 
	    if (operation.equals("+"))
	      result = calculator.add(firstNumber, secondNumber);
	    else if (operation.equals("-"))
	      result = calculator.substract(firstNumber, secondNumber);
	    else if (operation.equals("*"))
	      result = calculator.multiply(firstNumber, secondNumber);
	    else if (operation.equals("/"))
	      result = calculator.divide(firstNumber, secondNumber);
	    else
	      resultStr="not-OK";
	          
	    numbers.setResult(result);
	    return resultStr;
	  }
	}
