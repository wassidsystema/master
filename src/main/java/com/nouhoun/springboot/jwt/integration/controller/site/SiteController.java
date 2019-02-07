/** create by system gera-java version 1.0.0 13/12/2018 22:13 : 24*/

package com.nouhoun.springboot.jwt.integration.controller.site;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nouhoun.springboot.jwt.integration.controller.PaginationFilter;
import com.nouhoun.springboot.jwt.integration.domain.site.Contato;
import com.nouhoun.springboot.jwt.integration.domain.site.ContatoItens;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServico;
import com.nouhoun.springboot.jwt.integration.domain.site.OrdemServicoItens;
import com.nouhoun.springboot.jwt.integration.domain.site.Plano;
import com.nouhoun.springboot.jwt.integration.domain.site.PlanoByEmpresa;
import com.nouhoun.springboot.jwt.integration.domain.site.ProdutoEmpresa;
import com.nouhoun.springboot.jwt.integration.domain.site.Servico;
import com.nouhoun.springboot.jwt.integration.domain.site.Site;
import com.nouhoun.springboot.jwt.integration.service.site.ContatoItensService;
import com.nouhoun.springboot.jwt.integration.service.site.ContatoService;
import com.nouhoun.springboot.jwt.integration.service.site.OrdemServicoItensService;
import com.nouhoun.springboot.jwt.integration.service.site.OrdemServicoService;
import com.nouhoun.springboot.jwt.integration.service.site.PlanoByEmpresaService;
import com.nouhoun.springboot.jwt.integration.service.site.PlanoService;
import com.nouhoun.springboot.jwt.integration.service.site.ProdutoEmpresaService;
import com.nouhoun.springboot.jwt.integration.service.site.ServicoService;
import com.nouhoun.springboot.jwt.integration.service.site.SiteService;

/**
 * The Class SiteController.
 */
@Controller
@RequestMapping("/site/api")
public class SiteController {

	/** The produtoempresa Service. */
	@Autowired
	private ProdutoEmpresaService produtoempresaService;

	/** The servico Service. */
	@Autowired
	private ServicoService servicoService;

	/** The site Service. */
	@Autowired
	private SiteService siteService;

	/** The contato Service. */
	@Autowired
	private ContatoService contatoService;

	/** The contatoitens Service. */
	@Autowired
	private ContatoItensService contatoitensService;

	/** The ordemservico Service. */
	@Autowired
	private OrdemServicoService ordemservicoService;

	/** The ordemservicoitens Service. */
	@Autowired
	private OrdemServicoItensService ordemservicoitensService;

	/** The plano Service. */
	@Autowired
	private PlanoService planoService;

