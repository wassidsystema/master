/** create by system gera-java version 1.0.0 22/11/2018 23:20 : 48*/

package com.nouhoun.springboot.jwt.integration.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.nouhoun.springboot.jwt.integration.domain.CategoriaMenu;
import com.nouhoun.springboot.jwt.integration.domain.Dominio;
import com.nouhoun.springboot.jwt.integration.domain.Field;
import com.nouhoun.springboot.jwt.integration.domain.GroupMenu;
import com.nouhoun.springboot.jwt.integration.domain.Help;
import com.nouhoun.springboot.jwt.integration.domain.Menu;
import com.nouhoun.springboot.jwt.integration.domain.Pagina;
import com.nouhoun.springboot.jwt.integration.domain.Tab;
import com.nouhoun.springboot.jwt.integration.domain.Validacao;
import com.nouhoun.springboot.jwt.integration.service.CategoriaMenuService;
import com.nouhoun.springboot.jwt.integration.service.DominioService;
import com.nouhoun.springboot.jwt.integration.service.FieldService;
import com.nouhoun.springboot.jwt.integration.service.GroupMenuService;
import com.nouhoun.springboot.jwt.integration.service.HelpService;
import com.nouhoun.springboot.jwt.integration.service.MenuService;
import com.nouhoun.springboot.jwt.integration.service.PaginaService;
import com.nouhoun.springboot.jwt.integration.service.TabService;
import com.nouhoun.springboot.jwt.integration.service.ValidacaoService;

/**
 * The Class DicionarioController.
 */
@Controller
public class DicionarioController {

	/** The groupmenu Service. */
	@Autowired
	public GroupMenuService groupMenuService;

	/** The categoriamenu Service. */
	@Autowired
	private CategoriaMenuService categoriamenuService;

	/** The menu Service. */
	@Autowired
	private MenuService menuService;

	/** The help Service. */
	@Autowired
	private HelpService helpService;

	/** The pagina Service. */
	@Autowired
	private PaginaService paginaService;

	/** The tab Service. */
	@Autowired
	private TabService tabService;

	/** The field Service. */
	@Autowired
	private FieldService fieldService;

	/** The validacao Service. */
	@Autowired
	private ValidacaoService validacaoService;

