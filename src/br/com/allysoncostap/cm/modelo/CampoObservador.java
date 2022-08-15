package br.com.allysoncostap.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo campom, CampoEvento evento);
	
	
}
