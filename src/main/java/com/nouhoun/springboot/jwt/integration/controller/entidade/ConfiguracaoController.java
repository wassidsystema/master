/** create by system gera-java version 1.0.0 17/12/2018 21:54 : 13*/

package com.nouhoun.springboot.jwt.integration.controller.entidade;

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
import com.nouhoun.springboot.jwt.integration.domain.entidade.Boleto;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfBlueSoft;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigAlertas;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigCarne;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigEntrada;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigFiscal;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigGeral;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigOS;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigProduto;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigSMTP;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfigVendas;
import com.nouhoun.springboot.jwt.integration.domain.entidade.Configuracao;
import com.nouhoun.springboot.jwt.integration.domain.entidade.ConfiguracaoNFe;
import com.nouhoun.springboot.jwt.integration.service.entidade.BoletoService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfBlueSoftService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigAlertasService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigCarneService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigEntradaService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigFiscalService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigGeralService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigOSService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigProdutoService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigSMTPService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfigVendasService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfiguracaoNFeService;
import com.nouhoun.springboot.jwt.integration.service.entidade.ConfiguracaoService;

/**
 * The Class ConfiguracaoController.
 */
@Controller
@RequestMapping("/configuracao/api")
public class ConfiguracaoController {
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.configuracaocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ConfiguracaoController.class);

	/** The configuracao Service. */
	@Autowired
	private ConfiguracaoService configuracaoService;

	/** The boleto Service. */
	@Autowired
	private BoletoService boletoService;

	/** The configcarne Service. */
	@Autowired
	private ConfigCarneService configcarneService;

	/** The configentrada Service. */
	@Autowired
	private ConfigEntradaService configentradaService;

	/** The configfiscal Service. */
	@Autowired
	private ConfigFiscalService configfiscalService;

	/** The configalertas Service. */
	@Autowired
	private ConfigAlertasService configalertasService;

	/** The configgeral Service. */
	@Autowired
	private ConfigGeralService configgeralService;

	/** The configproduto Service. */
	@Autowired
	private ConfigProdutoService configprodutoService;

	/** The configsmtp Service. */
	@Autowired
	private ConfigSMTPService configsmtpService;

	/** The configuracaonfe Service. */
	@Autowired
	private ConfiguracaoNFeService configuracaonfeService;

	/** The configvendas Service. */
	@Autowired
	private ConfigVendasService configvendasService;

	/** The configos Service. */
	@Autowired
	private ConfigOSService configosService;

	/** The confbluesoft Service. */
	@Autowired
	private ConfBlueSoftService confbluesoftService;

