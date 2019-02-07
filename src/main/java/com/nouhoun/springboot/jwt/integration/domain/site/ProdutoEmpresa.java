/** create by system gera-java version 1.0.0 13/12/2018 19:59 : 1*/
package com.nouhoun.springboot.jwt.integration.domain.site;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class is a representation of an Account (i.e Checking, Savings, etc.). This represents an account for a transfer
 * setting.
 */

@Entity
@Table(name = "PRODUTOEMPRESA")
public class ProdutoEmpresa 
{

    /** The econtabil id for the ProdutoEmpresa. */
    @Id
    @Column(name = "PRODUTOEMPRESA_ID")
    private Integer id;

    /** The econtabil prodId for the ProdutoEmpresa. */
    @Column(name = "PRODID")
    private Integer prodId;

    /** The econtabil informAdicionaisParaNFe for the ProdutoEmpresa. */
    @Column(name = "INFORMADICIONAISPARANFE")
    private String informAdicionaisParaNFe;

    /** The econtabil anotainternas for the ProdutoEmpresa. */
    @Column(name = "ANOTAINTERNAS")
    private Integer anotainternas;

    /** The econtabil dataCadastro for the ProdutoEmpresa. */
    @Column(name = "DATACADASTRO")
    private Long dataCadastro;

    /** The econtabil estoqueList for the ProdutoEmpresa. */
//ERROR ANALIZAR CODIGO
  //  private List<Estoque> estoqueList;

    /** The econtabil aplicacao for the ProdutoEmpresa. */
    @Column(name = "APLICACAO")
    private String aplicacao;

    /** The econtabil fracao for the ProdutoEmpresa. */
    @Column(name = "FRACAO")
    private String fracao;

    /** The econtabil infaddNFe for the ProdutoEmpresa. */
    @Column(name = "INFADDNFE")
    private String infaddNFe;

    /** The econtabil anotInt for the ProdutoEmpresa. */
    @Column(name = "ANOTINT")
    private String anotInt;

    /** The econtabil margemlucro for the ProdutoEmpresa. */
    @Column(name = "MARGEMLUCRO")
    private Double margemlucro;

    /** The econtabil tributacao for the ProdutoEmpresa. */
  //  @Column(name = "TRIBUTACAO")
  //  private Tributacao tributacao;

    /** The econtabil codigo for the ProdutoEmpresa. */
    @Column(name = "CODIGO")
    private String codigo;

    /** The econtabil uniMed for the ProdutoEmpresa. */
    @Column(name = "UNIMED")
    private Integer uniMed;

    /** The econtabil categoria for the ProdutoEmpresa. */
    @Column(name = "CATEGORIA")
    private Integer categoria;

    /** The econtabil marca for the ProdutoEmpresa. */
    @Column(name = "MARCA")
    private Integer marca;

    /** The econtabil pesoBruto for the ProdutoEmpresa. */
    @Column(name = "PESOBRUTO")
    private Double pesoBruto;

    /** The econtabil pesoLiquido for the ProdutoEmpresa. */
    @Column(name = "PESOLIQUIDO")
    private Double pesoLiquido;

    /** The econtabil modoUso for the ProdutoEmpresa. */
    @Column(name = "MODOUSO")
    private String modoUso;



    /**
     * Default constructor.
     */
    public ProdutoEmpresa()
    {
        super();
    }


    /**
    /**
     * Gets the id.
     *
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * Sets the id.
     *
* @param id the id to set
 */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
    /**
     * Gets the prodId.
     *
     * @return the prodId
     */
    public Integer getProdId()
    {
        return prodId;
    }

    /**
     * Sets the prodid.
     *
* @param id the prodid to set
 */
    public void setProdId(Integer prodid)
    {
        this.prodId = prodid;
    }

    /**
    /**
     * Gets the informAdicionaisParaNFe.
     *
     * @return the informAdicionaisParaNFe
     */
    public String getInformAdicionaisParaNFe()
    {
        return informAdicionaisParaNFe;
    }

    /**
     * Sets the informadicionaisparanfe.
     *
* @param id the informadicionaisparanfe to set
 */
    public void setInformAdicionaisParaNFe(String informadicionaisparanfe)
    {
        this.informAdicionaisParaNFe = informadicionaisparanfe;
    }

    /**
    /**
     * Gets the anotainternas.
     *
     * @return the anotainternas
     */
    public Integer getAnotainternas()
    {
        return anotainternas;
    }

