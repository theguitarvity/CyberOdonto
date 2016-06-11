/**
 * 
 */
package br.com.bytegod.cyberodonto.model.entidade;

/**
 * @author Victor 
 *
 */
public class Paciente {
	
	private long idPaciente;
	private String nomePaciente;
	private String rgPaciente;
	private String cpfPaciente;
	
	private SexoType sexoPaciente;	
	private Endereco endereco;
	
	private Contato contato;

	public Paciente(long idPaciente, String nomePaciente, String rgPaciente, String cpfPaciente, SexoType sexoPaciente,
			Endereco endereco, Contato contato) {
		super();
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.rgPaciente = rgPaciente;
		this.cpfPaciente = cpfPaciente;
		this.sexoPaciente = sexoPaciente;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Paciente(long idPaciente, String nomePaciente, String rgPaciente, String cpfPaciente,
			SexoType sexoPaciente) {
		super();
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.rgPaciente = rgPaciente;
		this.cpfPaciente = cpfPaciente;
		this.sexoPaciente = sexoPaciente;
	}

	public Paciente(String nomePaciente, String rgPaciente, String cpfPaciente, SexoType sexoPaciente) {
		super();
		this.nomePaciente = nomePaciente;
		this.rgPaciente = rgPaciente;
		this.cpfPaciente = cpfPaciente;
		this.sexoPaciente = sexoPaciente;
	}

	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getRgPaciente() {
		return rgPaciente;
	}

	public void setRgPaciente(String rgPaciente) {
		this.rgPaciente = rgPaciente;
	}

	public String getCpfPaciente() {
		return cpfPaciente;
	}

	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}

	public SexoType getSexoPaciente() {
		return sexoPaciente;
	}

	public void setSexoPaciente(SexoType sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfPaciente == null) ? 0 : cpfPaciente.hashCode());
		result = prime * result + (int) (idPaciente ^ (idPaciente >>> 32));
		result = prime * result + ((nomePaciente == null) ? 0 : nomePaciente.hashCode());
		result = prime * result + ((rgPaciente == null) ? 0 : rgPaciente.hashCode());
		result = prime * result + ((sexoPaciente == null) ? 0 : sexoPaciente.hashCode());
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
		Paciente other = (Paciente) obj;
		if (cpfPaciente == null) {
			if (other.cpfPaciente != null)
				return false;
		} else if (!cpfPaciente.equals(other.cpfPaciente))
			return false;
		if (idPaciente != other.idPaciente)
			return false;
		if (nomePaciente == null) {
			if (other.nomePaciente != null)
				return false;
		} else if (!nomePaciente.equals(other.nomePaciente))
			return false;
		if (rgPaciente == null) {
			if (other.rgPaciente != null)
				return false;
		} else if (!rgPaciente.equals(other.rgPaciente))
			return false;
		if (sexoPaciente != other.sexoPaciente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [idPaciente=").append(idPaciente).append(", nomePaciente=").append(nomePaciente)
				.append(", rgPaciente=").append(rgPaciente).append(", cpfPaciente=").append(cpfPaciente)
				.append(", sexoPaciente=").append(sexoPaciente).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	}
	
	
	
}
