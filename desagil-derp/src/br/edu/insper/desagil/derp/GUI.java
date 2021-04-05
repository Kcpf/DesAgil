package br.edu.insper.desagil.derp;

public class GUI implements InterfaceManager{
	private Log log;

	public GUI(Log log) {
		this.log = log;
	}

	public void show(Report report) {
		this.log.add("GUI showed " + report.getTitle());
	}

	@Override
	public void recebeRelatorio(Report report) {
		show(report);
	}
}