    /**
     * Sets the anotainternas.
     *
* @param id the anotainternas to set
 */
    public void setAnotainternas(Integer anotainternas)
    {
        this.anotainternas = anotainternas;
    }

    /**
    /**
     * Gets the dataCadastro.
     *
     * @return the dataCadastro
     */
    public Long getDataCadastro()
    {
        return dataCadastro;
    }

    /**
     * Sets the datacadastro.
     *
* @param id the datacadastro to set
 */
    public void setDataCadastro(Long datacadastro)
    {
        this.dataCadastro = datacadastro;
    }

   

    /**
    /**
     * Gets the aplicacao.
     *
     * @return the aplicacao
     */
    public String getAplicacao()
    {
        return aplicacao;
    }

    /**
     * Sets the aplicacao.
     *
* @param id the aplicacao to set
 */
    public void setAplicacao(String aplicacao)
    {
        this.aplicacao = aplicacao;
    }

    /**
    /**
     * Gets the fracao.
     *
     * @return the fracao
     */
    public String getFracao()
    {
        return fracao;
    }

    /**
     * Sets the fracao.
     *
* @param id the fracao to set
 */
    public void setFracao(String fracao)
    {
        this.fracao = fracao;
    }

    /**
    /**
     * Gets the infaddNFe.
     *
     * @return the infaddNFe
     */
    public String getInfaddNFe()
    {
        return infaddNFe;
    }

    /**
     * Sets the infaddnfe.
     *
* @param id the infaddnfe to set
 */
    public void setInfaddNFe(String infaddnfe)
    {
        this.infaddNFe = infaddnfe;
    }

    /**
    /**
     * Gets the anotInt.
     *
     * @return the anotInt
     */
    public String getAnotInt()
    {
        return anotInt;
    }

    /**
     * Sets the anotint.
     *
* @param id the anotint to set
 */
    public void setAnotInt(String anotint)
    {
        this.anotInt = anotint;
    }

  
  
    /**
    /**
     * Gets the margemlucro.
     *
     * @return the margemlucro
     */
    public Double getMargemlucro()
    {
        return margemlucro;
    }

    /**
     * Sets the margemlucro.
     *
* @param id the margemlucro to set
 */
    public void setMargemlucro(Double margemlucro)
    {
        this.margemlucro = margemlucro;
    }

 
    /**
    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     * Sets the codigo.
     *
* @param id the codigo to set
 */
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    /**
    /**
     * Gets the uniMed.
     *
     * @return the uniMed
     */
    public Integer getUniMed()
    {
        return uniMed;
    }

    /**
     * Sets the unimed.
     *
* @param id the unimed to set
 */
    public void setUniMed(Integer unimed)
    {
        this.uniMed = unimed;
    }

    /**
    /**
     * Gets the categoria.
     *
     * @return the categoria
     */
    public Integer getCategoria()
    {
        return categoria;
    }

    /**
     * Sets the categoria.
     *
* @param id the categoria to set
 */
    public void setCategoria(Integer categoria)
    {
        this.categoria = categoria;
    }

    /**
    /**
     * Gets the marca.
     *
     * @return the marca
     */
    public Integer getMarca()
    {
        return marca;
    }

    /**
     * Sets the marca.
     *
* @param id the marca to set
 */
    public void setMarca(Integer marca)
    {
        this.marca = marca;
    }

    /**
    /**
     * Gets the pesoBruto.
     *
     * @return the pesoBruto
     */
    public Double getPesoBruto()
    {
        return pesoBruto;
    }

    /**
     * Sets the pesobruto.
     *
* @param id the pesobruto to set
 */
    public void setPesoBruto(Double pesobruto)
    {
        this.pesoBruto = pesobruto;
    }

    /**
    /**
     * Gets the pesoLiquido.
     *
     * @return the pesoLiquido
     */
    public Double getPesoLiquido()
    {
        return pesoLiquido;
    }

    /**
     * Sets the pesoliquido.
     *
* @param id the pesoliquido to set
 */
    public void setPesoLiquido(Double pesoliquido)
    {
        this.pesoLiquido = pesoliquido;
    }

    /**
    /**
     * Gets the modoUso.
     *
     * @return the modoUso
     */
    public String getModoUso()
    {
        return modoUso;
    }

    /**
     * Sets the modouso.
     *
* @param id the modouso to set
 */
    public void setModoUso(String modouso)
    {
        this.modoUso = modouso;
    }

 }
