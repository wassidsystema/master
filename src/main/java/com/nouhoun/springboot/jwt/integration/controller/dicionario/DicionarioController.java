/** create by system gera-java version 1.0.0 21/11/2018 0:12 : 58*/

package com.nouhoun.springboot.jwt.integration.controller.dicionario;

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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nouhoun.springboot.jwt.integration.domain.Chat;
import com.nouhoun.springboot.jwt.integration.domain.ChatItens;
import com.nouhoun.springboot.jwt.integration.domain.security.User;
import com.nouhoun.springboot.jwt.integration.service.ChatService;

package com.nouhoun.springboot.jwt.integration.controller.dicionario;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qat.framework.model.response.InternalResultsResponse;
import com.qat.framework.util.ResponseHandler;
import com.qat.samples.sysmgmt.bac.IDicionarioBAC;
import com.qat.samples.sysmgmt.model.Dicionario;
import com.qat.samples.sysmgmt.model.request.PagedInquiryRequest;
import com.qat.samples.sysmgmt.model.request.DicionarioMaintenanceRequest;
import com.qat.samples.sysmgmt.model.request.RefreshRequest;
import com.qat.samples.sysmgmt.model.response.DicionarioResponse;

/**
 * The Class DicionarioController.
 */
@Controller
@RequestMapping("/dicionario/api")
public class DicionarioController 
{
	/** The Constant DEFAULT_EXCEPTION_MSG. */
	private static final String DEFAULT_EXCEPTION_MSG = "sysmgmt.base.dicionariocontrollerrest.defaultexception";

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(DicionarioController.class);

