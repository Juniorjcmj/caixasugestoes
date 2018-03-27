package jcmj.br.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sugestao implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer tickt;
    
    private String sugestao;
    private String observacao;
    @Temporal(TemporalType.DATE)
    private Date dataSugestao; 
    @Temporal(TemporalType.DATE)
    private Date dataObservacao;
    private String modificador;
    private String ip;
    private String assunto;
    private String situacao;
    
    public Sugestao() {
		// TODO Auto-generated constructor stub
	}

	public Sugestao(Long id, Integer tickt, String sugestao, String observacao, Date dataSugestao, Date dataObservacao,
			String modificador, String ip, String assunto, String situacao) {
		super();
		this.id = id;
		this.tickt = tickt;
		this.sugestao = sugestao;
		this.observacao = observacao;
		this.dataSugestao = dataSugestao;
		this.dataObservacao = dataObservacao;
		this.modificador = modificador;
		this.ip = ip;
		this.assunto = assunto;
		this.situacao = situacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTickt() {
		return tickt;
	}

	public void setTickt(Integer tickt) {
		this.tickt = tickt;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataSugestao() {
		return dataSugestao;
	}

	public void setDataSugestao(Date dataSugestao) {
		this.dataSugestao = dataSugestao;
	}

	public Date getDataObservacao() {
		return dataObservacao;
	}

	public void setDataObservacao(Date dataObservacao) {
		this.dataObservacao = dataObservacao;
	}

	public String getModificador() {
		return modificador;
	}

	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Sugestao other = (Sugestao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    
}