	/** The dominio Service. */
	@Autowired
	private DominioService dominioService;

//===================================### GROUPMENU ####======================================
	/**
	 * Refresh groupmenus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the groupmenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/groupmenu/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<GroupMenu>> refreshGroupMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<GroupMenu>>(groupMenuService.findGroupMenuAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch groupmenu paged.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/groupmenu/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<GroupMenu>> fetchGroupMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<GroupMenu>>(groupMenuService.findGroupMenuAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert groupmenu.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/groupmenu/insert", method = RequestMethod.POST)
	public ResponseEntity<GroupMenu> insertGroupMenu(@RequestBody String groupmenus, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		GroupMenu groupmenu = mapper.readValue(groupmenus, GroupMenu.class);
		return new ResponseEntity<GroupMenu>(groupMenuService.saveGroupMenu(groupmenu), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/groupmenu/update", method = RequestMethod.POST)
	public ResponseEntity<GroupMenu> updateGroupMenu(@RequestBody GroupMenu groupmenu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<GroupMenu>(groupMenuService.updateGroupMenu(groupmenu), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/groupmenu/delete", method = RequestMethod.POST)
	public ResponseEntity<GroupMenu> deleteGroupMenu(@RequestBody GroupMenu groupmenu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<GroupMenu>(groupMenuService.deleteGroupMenu(groupmenu), HttpStatus.OK);
	}

//===================================### CATEGORIAMENU ####======================================
	/**
	 * Refresh categoriamenus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the categoriamenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/categoriamenu/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<CategoriaMenu>> refreshCategoriaMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<CategoriaMenu>>(categoriamenuService.findCategoriaMenuAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Fetch categoriamenu paged.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@RequestMapping(value = "/categoriamenu/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<CategoriaMenu>> fetchCategoriaMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<CategoriaMenu>>(categoriamenuService.findCategoriaMenuAll(requestString),
				HttpStatus.OK);
	}

	/**
	 * Insert categoriamenu.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/categoriamenu/insert", method = RequestMethod.POST)
	public ResponseEntity<CategoriaMenu> insertCategoriaMenu(@RequestBody String categoriamenus,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		CategoriaMenu categoriamenu = mapper.readValue(categoriamenus, CategoriaMenu.class);
		return new ResponseEntity<CategoriaMenu>(categoriamenuService.saveCategoriaMenu(categoriamenu), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/categoriamenu/update", method = RequestMethod.POST)
	public ResponseEntity<CategoriaMenu> updateCategoriaMenu(@RequestBody CategoriaMenu categoriamenu,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<CategoriaMenu>(categoriamenuService.updateCategoriaMenu(categoriamenu),
				HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/categoriamenu/delete", method = RequestMethod.POST)
	public ResponseEntity<CategoriaMenu> deleteCategoriaMenu(@RequestBody CategoriaMenu categoriamenu,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<CategoriaMenu>(categoriamenuService.deleteCategoriaMenu(categoriamenu),
				HttpStatus.OK);
	}

//===================================### MENU ####======================================
	/**
	 * Refresh menus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the menu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menu/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Menu>> refreshMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Menu>>(menuService.findMenuAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch menu paged.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@RequestMapping(value = "/menu/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Menu>> fetchMenuPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Menu>>(menuService.findMenuAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert menu.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menu/insert", method = RequestMethod.POST)
	public ResponseEntity<Menu> insertMenu(@RequestBody String menus, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Menu menu = mapper.readValue(menus, Menu.class);
		return new ResponseEntity<Menu>(menuService.saveMenu(menu), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menu/update", method = RequestMethod.POST)
	public ResponseEntity<Menu> updateMenu(@RequestBody Menu menu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Menu>(menuService.updateMenu(menu), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/menu/delete", method = RequestMethod.POST)
	public ResponseEntity<Menu> deleteMenu(@RequestBody Menu menu, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Menu>(menuService.deleteMenu(menu), HttpStatus.OK);
	}

//===================================### HELP ####======================================
	/**
	 * Refresh helps.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the help response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/help/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Help>> refreshHelpPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Help>>(helpService.findHelpAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch help paged.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@RequestMapping(value = "/help/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Help>> fetchHelpPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Help>>(helpService.findHelpAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert help.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/help/insert", method = RequestMethod.POST)
	public ResponseEntity<Help> insertHelp(@RequestBody String helps, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Help help = mapper.readValue(helps, Help.class);
		return new ResponseEntity<Help>(helpService.saveHelp(help), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/help/update", method = RequestMethod.POST)
	public ResponseEntity<Help> updateHelp(@RequestBody Help help, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Help>(helpService.updateHelp(help), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/help/delete", method = RequestMethod.POST)
	public ResponseEntity<Help> deleteHelp(@RequestBody Help help, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Help>(helpService.deleteHelp(help), HttpStatus.OK);
	}

//===================================### PAGINA ####======================================
	/**
	 * Refresh paginas.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the pagina response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/pagina/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Pagina>> refreshPaginaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Pagina>>(paginaService.findPaginaAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch pagina paged.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@RequestMapping(value = "/pagina/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Pagina>> fetchPaginaPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Pagina>>(paginaService.findPaginaAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert pagina.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/pagina/insert", method = RequestMethod.POST)
	public ResponseEntity<Pagina> insertPagina(@RequestBody String paginas, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Pagina pagina = mapper.readValue(paginas, Pagina.class);
		return new ResponseEntity<Pagina>(paginaService.savePagina(pagina), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/pagina/update", method = RequestMethod.POST)
	public ResponseEntity<Pagina> updatePagina(@RequestBody Pagina pagina, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Pagina>(paginaService.updatePagina(pagina), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/pagina/delete", method = RequestMethod.POST)
	public ResponseEntity<Pagina> deletePagina(@RequestBody Pagina pagina, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Pagina>(paginaService.deletePagina(pagina), HttpStatus.OK);
	}

//===================================### TAB ####======================================
	/**
	 * Refresh tabs.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the tab response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tab/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Tab>> refreshTabPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Tab>>(tabService.findTabAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch tab paged.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@RequestMapping(value = "/tab/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Tab>> fetchTabPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Tab>>(tabService.findTabAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert tab.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tab/insert", method = RequestMethod.POST)
	public ResponseEntity<Tab> insertTab(@RequestBody String tabs, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Tab tab = mapper.readValue(tabs, Tab.class);
		return new ResponseEntity<Tab>(tabService.saveTab(tab), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tab/update", method = RequestMethod.POST)
	public ResponseEntity<Tab> updateTab(@RequestBody Tab tab, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Tab>(tabService.updateTab(tab), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/tab/delete", method = RequestMethod.POST)
	public ResponseEntity<Tab> deleteTab(@RequestBody Tab tab, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Tab>(tabService.deleteTab(tab), HttpStatus.OK);
	}

//===================================### FIELD ####======================================
	/**
	 * Refresh fields.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the field response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/field/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Field>> refreshFieldPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Field>>(fieldService.findFieldAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch field paged.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@RequestMapping(value = "/field/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Field>> fetchFieldPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Field>>(fieldService.findFieldAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert field.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/field/insert", method = RequestMethod.POST)
	public ResponseEntity<Field> insertField(@RequestBody String fields, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Field field = mapper.readValue(fields, Field.class);
		return new ResponseEntity<Field>(fieldService.saveField(field), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/field/update", method = RequestMethod.POST)
	public ResponseEntity<Field> updateField(@RequestBody Field field, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Field>(fieldService.updateField(field), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/field/delete", method = RequestMethod.POST)
	public ResponseEntity<Field> deleteField(@RequestBody Field field, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Field>(fieldService.deleteField(field), HttpStatus.OK);
	}

//===================================### VALIDACAO ####======================================
	/**
	 * Refresh validacaos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the validacao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/validacao/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Validacao>> refreshValidacaoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Validacao>>(validacaoService.findValidacaoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch validacao paged.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@RequestMapping(value = "/validacao/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Validacao>> fetchValidacaoPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Validacao>>(validacaoService.findValidacaoAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert validacao.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/validacao/insert", method = RequestMethod.POST)
	public ResponseEntity<Validacao> insertValidacao(@RequestBody String validacaos, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Validacao validacao = mapper.readValue(validacaos, Validacao.class);
		return new ResponseEntity<Validacao>(validacaoService.saveValidacao(validacao), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/validacao/update", method = RequestMethod.POST)
	public ResponseEntity<Validacao> updateValidacao(@RequestBody Validacao validacao, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Validacao>(validacaoService.updateValidacao(validacao), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/validacao/delete", method = RequestMethod.POST)
	public ResponseEntity<Validacao> deleteValidacao(@RequestBody Validacao validacao, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Validacao>(validacaoService.deleteValidacao(validacao), HttpStatus.OK);
	}

//===================================### DOMINIO ####======================================
	/**
	 * Refresh dominios.
	 *
	 * @param refreshInt the refresh int
	 * @param retList    the ret list
	 * @param retPaged   the ret paged
	 * @return the dominio response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/dominio/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Dominio>> refreshDominioPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Dominio>>(dominioService.findDominioAll(requestString), HttpStatus.OK);
	}

	/**
	 * Fetch dominio paged.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@RequestMapping(value = "/dominio/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Dominio>> fetchDominioPaged(@RequestBody PaginationFilter requestString) {
		return new ResponseEntity<List<Dominio>>(dominioService.findDominioAll(requestString), HttpStatus.OK);
	}

	/**
	 * Insert dominio.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/dominio/insert", method = RequestMethod.POST)
	public ResponseEntity<Dominio> insertDominio(@RequestBody String dominios, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Dominio dominio = mapper.readValue(dominios, Dominio.class);
		return new ResponseEntity<Dominio>(dominioService.saveDominio(dominio), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/dominio/update", method = RequestMethod.POST)
	public ResponseEntity<Dominio> updateDominio(@RequestBody Dominio dominio, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Dominio>(dominioService.updateDominio(dominio), HttpStatus.OK);
	}

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/dominio/delete", method = RequestMethod.POST)
	public ResponseEntity<Dominio> deleteDominio(@RequestBody Dominio dominio, HttpServletRequest request)
			throws JsonParseException, JsonMappingException, IOException {

		return new ResponseEntity<Dominio>(dominioService.deleteDominio(dominio), HttpStatus.OK);
	}

}
