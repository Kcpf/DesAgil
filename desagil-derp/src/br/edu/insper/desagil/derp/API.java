package br.edu.insper.desagil.derp;

public class API implements InterfaceManager{
	private Log log;

	public API(Log log) {
		this.log = log;
	}

	public void notify(Report report) {
		this.log.add("API notified " + report.getTitle());
	}

	@Override
	public void recebeRelatorio(Report report) {
		notify(report);
	}
}
