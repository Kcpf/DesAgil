package br.edu.insper.desagil.derp;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<InterfaceManager> interfaceList;

	public Manager() {
		interfaceList = new ArrayList<>();
	}
	
	public void addInterface(InterfaceManager object) {
		interfaceList.add(object);
	}

	public void finish(Report report) {
		for (InterfaceManager im : interfaceList) {
			im.recebeRelatorio(report);
		}
	}
}
