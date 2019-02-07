(function() {
  'use strict';
	var commonControllers =  angular.module('wdApp.controllers', []);

	commonControllers.controller('WDAppController', ['$scope', '$rootScope', function($scope, $rootScope) {
		var $window;
		$window = $(window);

		$scope.admin = {
			layout: 'wide',
			menu: 'vertical',
			fixedHeader: true,
			fixedSidebar: true
		};

		$scope.$watch('admin', function(newVal, oldVal) {
			if (newVal.menu === 'vertical' && oldVal.menu === 'horizontal') {
			  $rootScope.$broadcast('nav:reset');
			  return;
			}
			if (newVal.fixedHeader === false && newVal.fixedSidebar === true) {
			  if (oldVal.fixedHeader === false && oldVal.fixedSidebar === false) {
				$scope.admin.fixedHeader = true;
				$scope.admin.fixedSidebar = true;
			  }
			  if (oldVal.fixedHeader === true && oldVal.fixedSidebar === true) {
				$scope.admin.fixedHeader = false;
				$scope.admin.fixedSidebar = false;
			  }
			  return;
			}
			if (newVal.fixedSidebar === true) {
			  $scope.admin.fixedHeader = true;
			}
			if (newVal.fixedHeader === false) {
			  $scope.admin.fixedSidebar = false;
			}
		}, true);

		return $scope.color = {
			primary: '#00475B',
			success: '#94B758',
			info: '#56BDF1',
			infoAlt: '#7F6EC7',
			warning: '#F3C536',
			danger: '#FFDC54'
		 };
    }]);

	commonControllers.controller('NavContainerController', ['$scope', function($scope) {}]);

	commonControllers.controller('NavController', ['$element','$compile','$http','$location','$rootScope','$scope', 'TaskStorage', 'filterFilter','localStorageService','SysMgmtData', function($element,$compile,$http,$location, $rootScope, $scope, TaskStorage, filterFilter,localStorageService,SysMgmtData) {
		var vm = this;
		var tasks;

		vm.test = 0;
	  $scope.empresa = {
        types: []
      };

      $scope.empresaType = 1

      function visible(){
      	//debugger
      	return true
      }
      
      $scope.pespectiva = "F";

      $scope.change = function() {
      };

      $scope.submit = function() {
	      if($scope.empresaType == 1)
	      {
	      		$('.fiscal').hide();
	      }
      };
      
      $scope.returnUrl = function(oMenu,oPagina) {
    	//  debugger
	      if(oMenu.nivel == 0)
	      {
	    	  if(oMenu.groupMenu[0].paginasss[0].existe == 1){
	    		  return oMenu.groupMenu[0].paginasss[0].paginaFisica;
	    	  } else {
	    		  return "#/ajax/main_form?id="+oMenu.groupMenu[0].paginasss[0].id;
	    	  }
	      } else {
	    	  if(oPagina && oPagina.existe == 1){
	    		  return oPagina.paginaFisica;
	    	  } else {
	    		  if(oPagina)
	    			  return "#/ajax/main_form "+ oPagina != null ?  "?id="+oPagina.id : ""
	    			  else 
	    				  return "#/ajax/main_form "
	    	  }
	      }
      };
      
      /*-------------------------------------------
  	Main scripts used by theme
  ---------------------------------------------*/
  //
  //  Function for load content from url and put in $('.ajax-content') block
  //
  
      function LoadAjaxContent2(url,tab_id){
    		$.ajax({
    			mimeType: 'text/html; charset=utf-8', // ! Need set mimeType only when run from local file
    			url: url,
    			type: 'GET',
    			success: function(data) {
    				$('#'+tab_id).find('#ajax-content').html(data);

    				$('.preloader').hide();
    			},
    			error: function (jqXHR, textStatus, errorThrown) {
    				alert(errorThrown);
    			},
    			dataType: "html",
    			async: false
    		});
    	}
      
  function LoadAjaxContent(url, pageName){
  	$('.preloader').show();
  	if (angular.isDefined(url) && url !== '') {
        $http.get("views/ajax/main.html").success(function(response) {
//         	debugger
//        	$("div#tabs").tabs();
//			var num_tabs = $("div#tabs ul li").length + 1;
//			var tab_id = "tab" + num_tabs;
////			$("div#tabs ul").append(
////				"<li><a href='tab"+pageName+"'>" + pageName + "</a></li>"
////			);
//			$("div#tabs ul").append(
//					"<li><a href='#tab" + pageName + "'>" + pageName + "</a></li>"
//				);
//			$("div#tabs").append("<div id='tab"+pageName+"'></div>");
//			
			
		//	$("div#tabs").tabs();
			$("div#tabs").tabs();
			var num_tabs = $("div#tabs ul li").length + 1;
			var tab_id = "tab" + num_tabs;
			$("div#tabs ul").append(
				"<li><a href='#tab" + num_tabs + "'>" + pageName + "</a></li>"
			);
			$("div#tabs").append("<div id='tab"+num_tabs+"'></div>");
			

			// var num_tabs = $("div#tabs ul li").length + 1;
			// var tab_id = "tab" + num_tabs;
			// $("div#tabs ul").append(
			// 	"<li><a id='"+ tab_id +"' href='#tab" + num_tabs + "'>#" + num_tabs + "</a></li>"
			// );

      	// $("div#tabs").tabs("refresh");

		//	$("#"+tab_id).html(data);
			$("#"+tab_id).html(response);
			$compile($("#"+tab_id).contents())($scope.$parent);
			$("div#tabs").tabs("refresh");
		//	LoadAjaxContent2(url,tab_id)
			$('#tabs').tabs("option", "active", $("#tab_header").index());
			

//          element.html(response);
//          $compile(element.contents())(scope.$parent);
//          scope.srcLoaded();
        }).error(function(response) {
          if ('srcError' in attrs) {
            scope.srcError({response: response});
          } else {
            var srcErrorMessage = angular.isDefined(attrs.srcErrorMessage) ? attrs.srcErrorMessage : paneConfig.srcErrorMessage;
            element.html(srcErrorMessage);
          }
        });
      }
//  	$.ajax({
//  		mimeType: 'text/html; charset=utf-8', // ! Need set mimeType only when run from local file
//  		url: url,
//  		type: 'GET',
//  		success: function(data) {
//  			
//  			$("div#tabs").tabs();
//  			var num_tabs = $("div#tabs ul li").length + 1;
//  			var tab_id = "tab" + num_tabs;
//  			$("div#tabs ul").append(
//  				"<li><a href='#tab" + num_tabs + "'>#" + num_tabs + "</a></li>"
//  			);
//  			$("div#tabs").append("<div id='tab"+num_tabs+"'></div>");
//  			
//
//  			// var num_tabs = $("div#tabs ul li").length + 1;
//  			// var tab_id = "tab" + num_tabs;
//  			// $("div#tabs ul").append(
//  			// 	"<li><a id='"+ tab_id +"' href='#tab" + num_tabs + "'>#" + num_tabs + "</a></li>"
//  			// );
//
//          	// $("div#tabs").tabs("refresh");
//
//  			$("#"+tab_id).html(data);
//  			$("div#tabs").tabs("refresh");
//  			$('.preloader').hide();
//  		},
//  		error: function (jqXHR, textStatus, errorThrown) {
//  			alert(errorThrown);
//  		},
//  		dataType: "html",
//  		async: false
//  	});
  }
      
      $scope.loadPagina = function(oPage) {
    	//  debugger
    	// let ajax_url = '#/ajax/main_form?id='+oPage.id;
    	  localStorageService.set('paginaId', oPage);
    	  console.log("======================================================");
    	  console.log(oPage);
    	  LoadAjaxContent("views/ajax/main2.html", oPage.pagina);
      }
      
      $scope.pageName = function(oMenu) {
    	  debugger
	      if(oMenu.nivel == 0)
	      {
	    	  return oMenu.groupMenu[0].paginasss[0] ? oMenu.groupMenu[0].paginasss[0].pagina : oMenu.groupMenu[0].nome;
	      } else {
	    	  return oMenu.groupMenu[0].nome;
	      }
      };
      
      $scope.pageIcon = function(oMenu) {
      	//  debugger
  	      if(oMenu.nivel == 0)
  	      {
  	    	  return oMenu.groupMenu[0].icone;
  	      } else {
  	    	  return oMenu.icon;
  	      }
        };
        
        $scope.colors = ['blue', 'red', 'orange', 'purple'];
        $scope.pebbles = [];
      
      $scope.fnNivel = function(oMenu) {
    	  
    	  if(oMenu.nivel == 1){
    		  return true
    	  } else {
    		  return false;
    	  }
      }
      $scope.ngRepeatFinished = function() {
    	  $("div#tabs").tabs();
  	$('.dropdown:has(li:has(a.active)) > a').addClass('active-parent active');
	$('.dropdown:has(li:has(a.active)) > ul').css("display", "block");
	$('.main-menu').on('click', 'a', function (e) {
//		debugger
		var parents = $(this).parents('li');
		var li = $(this).closest('li.dropdown');
		var another_items = $('.main-menu li').not(parents);
		another_items.find('a').removeClass('active');
		another_items.find('a').removeClass('active-parent');
		if ($(this).hasClass('dropdown-toggle') || $(this).closest('li').find('ul').length == 0) {
			$(this).addClass('active-parent');
			var current = $(this).next();
			if (current.is(':visible')) {
				li.find("ul.dropdown-menu").slideUp('fast');
				li.find("ul.dropdown-menu a").removeClass('active')
			}
			else {
				another_items.find("ul.dropdown-menu").slideUp('fast');
				current.slideDown('fast');
			}
		}
		else {
			if (li.find('a.dropdown-toggle').hasClass('active-parent')) {
				var pre = $(this).closest('ul.dropdown-menu');
				pre.find("li.dropdown").not($(this).closest('li')).find('ul.dropdown-menu').slideUp('fast');
			}
		}
		if ($(this).hasClass('active') == false) {
			$(this).parents("ul.dropdown-menu").find('a').removeClass('active');
			$(this).addClass('active')
		}
		if ($(this).hasClass('ajax-link')) {
			e.preventDefault();
			if ($(this).hasClass('add-full')) {
				$('#content').addClass('full-content');
			}
			else {
				$('#content').removeClass('full-content');
			}
			
		}
		if ($(this).attr('href') == '#') {
			e.preventDefault();
		}
	});
	}
      $scope.fnClass = function(oMenu) {
    	  if(oMenu.nivel == 1){
    		  return "dropdown"
    	  } else {
    		  return "zezim";
    	  }
      }
      
      
      SysMgmtData.processPostPageData("menu/fetchPage", {

      }, function(res) {
    	  console.log(res)
          if (res) {
        	  $rootScope.menus = res;
          }
      });


		tasks = $scope.tasks = TaskStorage.get();
		$scope.taskRemainingCount = filterFilter(tasks, {
			completed: false
		}).length;


		return $scope.empresaType;
    }]);

	commonControllers.controller('DashboardController', ['$scope', function($scope) {

	}]);
	
	
	
	
	commonControllers.run(["$templateCache", function($templateCache){
		  $templateCache.put("template/tabs/pane.html",
		    "<div class=\"tab-pane\" ng-class=\"{active: selected}\" ng-show=\"selected\" ng-transclude></div>" +
		    "");
		}]);

	commonControllers.run(["$templateCache", function($templateCache){
		  $templateCache.put("template/tabs/tabs.html",
		    "<div class=\"tabbable\">" +
		    "  <ul class=\"nav nav-tabs\">" +
		    "    <li ng-repeat=\"pane in panes\" ng-class=\"{active:pane.selected}\">" +
		    "      <a href=\"\" ng-click=\"select(pane)\">{{pane.heading}}</a>" +
		    "    </li>" +
		    "  </ul>" +
		    "  <div class=\"tab-content\" ng-transclude></div>" +
		    "</div>" +
		    "");
		}]);

	commonControllers.controller('TabsController', ['$scope', '$element', function($scope, $element) {
		  var panes = $scope.panes = [];

		  this.select = $scope.select = function selectPane(pane) {
		    angular.forEach(panes, function(pane) {
		      pane.selected = false;
		    });
		    pane.selected = true;
		  };

		  this.addPane = function addPane(pane) {
		    if (!panes.length) {
		      $scope.select(pane);
		    }
		    panes.push(pane);
		  };

		  this.removePane = function removePane(pane) { 
		    var index = panes.indexOf(pane);
		    panes.splice(index, 1);
		    //Select a new pane if removed pane was selected 
		    if (pane.selected && panes.length > 0) {
		      $scope.select(panes[index < panes.length ? index : index-1]);
		    }
		  };
		}])
		.directive('tabs', function() {
		  return {
		    restrict: 'EA',
		    transclude: true,
		    scope: {},
		    controller: 'TabsController',
		    templateUrl: 'template/tabs/tabs.html',
		    replace: true
		  };
		})

		.constant('paneConfig', {
		  srcErrorMessage: 'Couldn\'t load this tab!',
		})

		.directive('pane', ['$parse', '$http', '$compile', 'paneConfig', function($parse, $http, $compile, paneConfig) {
		  return {
		    require: '^tabs',
		    restrict: 'EA',
		    transclude: true,
		    scope:{
		      heading:'@',
		      src:'@',
		      srcLoaded: '&',
		      srcError: '&'
		    },
		    link: function(scope, element, attrs, tabsCtrl) {
		      var getSelected, setSelected;
		      scope.selected = false;
		      if (attrs.active) {
		        getSelected = $parse(attrs.active);
		        setSelected = getSelected.assign;
		        scope.$watch(
		          function watchSelected() {return getSelected(scope.$parent);},
		          function updateSelected(value) {scope.selected = value;}
		        );
		        scope.selected = getSelected ? getSelected(scope.$parent) : false;
		      }
		      scope.$watch('selected', function(selected) {
		        if(selected) {
		          tabsCtrl.select(scope);
		        }
		        if(setSelected) {
		          setSelected(scope.$parent, selected);
		        }
		      });

		      // Content via Ajax
		      scope.$watch('src', function(url) {
		          if (angular.isDefined(url) && url !== '') {
		            $http.get(url).success(function(response) {
		              element.html(response);
		              $compile(element.contents())(scope.$parent);
		              scope.srcLoaded();
		            }).error(function(response) {
		              if ('srcError' in attrs) {
		                scope.srcError({response: response});
		              } else {
		                var srcErrorMessage = angular.isDefined(attrs.srcErrorMessage) ? attrs.srcErrorMessage : paneConfig.srcErrorMessage;
		                element.html(srcErrorMessage);
		              }
		            });
		          }
		      });

		      tabsCtrl.addPane(scope);
		      scope.$on('$destroy', function() {
		        tabsCtrl.removePane(scope);
		      });
		    },
		    templateUrl: 'template/tabs/pane.html',
		    replace: true
		  };
		}]);
	
	

	commonControllers.controller('LoginController', ['$scope', '$rootScope', '$location', 'localStorageService','WDAuthentication','SysMgmtData', 'toastr','ModalService',
		function($scope, $rootScope, $location, localStorageService, WDAuthentication,SysMgmtData, toastr,ModalService) {

			$scope.login = function() {
				let body = JSON.stringify(
				        { "username": $scope.username, "password": $scope.password }
				    )
				WDAuthentication.processLogin(WebDaptiveAppConfig.authenticationURL, body, function(authenticationResult) {
					
					var authToken = authenticationResult.token;
					if (authToken !== undefined){
						$rootScope.authToken = authToken;
						localStorageService.set('authToken', authToken);
						
						//var currentUser = {user: authenticationResult.name, roles: authenticationResult.roles};
						//$rootScope.user = currentUser;
						//let surl = "https://quadra-test.herokuapp.com/";
						let sUrl = "http://localhost:8080/";
						let bodys = JSON.stringify(
						        { "username": $scope.username, "password": $scope.password }
						    )
						SysMgmtData.processPostPageData(sUrl + "user/findUserByEmail", { "username": $scope.username, "password": $scope.password } , function(res){
							//debugger
							var currentUser = res;
								$rootScope.user = currentUser;
								$rootScope.main.name = $scope.username;
								localStorageService.set('currentUser', $rootScope.user);
								var tempRole = "";
								var bAdmin = false;
								var prop = {};
								for (var x = 0; x < currentUser.authorities.length; x++) {
									prop = currentUser.authorities[x]
									tempRole += prop.name + "";
									if(prop.name === 'ROLE_USER')
										bAdmin = true;
								}							
								$rootScope.displayRoles = tempRole;
								localStorageService.set('displayRoles', $rootScope.displayRoles);	
								
								if ($rootScope.callingPath !== undefined){
									if ($rootScope.callingPath === '/pages/signin'){
										$rootScope.callingPath = "/principal";

									}
									$location.path($rootScope.callingPath);
								}
								else{
									$location.path( "/dashboard" );
								}
							
												
								SysMgmtData.processPostPageData("entidade/api/findEntidadeById",32 /* +currentUser.empresaId */, function(entidade){
										//if(res.operationSuccess == true)
										//{
									debugger
											localStorageService.set('empresa', entidade);
											localStorage.setItem("empresa", JSON.stringify(entidade));
//											qat.model.select.util("entidade/api/doisValores/fetchPage", true, new qat.model.doisValoresInquiryRequest(null, 100 / 20, true, JSON.parse(localStorage.getItem("empresa")).id),
//											function(ress){
//												localStorageService.set('doisValores', ress.doisValoresList);
//											});



											if(entidade.primeiroAcesso == 0)
											{
													if(entidade.tipo == 1)
													{
														dialogFactory.dialog('views/util/dialog/dPrimeiraAdvocacia.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}else if(entidade.tipo == 2){
														dialogFactory.dialog('views/cadastros/dialog/dPrimeiraClinica.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}
													else if(entidade.tipo == 3){
														dialogFactory.dialog('views/cadastros/dialog/dPrimeiraCondominio.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}
													else if(entidade.tipo == 4){
														dialogFactory.dialog('views/cadastros/dialog/dPrimeiraContador.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}
													else if(entidade.tipo == 5){
														dialogFactory.dialog('views/cadastros/dialog/dPrimeiraEmpresa.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}
													else if(entidade.tipo == 6){
													//	dialogFactory.dialog('views/util/dialog/dPrimeiraEmpresa.html', "ClienteInsertController", validationFactory.cliente, function(){});
													 var _close = function(){console .log('close')};
														 ModalService.showModal({
															templateUrl: 'views/util/dialog/dPrimeiraEmpresa.html',
															controller: "NewEmpresaUpdateController"
															}).then(function(modal) {
																	modal.element.modal();
																	modal.close.then(function(result) {
																			if ((_close != null) && (_close != undefined))
																					_close();
																	});
															});
													}
													else
													{
														dialogFactory.dialog('views/cadastros/dialog/dPrimeiraEmpresa.html', "ClienteInsertController", validationFactory.cliente, function(){});
													}
												}
										//}
							          });	
						});

						


//						SysMgmtData.processPostPageData("main/api/request",{
//		                    url: "entidade/api/transaction/fetch",
//							token : authToken,
//							request: new qat.model.transactionInquiryRequest(new  qat.model.transaction(currentUser.user,authToken), 100/20, true,currentUser.user,null,null)}, function(res){
//								if(res.operationSuccess == true)
//								{
//									localStorageService.set('transaction', res.transactionList[0].id);
//									localStorage.setItem("transaction", JSON.stringify(res.transactionList[0]));
//								}
//					          });
//
//
//						$rootScope.main.name = authenticationResult.name;
//						localStorageService.set('currentUser', $rootScope.user);
//						var tempRole = "";
//						for (var prop in authenticationResult.roles) {
//							tempRole += prop + " ";
//						}
//						$rootScope.displayRoles = tempRole;
//						localStorageService.set('displayRoles', $rootScope.displayRoles);

						
					}
					else{
							$location.path( "/pages/signin" );
					}
				});
			};
    }]);

})();