//===================================### CONFIGURACAO ####======================================
	/**
	 * Refresh configuracaos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configuracao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracao/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Configuracao>> refreshConfiguracaoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Configuracao>>(configuracaoService.findConfiguracaoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configuracao paged.
	 *
	 * @param request the request
	 * @return the configuracao response
	 */
	@RequestMapping(value = "/configuracao/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Configuracao>> fetchConfiguracaoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Configuracao>>(configuracaoService.findConfiguracaoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configuracao.
	 *
	 * @param request the request
	 * @return the configuracao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracao/insert", method = RequestMethod.POST)
	public ResponseEntity<Configuracao> insertConfiguracao(@RequestBody String configuracaos,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Configuracao configuracao = mapper.readValue(configuracaos, Configuracao.class);
		return new ResponseEntity<Configuracao>(configuracaoService.saveConfiguracao(configuracao), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracao/update", method = RequestMethod.POST)
	public ResponseEntity<Configuracao> updateConfiguracao(@RequestBody Configuracao configuracao,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Configuracao>(configuracaoService.updateConfiguracao(configuracao), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracao/delete", method = RequestMethod.POST)
	public ResponseEntity<Configuracao> deleteConfiguracao(@RequestBody Configuracao configuracao,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Configuracao>(configuracaoService.deleteConfiguracao(configuracao), HttpStatus.OK);
	}

//===================================### BOLETO ####======================================
	/**
	 * Refresh boletos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the boleto response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/boleto/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Boleto>> refreshBoletoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Boleto>>(boletoService.findBoletoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch boleto paged.
	 *
	 * @param request the request
	 * @return the boleto response
	 */
	@RequestMapping(value = "/boleto/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Boleto>> fetchBoletoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Boleto>>(boletoService.findBoletoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert boleto.
	 *
	 * @param request the request
	 * @return the boleto response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/boleto/insert", method = RequestMethod.POST)
	public ResponseEntity<Boleto> insertBoleto(@RequestBody String boletos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Boleto boleto = mapper.readValue(boletos, Boleto.class);
		return new ResponseEntity<Boleto>(boletoService.saveBoleto(boleto), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/boleto/update", method = RequestMethod.POST)
	public ResponseEntity<Boleto> updateBoleto(@RequestBody Boleto boleto, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Boleto>(boletoService.updateBoleto(boleto), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/boleto/delete", method = RequestMethod.POST)
	public ResponseEntity<Boleto> deleteBoleto(@RequestBody Boleto boleto, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Boleto>(boletoService.deleteBoleto(boleto), HttpStatus.OK);
	}

//===================================### CONFIGCARNE ####======================================
	/**
	 * Refresh configcarnes.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configcarne response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configcarne/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigCarne>> refreshConfigCarnePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigCarne>>(configcarneService.findConfigCarneAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configcarne paged.
	 *
	 * @param request the request
	 * @return the configcarne response
	 */
	@RequestMapping(value = "/configcarne/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigCarne>> fetchConfigCarnePaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigCarne>>(configcarneService.findConfigCarneAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configcarne.
	 *
	 * @param request the request
	 * @return the configcarne response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configcarne/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigCarne> insertConfigCarne(@RequestBody String configcarnes, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigCarne configcarne = mapper.readValue(configcarnes, ConfigCarne.class);
		return new ResponseEntity<ConfigCarne>(configcarneService.saveConfigCarne(configcarne), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configcarne/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigCarne> updateConfigCarne(@RequestBody ConfigCarne configcarne,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigCarne>(configcarneService.updateConfigCarne(configcarne), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configcarne/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigCarne> deleteConfigCarne(@RequestBody ConfigCarne configcarne,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigCarne>(configcarneService.deleteConfigCarne(configcarne), HttpStatus.OK);
	}

//===================================### CONFIGENTRADA ####======================================
	/**
	 * Refresh configentradas.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configentrada response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configentrada/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigEntrada>> refreshConfigEntradaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigEntrada>>(configentradaService.findConfigEntradaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configentrada paged.
	 *
	 * @param request the request
	 * @return the configentrada response
	 */
	@RequestMapping(value = "/configentrada/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigEntrada>> fetchConfigEntradaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigEntrada>>(configentradaService.findConfigEntradaAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configentrada.
	 *
	 * @param request the request
	 * @return the configentrada response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configentrada/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigEntrada> insertConfigEntrada(@RequestBody String configentradas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigEntrada configentrada = mapper.readValue(configentradas, ConfigEntrada.class);
		return new ResponseEntity<ConfigEntrada>(configentradaService.saveConfigEntrada(configentrada), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configentrada/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigEntrada> updateConfigEntrada(@RequestBody ConfigEntrada configentrada,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigEntrada>(configentradaService.updateConfigEntrada(configentrada),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configentrada/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigEntrada> deleteConfigEntrada(@RequestBody ConfigEntrada configentrada,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigEntrada>(configentradaService.deleteConfigEntrada(configentrada),
				HttpStatus.OK);
	}

//===================================### CONFIGFISCAL ####======================================
	/**
	 * Refresh configfiscals.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configfiscal response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configfiscal/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigFiscal>> refreshConfigFiscalPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigFiscal>>(configfiscalService.findConfigFiscalAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configfiscal paged.
	 *
	 * @param request the request
	 * @return the configfiscal response
	 */
	@RequestMapping(value = "/configfiscal/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigFiscal>> fetchConfigFiscalPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigFiscal>>(configfiscalService.findConfigFiscalAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configfiscal.
	 *
	 * @param request the request
	 * @return the configfiscal response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configfiscal/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigFiscal> insertConfigFiscal(@RequestBody String configfiscals,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigFiscal configfiscal = mapper.readValue(configfiscals, ConfigFiscal.class);
		return new ResponseEntity<ConfigFiscal>(configfiscalService.saveConfigFiscal(configfiscal), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configfiscal/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigFiscal> updateConfigFiscal(@RequestBody ConfigFiscal configfiscal,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigFiscal>(configfiscalService.updateConfigFiscal(configfiscal), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configfiscal/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigFiscal> deleteConfigFiscal(@RequestBody ConfigFiscal configfiscal,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigFiscal>(configfiscalService.deleteConfigFiscal(configfiscal), HttpStatus.OK);
	}

//===================================### CONFIGALERTAS ####======================================
	/**
	 * Refresh configalertass.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configalertas response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configalertas/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigAlertas>> refreshConfigAlertasPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigAlertas>>(configalertasService.findConfigAlertasAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configalertas paged.
	 *
	 * @param request the request
	 * @return the configalertas response
	 */
	@RequestMapping(value = "/configalertas/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigAlertas>> fetchConfigAlertasPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigAlertas>>(configalertasService.findConfigAlertasAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configalertas.
	 *
	 * @param request the request
	 * @return the configalertas response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configalertas/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigAlertas> insertConfigAlertas(@RequestBody String configalertass,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigAlertas configalertas = mapper.readValue(configalertass, ConfigAlertas.class);
		return new ResponseEntity<ConfigAlertas>(configalertasService.saveConfigAlertas(configalertas), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configalertas/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigAlertas> updateConfigAlertas(@RequestBody ConfigAlertas configalertas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigAlertas>(configalertasService.updateConfigAlertas(configalertas),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configalertas/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigAlertas> deleteConfigAlertas(@RequestBody ConfigAlertas configalertas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigAlertas>(configalertasService.deleteConfigAlertas(configalertas),
				HttpStatus.OK);
	}

//===================================### CONFIGGERAL ####======================================
	/**
	 * Refresh configgerals.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configgeral response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configgeral/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigGeral>> refreshConfigGeralPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigGeral>>(configgeralService.findConfigGeralAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configgeral paged.
	 *
	 * @param request the request
	 * @return the configgeral response
	 */
	@RequestMapping(value = "/configgeral/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigGeral>> fetchConfigGeralPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigGeral>>(configgeralService.findConfigGeralAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configgeral.
	 *
	 * @param request the request
	 * @return the configgeral response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configgeral/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigGeral> insertConfigGeral(@RequestBody String configgerals, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigGeral configgeral = mapper.readValue(configgerals, ConfigGeral.class);
		return new ResponseEntity<ConfigGeral>(configgeralService.saveConfigGeral(configgeral), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configgeral/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigGeral> updateConfigGeral(@RequestBody ConfigGeral configgeral,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigGeral>(configgeralService.updateConfigGeral(configgeral), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configgeral/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigGeral> deleteConfigGeral(@RequestBody ConfigGeral configgeral,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigGeral>(configgeralService.deleteConfigGeral(configgeral), HttpStatus.OK);
	}

//===================================### CONFIGPRODUTO ####======================================
	/**
	 * Refresh configprodutos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configproduto response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configproduto/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigProduto>> refreshConfigProdutoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigProduto>>(configprodutoService.findConfigProdutoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configproduto paged.
	 *
	 * @param request the request
	 * @return the configproduto response
	 */
	@RequestMapping(value = "/configproduto/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigProduto>> fetchConfigProdutoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigProduto>>(configprodutoService.findConfigProdutoAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configproduto.
	 *
	 * @param request the request
	 * @return the configproduto response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configproduto/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigProduto> insertConfigProduto(@RequestBody String configprodutos,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigProduto configproduto = mapper.readValue(configprodutos, ConfigProduto.class);
		return new ResponseEntity<ConfigProduto>(configprodutoService.saveConfigProduto(configproduto), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configproduto/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigProduto> updateConfigProduto(@RequestBody ConfigProduto configproduto,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigProduto>(configprodutoService.updateConfigProduto(configproduto),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configproduto/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigProduto> deleteConfigProduto(@RequestBody ConfigProduto configproduto,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigProduto>(configprodutoService.deleteConfigProduto(configproduto),
				HttpStatus.OK);
	}

//===================================### CONFIGSMTP ####======================================
	/**
	 * Refresh configsmtps.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configsmtp response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configsmtp/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigSMTP>> refreshConfigSMTPPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigSMTP>>(configsmtpService.findConfigSMTPAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch configsmtp paged.
	 *
	 * @param request the request
	 * @return the configsmtp response
	 */
	@RequestMapping(value = "/configsmtp/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigSMTP>> fetchConfigSMTPPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigSMTP>>(configsmtpService.findConfigSMTPAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert configsmtp.
	 *
	 * @param request the request
	 * @return the configsmtp response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configsmtp/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigSMTP> insertConfigSMTP(@RequestBody String configsmtps, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigSMTP configsmtp = mapper.readValue(configsmtps, ConfigSMTP.class);
		return new ResponseEntity<ConfigSMTP>(configsmtpService.saveConfigSMTP(configsmtp), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configsmtp/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigSMTP> updateConfigSMTP(@RequestBody ConfigSMTP configsmtp, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigSMTP>(configsmtpService.updateConfigSMTP(configsmtp), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configsmtp/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigSMTP> deleteConfigSMTP(@RequestBody ConfigSMTP configsmtp, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigSMTP>(configsmtpService.deleteConfigSMTP(configsmtp), HttpStatus.OK);
	}

//===================================### CONFIGURACAONFE ####======================================
	/**
	 * Refresh configuracaonfes.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configuracaonfe response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracaonfe/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfiguracaoNFe>> refreshConfiguracaoNFePaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfiguracaoNFe>>(configuracaonfeService.findConfiguracaoNFeAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configuracaonfe paged.
	 *
	 * @param request the request
	 * @return the configuracaonfe response
	 */
	@RequestMapping(value = "/configuracaonfe/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfiguracaoNFe>> fetchConfiguracaoNFePaged(
			@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfiguracaoNFe>>(configuracaonfeService.findConfiguracaoNFeAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configuracaonfe.
	 *
	 * @param request the request
	 * @return the configuracaonfe response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracaonfe/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfiguracaoNFe> insertConfiguracaoNFe(@RequestBody String configuracaonfes,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfiguracaoNFe configuracaonfe = mapper.readValue(configuracaonfes, ConfiguracaoNFe.class);
		return new ResponseEntity<ConfiguracaoNFe>(configuracaonfeService.saveConfiguracaoNFe(configuracaonfe),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracaonfe/update", method = RequestMethod.POST)
	public ResponseEntity<ConfiguracaoNFe> updateConfiguracaoNFe(@RequestBody ConfiguracaoNFe configuracaonfe,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfiguracaoNFe>(configuracaonfeService.updateConfiguracaoNFe(configuracaonfe),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configuracaonfe/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfiguracaoNFe> deleteConfiguracaoNFe(@RequestBody ConfiguracaoNFe configuracaonfe,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfiguracaoNFe>(configuracaonfeService.deleteConfiguracaoNFe(configuracaonfe),
				HttpStatus.OK);
	}

//===================================### CONFIGVENDAS ####======================================
	/**
	 * Refresh configvendass.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configvendas response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configvendas/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigVendas>> refreshConfigVendasPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigVendas>>(configvendasService.findConfigVendasAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch configvendas paged.
	 *
	 * @param request the request
	 * @return the configvendas response
	 */
	@RequestMapping(value = "/configvendas/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigVendas>> fetchConfigVendasPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigVendas>>(configvendasService.findConfigVendasAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert configvendas.
	 *
	 * @param request the request
	 * @return the configvendas response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configvendas/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigVendas> insertConfigVendas(@RequestBody String configvendass,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigVendas configvendas = mapper.readValue(configvendass, ConfigVendas.class);
		return new ResponseEntity<ConfigVendas>(configvendasService.saveConfigVendas(configvendas), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configvendas/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigVendas> updateConfigVendas(@RequestBody ConfigVendas configvendas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigVendas>(configvendasService.updateConfigVendas(configvendas), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configvendas/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigVendas> deleteConfigVendas(@RequestBody ConfigVendas configvendas,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigVendas>(configvendasService.deleteConfigVendas(configvendas), HttpStatus.OK);
	}

//===================================### CONFIGOS ####======================================
	/**
	 * Refresh configoss.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the configos response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configos/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfigOS>> refreshConfigOSPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigOS>>(configosService.findConfigOSAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch configos paged.
	 *
	 * @param request the request
	 * @return the configos response
	 */
	@RequestMapping(value = "/configos/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfigOS>> fetchConfigOSPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfigOS>>(configosService.findConfigOSAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert configos.
	 *
	 * @param request the request
	 * @return the configos response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configos/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfigOS> insertConfigOS(@RequestBody String configoss, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfigOS configos = mapper.readValue(configoss, ConfigOS.class);
		return new ResponseEntity<ConfigOS>(configosService.saveConfigOS(configos), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configos/update", method = RequestMethod.POST)
	public ResponseEntity<ConfigOS> updateConfigOS(@RequestBody ConfigOS configos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigOS>(configosService.updateConfigOS(configos), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/configos/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfigOS> deleteConfigOS(@RequestBody ConfigOS configos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfigOS>(configosService.deleteConfigOS(configos), HttpStatus.OK);
	}

//===================================### CONFBLUESOFT ####======================================
	/**
	 * Refresh confbluesofts.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the confbluesoft response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/confbluesoft/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ConfBlueSoft>> refreshConfBlueSoftPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfBlueSoft>>(confbluesoftService.findConfBlueSoftAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch confbluesoft paged.
	 *
	 * @param request the request
	 * @return the confbluesoft response
	 */
	@RequestMapping(value = "/confbluesoft/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<ConfBlueSoft>> fetchConfBlueSoftPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<ConfBlueSoft>>(confbluesoftService.findConfBlueSoftAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert confbluesoft.
	 *
	 * @param request the request
	 * @return the confbluesoft response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/confbluesoft/insert", method = RequestMethod.POST)
	public ResponseEntity<ConfBlueSoft> insertConfBlueSoft(@RequestBody String confbluesofts,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		ConfBlueSoft confbluesoft = mapper.readValue(confbluesofts, ConfBlueSoft.class);
		return new ResponseEntity<ConfBlueSoft>(confbluesoftService.saveConfBlueSoft(confbluesoft), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/confbluesoft/update", method = RequestMethod.POST)
	public ResponseEntity<ConfBlueSoft> updateConfBlueSoft(@RequestBody ConfBlueSoft confbluesoft,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfBlueSoft>(confbluesoftService.updateConfBlueSoft(confbluesoft), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/confbluesoft/delete", method = RequestMethod.POST)
	public ResponseEntity<ConfBlueSoft> deleteConfBlueSoft(@RequestBody ConfBlueSoft confbluesoft,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<ConfBlueSoft>(confbluesoftService.deleteConfBlueSoft(confbluesoft), HttpStatus.OK);
	}

}
