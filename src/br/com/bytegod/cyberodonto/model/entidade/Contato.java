package br.com.bytegod.cyberodonto.model.entidade;

public class Contato {
	private String emailPaciente;
	private String telefonePaciente;
	private String celularPaciente;

	public Contato() {
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public String getCelularPaciente() {
		return celularPaciente;
	}

	public void setCelularPaciente(String celularPaciente) {
		this.celularPaciente = celularPaciente;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celularPaciente == null) ? 0 : celularPaciente.hashCode());
		result = prime * result + ((emailPaciente == null) ? 0 : emailPaciente.hashCode());
		result = prime * result + ((telefonePaciente == null) ? 0 : telefonePaciente.hashCode());
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
		Contato other = (Contato) obj;
		if (celularPaciente == null) {
			if (other.celularPaciente != null)
				return false;
		} else if (!celularPaciente.equals(other.celularPaciente))
			return false;
		if (emailPaciente == null) {
			if (other.emailPaciente != null)
				return false;
		} else if (!emailPaciente.equals(other.emailPaciente))
			return false;
		if (telefonePaciente == null) {
			if (other.telefonePaciente != null)
				return false;
		} else if (!telefonePaciente.equals(other.telefonePaciente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [emailPaciente=")
				.append(emailPaciente)
				.append(", telefonePaciente=")
				.append(telefonePaciente).append(", celularPaciente=")
				.append(celularPaciente).append("]");
		return builder.toString();
	}
	
	
}