	/** The dicionario Service. */
@Autowired
	private DicionarioService dicionarioService;


//===================================### GROUPMENU ####======================================
/**
	 * Refresh groupmenus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the groupmenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<GroupMenu>>  refreshGroupMenus(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<GroupMenu> groupmenus = dicionarioService.refreshGroupMenus(retList, retPaged);
			return APIResponse.toOkResponse(groupmenus);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, groupmenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch groupmenu paged.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<GroupMenu>> fetchGroupMenuPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<GroupMenu>>(dicionarioService.findGroupMenuAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, groupmenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert groupmenu.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public GroupMenuResponse insertGroupMenu(@RequestBody GroupMenuMaintenanceRequest request)
	{
		GroupMenuResponse groupmenuResponse = new GroupMenuResponse();
		try
		{
			InternalResultsResponse<GroupMenu> internalResponse = getDicionarioBAC().insertGroupMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(groupmenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, groupmenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return groupmenuResponse;
	}

	/**
	 * Update groupmenu.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public GroupMenuResponse updateGroupMenu(@RequestBody GroupMenuMaintenanceRequest request)
	{
		GroupMenuResponse groupmenuResponse = new GroupMenuResponse();
		try
		{
			InternalResultsResponse<GroupMenu> internalResponse = getDicionarioBAC().updateGroupMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(groupmenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, groupmenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return groupmenuResponse;
	}

	/**
	 * Delete groupmenu.
	 *
	 * @param request the request
	 * @return the groupmenu response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public GroupMenuResponse deleteGroupMenu(@RequestBody GroupMenuMaintenanceRequest request)
	{
		GroupMenuResponse groupmenuResponse = new GroupMenuResponse();

		try
		{
			InternalResultsResponse<GroupMenu> internalResponse = getDicionarioBAC().deleteGroupMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(groupmenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, groupmenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return groupmenuResponse;

	}


//===================================### CATEGORIAMENU ####======================================
/**
	 * Refresh categoriamenus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the categoriamenu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<CategoriaMenu>>  refreshCategoriaMenus(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<CategoriaMenu> categoriamenus = dicionarioService.refreshCategoriaMenus(retList, retPaged);
			return APIResponse.toOkResponse(categoriamenus);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, categoriamenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch categoriamenu paged.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<CategoriaMenu>> fetchCategoriaMenuPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<CategoriaMenu>>(dicionarioService.findCategoriaMenuAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, categoriamenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert categoriamenu.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public CategoriaMenuResponse insertCategoriaMenu(@RequestBody CategoriaMenuMaintenanceRequest request)
	{
		CategoriaMenuResponse categoriamenuResponse = new CategoriaMenuResponse();
		try
		{
			InternalResultsResponse<CategoriaMenu> internalResponse = getDicionarioBAC().insertCategoriaMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(categoriamenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, categoriamenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return categoriamenuResponse;
	}

	/**
	 * Update categoriamenu.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public CategoriaMenuResponse updateCategoriaMenu(@RequestBody CategoriaMenuMaintenanceRequest request)
	{
		CategoriaMenuResponse categoriamenuResponse = new CategoriaMenuResponse();
		try
		{
			InternalResultsResponse<CategoriaMenu> internalResponse = getDicionarioBAC().updateCategoriaMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(categoriamenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, categoriamenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return categoriamenuResponse;
	}

	/**
	 * Delete categoriamenu.
	 *
	 * @param request the request
	 * @return the categoriamenu response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public CategoriaMenuResponse deleteCategoriaMenu(@RequestBody CategoriaMenuMaintenanceRequest request)
	{
		CategoriaMenuResponse categoriamenuResponse = new CategoriaMenuResponse();

		try
		{
			InternalResultsResponse<CategoriaMenu> internalResponse = getDicionarioBAC().deleteCategoriaMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(categoriamenuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, categoriamenuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return categoriamenuResponse;

	}


//===================================### MENU ####======================================
/**
	 * Refresh menus.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the menu response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Menu>>  refreshMenus(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Menu> menus = dicionarioService.refreshMenus(retList, retPaged);
			return APIResponse.toOkResponse(menus);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, menuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch menu paged.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Menu>> fetchMenuPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Menu>>(dicionarioService.findMenuAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, menuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert menu.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public MenuResponse insertMenu(@RequestBody MenuMaintenanceRequest request)
	{
		MenuResponse menuResponse = new MenuResponse();
		try
		{
			InternalResultsResponse<Menu> internalResponse = getDicionarioBAC().insertMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(menuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, menuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return menuResponse;
	}

	/**
	 * Update menu.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public MenuResponse updateMenu(@RequestBody MenuMaintenanceRequest request)
	{
		MenuResponse menuResponse = new MenuResponse();
		try
		{
			InternalResultsResponse<Menu> internalResponse = getDicionarioBAC().updateMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(menuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, menuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return menuResponse;
	}

	/**
	 * Delete menu.
	 *
	 * @param request the request
	 * @return the menu response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public MenuResponse deleteMenu(@RequestBody MenuMaintenanceRequest request)
	{
		MenuResponse menuResponse = new MenuResponse();

		try
		{
			InternalResultsResponse<Menu> internalResponse = getDicionarioBAC().deleteMenu(request);
			ResponseHandler.handleOperationStatusAndMessages(menuResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, menuResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return menuResponse;

	}


//===================================### HELP ####======================================
/**
	 * Refresh helps.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the help response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Help>>  refreshHelps(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Help> helps = dicionarioService.refreshHelps(retList, retPaged);
			return APIResponse.toOkResponse(helps);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, helpResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch help paged.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Help>> fetchHelpPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Help>>(dicionarioService.findHelpAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, helpResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert help.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public HelpResponse insertHelp(@RequestBody HelpMaintenanceRequest request)
	{
		HelpResponse helpResponse = new HelpResponse();
		try
		{
			InternalResultsResponse<Help> internalResponse = getDicionarioBAC().insertHelp(request);
			ResponseHandler.handleOperationStatusAndMessages(helpResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, helpResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return helpResponse;
	}

	/**
	 * Update help.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public HelpResponse updateHelp(@RequestBody HelpMaintenanceRequest request)
	{
		HelpResponse helpResponse = new HelpResponse();
		try
		{
			InternalResultsResponse<Help> internalResponse = getDicionarioBAC().updateHelp(request);
			ResponseHandler.handleOperationStatusAndMessages(helpResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, helpResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return helpResponse;
	}

	/**
	 * Delete help.
	 *
	 * @param request the request
	 * @return the help response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public HelpResponse deleteHelp(@RequestBody HelpMaintenanceRequest request)
	{
		HelpResponse helpResponse = new HelpResponse();

		try
		{
			InternalResultsResponse<Help> internalResponse = getDicionarioBAC().deleteHelp(request);
			ResponseHandler.handleOperationStatusAndMessages(helpResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, helpResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return helpResponse;

	}


//===================================### PAGINA ####======================================
/**
	 * Refresh paginas.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the pagina response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Pagina>>  refreshPaginas(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Pagina> paginas = dicionarioService.refreshPaginas(retList, retPaged);
			return APIResponse.toOkResponse(paginas);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, paginaResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch pagina paged.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Pagina>> fetchPaginaPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Pagina>>(dicionarioService.findPaginaAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, paginaResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert pagina.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public PaginaResponse insertPagina(@RequestBody PaginaMaintenanceRequest request)
	{
		PaginaResponse paginaResponse = new PaginaResponse();
		try
		{
			InternalResultsResponse<Pagina> internalResponse = getDicionarioBAC().insertPagina(request);
			ResponseHandler.handleOperationStatusAndMessages(paginaResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, paginaResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return paginaResponse;
	}

	/**
	 * Update pagina.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public PaginaResponse updatePagina(@RequestBody PaginaMaintenanceRequest request)
	{
		PaginaResponse paginaResponse = new PaginaResponse();
		try
		{
			InternalResultsResponse<Pagina> internalResponse = getDicionarioBAC().updatePagina(request);
			ResponseHandler.handleOperationStatusAndMessages(paginaResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, paginaResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return paginaResponse;
	}

	/**
	 * Delete pagina.
	 *
	 * @param request the request
	 * @return the pagina response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public PaginaResponse deletePagina(@RequestBody PaginaMaintenanceRequest request)
	{
		PaginaResponse paginaResponse = new PaginaResponse();

		try
		{
			InternalResultsResponse<Pagina> internalResponse = getDicionarioBAC().deletePagina(request);
			ResponseHandler.handleOperationStatusAndMessages(paginaResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, paginaResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return paginaResponse;

	}


//===================================### TAB ####======================================
/**
	 * Refresh tabs.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the tab response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Tab>>  refreshTabs(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Tab> tabs = dicionarioService.refreshTabs(retList, retPaged);
			return APIResponse.toOkResponse(tabs);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, tabResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch tab paged.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Tab>> fetchTabPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Tab>>(dicionarioService.findTabAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, tabResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert tab.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public TabResponse insertTab(@RequestBody TabMaintenanceRequest request)
	{
		TabResponse tabResponse = new TabResponse();
		try
		{
			InternalResultsResponse<Tab> internalResponse = getDicionarioBAC().insertTab(request);
			ResponseHandler.handleOperationStatusAndMessages(tabResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, tabResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return tabResponse;
	}

	/**
	 * Update tab.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public TabResponse updateTab(@RequestBody TabMaintenanceRequest request)
	{
		TabResponse tabResponse = new TabResponse();
		try
		{
			InternalResultsResponse<Tab> internalResponse = getDicionarioBAC().updateTab(request);
			ResponseHandler.handleOperationStatusAndMessages(tabResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, tabResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return tabResponse;
	}

	/**
	 * Delete tab.
	 *
	 * @param request the request
	 * @return the tab response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public TabResponse deleteTab(@RequestBody TabMaintenanceRequest request)
	{
		TabResponse tabResponse = new TabResponse();

		try
		{
			InternalResultsResponse<Tab> internalResponse = getDicionarioBAC().deleteTab(request);
			ResponseHandler.handleOperationStatusAndMessages(tabResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, tabResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return tabResponse;

	}


//===================================### ENTIDADE ####======================================
/**
	 * Refresh entidades.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the entidade response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Entidade>>  refreshEntidades(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Entidade> entidades = dicionarioService.refreshEntidades(retList, retPaged);
			return APIResponse.toOkResponse(entidades);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, entidadeResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch entidade paged.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Entidade>> fetchEntidadePaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Entidade>>(dicionarioService.findEntidadeAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, entidadeResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert entidade.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public EntidadeResponse insertEntidade(@RequestBody EntidadeMaintenanceRequest request)
	{
		EntidadeResponse entidadeResponse = new EntidadeResponse();
		try
		{
			InternalResultsResponse<Entidade> internalResponse = getDicionarioBAC().insertEntidade(request);
			ResponseHandler.handleOperationStatusAndMessages(entidadeResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, entidadeResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return entidadeResponse;
	}

	/**
	 * Update entidade.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public EntidadeResponse updateEntidade(@RequestBody EntidadeMaintenanceRequest request)
	{
		EntidadeResponse entidadeResponse = new EntidadeResponse();
		try
		{
			InternalResultsResponse<Entidade> internalResponse = getDicionarioBAC().updateEntidade(request);
			ResponseHandler.handleOperationStatusAndMessages(entidadeResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, entidadeResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return entidadeResponse;
	}

	/**
	 * Delete entidade.
	 *
	 * @param request the request
	 * @return the entidade response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public EntidadeResponse deleteEntidade(@RequestBody EntidadeMaintenanceRequest request)
	{
		EntidadeResponse entidadeResponse = new EntidadeResponse();

		try
		{
			InternalResultsResponse<Entidade> internalResponse = getDicionarioBAC().deleteEntidade(request);
			ResponseHandler.handleOperationStatusAndMessages(entidadeResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, entidadeResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return entidadeResponse;

	}


//===================================### FIELD ####======================================
/**
	 * Refresh fields.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the field response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Field>>  refreshFields(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Field> fields = dicionarioService.refreshFields(retList, retPaged);
			return APIResponse.toOkResponse(fields);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, fieldResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch field paged.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Field>> fetchFieldPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Field>>(dicionarioService.findFieldAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, fieldResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert field.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public FieldResponse insertField(@RequestBody FieldMaintenanceRequest request)
	{
		FieldResponse fieldResponse = new FieldResponse();
		try
		{
			InternalResultsResponse<Field> internalResponse = getDicionarioBAC().insertField(request);
			ResponseHandler.handleOperationStatusAndMessages(fieldResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, fieldResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return fieldResponse;
	}

	/**
	 * Update field.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public FieldResponse updateField(@RequestBody FieldMaintenanceRequest request)
	{
		FieldResponse fieldResponse = new FieldResponse();
		try
		{
			InternalResultsResponse<Field> internalResponse = getDicionarioBAC().updateField(request);
			ResponseHandler.handleOperationStatusAndMessages(fieldResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, fieldResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return fieldResponse;
	}

	/**
	 * Delete field.
	 *
	 * @param request the request
	 * @return the field response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public FieldResponse deleteField(@RequestBody FieldMaintenanceRequest request)
	{
		FieldResponse fieldResponse = new FieldResponse();

		try
		{
			InternalResultsResponse<Field> internalResponse = getDicionarioBAC().deleteField(request);
			ResponseHandler.handleOperationStatusAndMessages(fieldResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, fieldResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return fieldResponse;

	}


//===================================### VALIDACAO ####======================================
/**
	 * Refresh validacaos.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the validacao response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Validacao>>  refreshValidacaos(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Validacao> validacaos = dicionarioService.refreshValidacaos(retList, retPaged);
			return APIResponse.toOkResponse(validacaos);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, validacaoResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch validacao paged.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Validacao>> fetchValidacaoPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Validacao>>(dicionarioService.findValidacaoAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, validacaoResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert validacao.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public ValidacaoResponse insertValidacao(@RequestBody ValidacaoMaintenanceRequest request)
	{
		ValidacaoResponse validacaoResponse = new ValidacaoResponse();
		try
		{
			InternalResultsResponse<Validacao> internalResponse = getDicionarioBAC().insertValidacao(request);
			ResponseHandler.handleOperationStatusAndMessages(validacaoResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, validacaoResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return validacaoResponse;
	}

	/**
	 * Update validacao.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public ValidacaoResponse updateValidacao(@RequestBody ValidacaoMaintenanceRequest request)
	{
		ValidacaoResponse validacaoResponse = new ValidacaoResponse();
		try
		{
			InternalResultsResponse<Validacao> internalResponse = getDicionarioBAC().updateValidacao(request);
			ResponseHandler.handleOperationStatusAndMessages(validacaoResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, validacaoResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return validacaoResponse;
	}

	/**
	 * Delete validacao.
	 *
	 * @param request the request
	 * @return the validacao response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public ValidacaoResponse deleteValidacao(@RequestBody ValidacaoMaintenanceRequest request)
	{
		ValidacaoResponse validacaoResponse = new ValidacaoResponse();

		try
		{
			InternalResultsResponse<Validacao> internalResponse = getDicionarioBAC().deleteValidacao(request);
			ResponseHandler.handleOperationStatusAndMessages(validacaoResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, validacaoResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return validacaoResponse;

	}


//===================================### DOMINIO ####======================================
/**
	 * Refresh dominios.
	 *
	 * @param refreshInt the refresh int
	 * @param retList the ret list
	 * @param retPaged the ret paged
	 * @return the dominio response
	 */
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/refresh", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Dominio>>  refreshDominios(@RequestParam("refreshInt") Integer refreshInt,
			@RequestParam("retList") Boolean retList,
			@RequestParam("retPaged") Boolean retPaged)
	{
		try
		{
			List<Dominio> dominios = dicionarioService.refreshDominios(retList, retPaged);
			return APIResponse.toOkResponse(dominios);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, dominioResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}

	}

	/**
	 * Fetch dominio paged.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@RequestMapping(value = "/fetchPage", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<Dominio>> fetchDominioPaged(@RequestBody String requestString)
	{
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Request request = mapper.readValue(requestString, Request.class);

			return new ResponseEntity<List<Dominio>>(dicionarioService.findDominioAll(request), HttpStatus.OK);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, dominioResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
	}

	/**
	 * Insert dominio.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public DominioResponse insertDominio(@RequestBody DominioMaintenanceRequest request)
	{
		DominioResponse dominioResponse = new DominioResponse();
		try
		{
			InternalResultsResponse<Dominio> internalResponse = getDicionarioBAC().insertDominio(request);
			ResponseHandler.handleOperationStatusAndMessages(dominioResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, dominioResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return dominioResponse;
	}

	/**
	 * Update dominio.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public DominioResponse updateDominio(@RequestBody DominioMaintenanceRequest request)
	{
		DominioResponse dominioResponse = new DominioResponse();
		try
		{
			InternalResultsResponse<Dominio> internalResponse = getDicionarioBAC().updateDominio(request);
			ResponseHandler.handleOperationStatusAndMessages(dominioResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, dominioResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return dominioResponse;
	}

	/**
	 * Delete dominio.
	 *
	 * @param request the request
	 * @return the dominio response
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public DominioResponse deleteDominio(@RequestBody DominioMaintenanceRequest request)
	{
		DominioResponse dominioResponse = new DominioResponse();

		try
		{
			InternalResultsResponse<Dominio> internalResponse = getDicionarioBAC().deleteDominio(request);
			ResponseHandler.handleOperationStatusAndMessages(dominioResponse, internalResponse, true);
		}
		catch (Exception ex)
		{
			ResponseHandler.handleException(LOG, dominioResponse, ex, DEFAULT_EXCEPTION_MSG,
					new Object[] {ex.toString()});
		}
		return dominioResponse;

	}

}