	/** The planobyempresa Service. */
	@Autowired
	private PlanoByEmpresaService planobyempresaService;

//===================================### PRODUTOEMPRESA ####======================================
	/**
	 * Refresh produtoempresas.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the produtoempresa response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/produtoempresa/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ProdutoEmpresa>> refreshProdutoEmpresaPaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ProdutoEmpresa>>(produtoempresaService.findProdutoEmpresaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch produtoempresa paged.
	 *
	 * @param request the request
	 * @return the produtoempresa response
	 */
	@RequestMapping(value = "/produtoempresa/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ProdutoEmpresa>> fetchProdutoEmpresaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ProdutoEmpresa>>(produtoempresaService.findProdutoEmpresaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert produtoempresa.
	 *
	 * @param request the request
	 * @return the produtoempresa response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/produtoempresa/insert", method = RequestMethod.POST)
	public ResponseEntity<ProdutoEmpresa> insertProdutoEmpresa(@RequestBody String produtoempresas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ProdutoEmpresa produtoempresa = mapper.readValue(produtoempresas, ProdutoEmpresa.class);
		return new ResponseEntity<ProdutoEmpresa>(produtoempresaService.saveProdutoEmpresa(produtoempresa),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/produtoempresa/update", method = RequestMethod.POST)
	public ResponseEntity<ProdutoEmpresa> updateProdutoEmpresa(@RequestBody ProdutoEmpresa produtoempresa,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ProdutoEmpresa>(produtoempresaService.updateProdutoEmpresa(produtoempresa),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/produtoempresa/delete", method = RequestMethod.POST)
	public ResponseEntity<ProdutoEmpresa> deleteProdutoEmpresa(@RequestBody ProdutoEmpresa produtoempresa,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ProdutoEmpresa>(produtoempresaService.deleteProdutoEmpresa(produtoempresa),
				HttpStatus.OK);
	}

//===================================### SERVICO ####======================================
	/**
	 * Refresh servicos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the servico response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/servico/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Servico>> refreshServicoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Servico>>(servicoService.findServicoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch servico paged.
	 *
	 * @param request the request
	 * @return the servico response
	 */
	@RequestMapping(value = "/servico/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Servico>> fetchServicoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Servico>>(servicoService.findServicoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert servico.
	 *
	 * @param request the request
	 * @return the servico response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/servico/insert", method = RequestMethod.POST)
	public ResponseEntity<Servico> insertServico(@RequestBody String servicos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Servico servico = mapper.readValue(servicos, Servico.class);
		return new ResponseEntity<Servico>(servicoService.saveServico(servico), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/servico/update", method = RequestMethod.POST)
	public ResponseEntity<Servico> updateServico(@RequestBody Servico servico, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Servico>(servicoService.updateServico(servico), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/servico/delete", method = RequestMethod.POST)
	public ResponseEntity<Servico> deleteServico(@RequestBody Servico servico, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Servico>(servicoService.deleteServico(servico), HttpStatus.OK);
	}

//===================================### SITE ####======================================
	/**
	 * Refresh sites.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the site response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/site/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Site>> refreshSitePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Site>>(siteService.findSiteAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch site paged.
	 *
	 * @param request the request
	 * @return the site response
	 */
	@RequestMapping(value = "/site/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Site>> fetchSitePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Site>>(siteService.findSiteAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert site.
	 *
	 * @param request the request
	 * @return the site response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/site/insert", method = RequestMethod.POST)
	public ResponseEntity<Site> insertSite(@RequestBody String sites, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Site site = mapper.readValue(sites, Site.class);
		return new ResponseEntity<Site>(siteService.saveSite(site), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/site/update", method = RequestMethod.POST)
	public ResponseEntity<Site> updateSite(@RequestBody Site site, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Site>(siteService.updateSite(site), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/site/delete", method = RequestMethod.POST)
	public ResponseEntity<Site> deleteSite(@RequestBody Site site, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Site>(siteService.deleteSite(site), HttpStatus.OK);
	}

//===================================### CONTATO ####======================================
	/**
	 * Refresh contatos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the contato response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contato/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Contato>> refreshContatoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Contato>>(contatoService.findContatoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch contato paged.
	 *
	 * @param request the request
	 * @return the contato response
	 */
	@RequestMapping(value = "/contato/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Contato>> fetchContatoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Contato>>(contatoService.findContatoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert contato.
	 *
	 * @param request the request
	 * @return the contato response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contato/insert", method = RequestMethod.POST)
	public ResponseEntity<Contato> insertContato(@RequestBody String contatos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Contato contato = mapper.readValue(contatos, Contato.class);
		return new ResponseEntity<Contato>(contatoService.saveContato(contato), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contato/update", method = RequestMethod.POST)
	public ResponseEntity<Contato> updateContato(@RequestBody Contato contato, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Contato>(contatoService.updateContato(contato), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contato/delete", method = RequestMethod.POST)
	public ResponseEntity<Contato> deleteContato(@RequestBody Contato contato, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Contato>(contatoService.deleteContato(contato), HttpStatus.OK);
	}

//===================================### CONTATOITENS ####======================================
	/**
	 * Refresh contatoitenss.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the contatoitens response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contatoitens/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ContatoItens>> refreshContatoItensPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ContatoItens>>(contatoitensService.findContatoItensAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch contatoitens paged.
	 *
	 * @param request the request
	 * @return the contatoitens response
	 */
	@RequestMapping(value = "/contatoitens/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ContatoItens>> fetchContatoItensPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ContatoItens>>(contatoitensService.findContatoItensAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert contatoitens.
	 *
	 * @param request the request
	 * @return the contatoitens response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contatoitens/insert", method = RequestMethod.POST)
	public ResponseEntity<ContatoItens> insertContatoItens(@RequestBody String contatoitenss,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ContatoItens contatoitens = mapper.readValue(contatoitenss, ContatoItens.class);
		return new ResponseEntity<ContatoItens>(contatoitensService.saveContatoItens(contatoitens), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contatoitens/update", method = RequestMethod.POST)
	public ResponseEntity<ContatoItens> updateContatoItens(@RequestBody ContatoItens contatoitens,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ContatoItens>(contatoitensService.updateContatoItens(contatoitens), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/contatoitens/delete", method = RequestMethod.POST)
	public ResponseEntity<ContatoItens> deleteContatoItens(@RequestBody ContatoItens contatoitens,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ContatoItens>(contatoitensService.deleteContatoItens(contatoitens), HttpStatus.OK);
	}

//===================================### ORDEMSERVICO ####======================================
	/**
	 * Refresh ordemservicos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the ordemservico response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservico/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<OrdemServico>> refreshOrdemServicoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<OrdemServico>>(ordemservicoService.findOrdemServicoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch ordemservico paged.
	 *
	 * @param request the request
	 * @return the ordemservico response
	 */
	@RequestMapping(value = "/ordemservico/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<OrdemServico>> fetchOrdemServicoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<OrdemServico>>(ordemservicoService.findOrdemServicoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert ordemservico.
	 *
	 * @param request the request
	 * @return the ordemservico response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservico/insert", method = RequestMethod.POST)
	public ResponseEntity<OrdemServico> insertOrdemServico(@RequestBody String ordemservicos,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		OrdemServico ordemservico = mapper.readValue(ordemservicos, OrdemServico.class);
		return new ResponseEntity<OrdemServico>(ordemservicoService.saveOrdemServico(ordemservico), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservico/update", method = RequestMethod.POST)
	public ResponseEntity<OrdemServico> updateOrdemServico(@RequestBody OrdemServico ordemservico,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<OrdemServico>(ordemservicoService.updateOrdemServico(ordemservico), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservico/delete", method = RequestMethod.POST)
	public ResponseEntity<OrdemServico> deleteOrdemServico(@RequestBody OrdemServico ordemservico,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<OrdemServico>(ordemservicoService.deleteOrdemServico(ordemservico), HttpStatus.OK);
	}

//===================================### ORDEMSERVICOITENS ####======================================
	/**
	 * Refresh ordemservicoitenss.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the ordemservicoitens response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservicoitens/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<OrdemServicoItens>> refreshOrdemServicoItensPaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<OrdemServicoItens>>(
				ordemservicoitensService.findOrdemServicoItensAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch ordemservicoitens paged.
	 *
	 * @param request the request
	 * @return the ordemservicoitens response
	 */
	@RequestMapping(value = "/ordemservicoitens/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<OrdemServicoItens>> fetchOrdemServicoItensPaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<OrdemServicoItens>>(
				ordemservicoitensService.findOrdemServicoItensAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert ordemservicoitens.
	 *
	 * @param request the request
	 * @return the ordemservicoitens response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservicoitens/insert", method = RequestMethod.POST)
	public ResponseEntity<OrdemServicoItens> insertOrdemServicoItens(@RequestBody String ordemservicoitenss,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		OrdemServicoItens ordemservicoitens = mapper.readValue(ordemservicoitenss, OrdemServicoItens.class);
		return new ResponseEntity<OrdemServicoItens>(ordemservicoitensService.saveOrdemServicoItens(ordemservicoitens),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservicoitens/update", method = RequestMethod.POST)
	public ResponseEntity<OrdemServicoItens> updateOrdemServicoItens(@RequestBody OrdemServicoItens ordemservicoitens,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<OrdemServicoItens>(
				ordemservicoitensService.updateOrdemServicoItens(ordemservicoitens), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/ordemservicoitens/delete", method = RequestMethod.POST)
	public ResponseEntity<OrdemServicoItens> deleteOrdemServicoItens(@RequestBody OrdemServicoItens ordemservicoitens,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<OrdemServicoItens>(
				ordemservicoitensService.deleteOrdemServicoItens(ordemservicoitens), HttpStatus.OK);
	}

//===================================### PLANO ####======================================
	/**
	 * Refresh planos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the plano response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/plano/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Plano>> refreshPlanoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Plano>>(planoService.findPlanoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch plano paged.
	 *
	 * @param request the request
	 * @return the plano response
	 */
	@RequestMapping(value = "/plano/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Plano>> fetchPlanoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Plano>>(planoService.findPlanoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert plano.
	 *
	 * @param request the request
	 * @return the plano response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/plano/insert", method = RequestMethod.POST)
	public ResponseEntity<Plano> insertPlano(@RequestBody String planos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Plano plano = mapper.readValue(planos, Plano.class);
		return new ResponseEntity<Plano>(planoService.savePlano(plano), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/plano/update", method = RequestMethod.POST)
	public ResponseEntity<Plano> updatePlano(@RequestBody Plano plano, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Plano>(planoService.updatePlano(plano), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/plano/delete", method = RequestMethod.POST)
	public ResponseEntity<Plano> deletePlano(@RequestBody Plano plano, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Plano>(planoService.deletePlano(plano), HttpStatus.OK);
	}

//===================================### PLANOBYEMPRESA ####======================================
	/**
	 * Refresh planobyempresas.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the planobyempresa response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/planobyempresa/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<PlanoByEmpresa>> refreshPlanoByEmpresaPaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<PlanoByEmpresa>>(planobyempresaService.findPlanoByEmpresaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch planobyempresa paged.
	 *
	 * @param request the request
	 * @return the planobyempresa response
	 */
	@RequestMapping(value = "/planobyempresa/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<PlanoByEmpresa>> fetchPlanoByEmpresaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<PlanoByEmpresa>>(planobyempresaService.findPlanoByEmpresaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert planobyempresa.
	 *
	 * @param request the request
	 * @return the planobyempresa response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/planobyempresa/insert", method = RequestMethod.POST)
	public ResponseEntity<PlanoByEmpresa> insertPlanoByEmpresa(@RequestBody String planobyempresas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		PlanoByEmpresa planobyempresa = mapper.readValue(planobyempresas, PlanoByEmpresa.class);
		return new ResponseEntity<PlanoByEmpresa>(planobyempresaService.savePlanoByEmpresa(planobyempresa),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/planobyempresa/update", method = RequestMethod.POST)
	public ResponseEntity<PlanoByEmpresa> updatePlanoByEmpresa(@RequestBody PlanoByEmpresa planobyempresa,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<PlanoByEmpresa>(planobyempresaService.updatePlanoByEmpresa(planobyempresa),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/planobyempresa/delete", method = RequestMethod.POST)
	public ResponseEntity<PlanoByEmpresa> deletePlanoByEmpresa(@RequestBody PlanoByEmpresa planobyempresa,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<PlanoByEmpresa>(planobyempresaService.deletePlanoByEmpresa(planobyempresa),
				HttpStatus.OK);
	}

}
