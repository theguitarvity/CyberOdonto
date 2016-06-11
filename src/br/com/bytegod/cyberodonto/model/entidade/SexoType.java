package br.com.bytegod.cyberodonto.model.entidade;

public enum SexoType {
	M("Masculino"),
	F("Feminino");
	
	
	private String descricao;
	
	
	//getters and setters descricao
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//metodo construtor da classe

	private SexoType(String descricao) {
		this.descricao = descricao;
		
	}
}
