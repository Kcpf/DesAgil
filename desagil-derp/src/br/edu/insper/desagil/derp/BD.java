package br.edu.insper.desagil.derp;

public class BD implements InterfaceManager{
	private Log log;

	public BD(Log log) {
		this.log = log;
	}

	public void save(Report report) {
		this.log.add("BD saved " + report.getTitle());
	}

	@Override
	public void recebeRelatorio(Report report) {
		save(report);
	}
}
