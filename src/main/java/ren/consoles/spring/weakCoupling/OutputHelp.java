package ren.consoles.spring.weakCoupling;

public class OutputHelp {

	private Output output;

	public void setOutput(Output output) {
		this.output = output;
	}
	
	public String getOutput() {
		return output.output();
	}
}
