package br.com.senac.tsi.pi4;

public class Usuario {
	
	private int idCliente;
	private String nomeCompletoCliente;
	private String emailCliente;
	private String senhaCliente;
	private String cpfCliente;
	private String celularCliente;
	private String telComercialCliente;
	private String telResidencialCliente;
	private String dtNascCliente;
	private boolean recebeNewsLetter;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCompletoCliente() {
		return nomeCompletoCliente;
	}
	public void setNomeCompletoCliente(String nomeCompletoCliente) {
		this.nomeCompletoCliente = nomeCompletoCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	public String getcpfCliente() {
		return cpfCliente;
	}
	public void setcpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getCelularCliente() {
		return celularCliente;
	}
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}
	public String getTelComercialCliente() {
		return telComercialCliente;
	}
	public void setTelComercialCliente(String telComercialCliente) {
		this.telComercialCliente = telComercialCliente;
	}
	public String getTelResidencialCliente() {
		return telResidencialCliente;
	}
	public void setTelResidencialCliente(String telResidencialCliente) {
		this.telResidencialCliente = telResidencialCliente;
	}
	public String getDtNascCliente() {
		return dtNascCliente;
	}
	public void setDtNascCliente(String dtNascCliente) {
		this.dtNascCliente = dtNascCliente;
	}
	public boolean isRecebeNewsLetter() {
		return recebeNewsLetter;
	}
	public void setRecebeNewsLetter(boolean recebeNewsLetter) {
		this.recebeNewsLetter = recebeNewsLetter;
	}
	
}
