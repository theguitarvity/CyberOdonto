/**
 * 
 */
package br.com.bytegod.cyberodonto.model.entidade;

/**
 * @author conta
 *
 */
public class Dentista {
	private int idDentista;
	private String croDentista;
	private String nomeDentista;
	private String cpfDentista;
	private String rgDentista;
	
	private Endereco endereco;
	private Contato contato;
	
	
	

	public Dentista(int idDentista, String croDentista, String nomeDentista, String cpfDentista, String rgDentista) {
		
		this(croDentista,nomeDentista,cpfDentista, rgDentista);
		this.idDentista = idDentista;
		
	}

	public Dentista(String croDentista, String nomeDentista, String cpfDentista, String rgDentista) {
		this();
		this.croDentista = croDentista;
		this.nomeDentista = nomeDentista;
		this.cpfDentista = cpfDentista;
		this.rgDentista = rgDentista;
	}
	public Dentista() {
		super();
	}

	//gerando getters and setters da classe dentista
	public int getIdDentista() {
		return idDentista;
	}

	public void setIdDentista(int idDentista) {
		this.idDentista = idDentista;
	}

	public String getCroDentista() {
		return croDentista;
	}

	public void setCroDentista(String croDentista) {
		this.croDentista = croDentista;
	}

	public String getNomeDentista() {
		return nomeDentista;
	}

	public void setNomeDentista(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}

	public String getCpfDentista() {
		return cpfDentista;
	}

	public void setCpfDentista(String cpfDentista) {
		this.cpfDentista = cpfDentista;
	}

	public String getRgDentista() {
		return rgDentista;
	}

	public void setRgDentista(String rgDentista) {
		this.rgDentista = rgDentista;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	

	
//gerando o hashcode e o metodo equals	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfDentista == null) ? 0 : cpfDentista.hashCode());
		result = prime * result + ((croDentista == null) ? 0 : croDentista.hashCode());
		result = prime * result + idDentista;
		result = prime * result + ((nomeDentista == null) ? 0 : nomeDentista.hashCode());
		result = prime * result + ((rgDentista == null) ? 0 : rgDentista.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (cpfDentista == null) {
			if (other.cpfDentista != null)
				return false;
		} else if (!cpfDentista.equals(other.cpfDentista))
			return false;
		if (croDentista == null) {
			if (other.croDentista != null)
				return false;
		} else if (!croDentista.equals(other.croDentista))
			return false;
		if (idDentista != other.idDentista)
			return false;
		if (nomeDentista == null) {
			if (other.nomeDentista != null)
				return false;
		} else if (!nomeDentista.equals(other.nomeDentista))
			return false;
		if (rgDentista == null) {
			if (other.rgDentista != null)
				return false;
		} else if (!rgDentista.equals(other.rgDentista))
			return false;
		return true;
	}

	//gerando o toStrin()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [idDentista=").append(idDentista).append(", croDentista=").append(croDentista)
				.append(", nomeDentista=").append(nomeDentista).append(", cpfDentista=").append(cpfDentista)
				.append(", rgDentista=").append(rgDentista).append(", endereco=").append(endereco).append(", contato=")
				.append(contato).append("]");
		return builder.toString();
	}
	
	
	
	

}
