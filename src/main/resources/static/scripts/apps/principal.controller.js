(function () {
    angular.module('wdApp.apps.principal', [])
        .controller('PrincipalController', principalController);

    function principalController($location, $log, $scope, $compile, $rootScope, SysMgmtData, formlyVersion, localStorageService) {

        var vm = this;
        vm.show = true;
        vm.doc = "";
        vm.docTipo = "";
        $scope.onSubmit = onSubmit;
        $scope.resetAllForms = invokeOnAllFormOptions.bind(null, 'resetModel');
        //debugger
        // variable assignment
        vm.author = { // optionally fill in your info below :-)
            name: 'Kent C. Dodds',
            url: 'https://twitter.com/kentcdodds'
        };
        vm.exampleTitle = 'Bootstrap Tabs'; // add this
        vm.env = {
            angularVersion: angular.version.full,
            formlyVersion: formlyVersion
        };

        vm.model = {};

        function tipoField(oField) {
            let oCampo = {
                key: oField.nome,
                templateOptions: {
                    label: oField.label,
                    placeholder: oField.label,
                    options: []
                }
            }
            if (oField.tipo == 0) {
                oCampo.type = 'input';
            } else if (oField.tipo == 1) {
                oCampo.type = 'input';
            } else if (oField.tipo == 2) {
                oCampo.type = 'select';
                for (let x = 0; x < oField.dominio.length; x++) {
                    oCampo.templateOptions.options.push({ name: oField.dominio[x].nome, value: oField.dominio[x].valor });
                }
            } else if (oField.tipo == 3) {

            } else if (oField.tipo == 4) {

            }
            return oCampo;
        }

        // Field Tipo
        // 0 = Integer
        // 1 = String
        // 2 = Mult Select
        // 3 = Text Area
        // 4 = Buscar

        let oPage = localStorageService.get("paginaId");
        vm.fields = [];
        vm.tabs = [];
        if (oPage) {
            for (let x = 0; x < oPage.tabs.length; x++) {
                let oTab = oPage.tabs[x];
                if (oTab.order == 0) {
                    for (let y = 0; y < oTab.fields.length; y++) {
                        vm.fields.push(tipoField(oTab.fields[y])
                            //     {
                            //     key: oTab.fields[y].nome,
                            //     type: 'input',
                            //     templateOptions: {
                            //         label: oTab.fields[y].label,
                            //         placeholder: oTab.fields[y].label
                            //     }
                            // }
                        );
                    }
                } else {
                    oFields = [];
                    for (let y = 0; y < oTab.fields.length; y++) {
                        oFields.push(tipoField(oTab.fields[y])
                            //     {
                            //     key: oTab.fields[y].nome,
                            //     type: 'input',
                            //     templateOptions: {
                            //         label: oTab.fields[y].label,
                            //         placeholder: oTab.fields[y].label
                            //     }
                            // }
                        );
                    }
                    vm.tabs.push({
                        title: oTab.label,
                        active: true,
                        form: {
                            options: {},
                            model: vm.model,
                            fields: oFields
                        }
                    });
                }

            }
        }

        //        vm.fields = [
        //            {
        //              key: 'text',
        //              type: 'input',
        //              templateOptions: {
        //                label: 'Text',
        //                placeholder: 'Formly is terrific!'
        //              }
        //            },
        //            {
        //              key: 'nested.story',
        //              type: 'textarea',
        //              templateOptions: {
        //                label: 'Some sweet story',
        //                placeholder: 'It allows you to build and maintain your forms with the ease of JavaScript :-)',
        //                description: ''
        //              },
        //              expressionProperties: {
        //                'templateOptions.focus': 'formState.awesomeIsForced',
        //                'templateOptions.description': function(viewValue, modelValue, scope) {
        //                  if (scope.formState.awesomeIsForced) {
        //                    return 'And look! This field magically got focus!';
        //                  }
        //                }
        //              }
        //            },
        //            {
        //              key: 'awesome',
        //              type: 'checkbox',
        //              templateOptions: { label: '' },
        //              expressionProperties: {
        //                'templateOptions.disabled': 'formState.awesomeIsForced',
        //                'templateOptions.label': function(viewValue, modelValue, scope) {
        //                  if (scope.formState.awesomeIsForced) {
        //                    return 'Too bad, formly is really awesome...';
        //                  } else {
        //                    return 'Is formly totally awesome? (uncheck this and see what happens)';
        //                  }
        //                }
        //              }
        //            },
        //            {
        //              key: 'whyNot',
        //              type: 'textarea',
        //              expressionProperties: {
        //                'templateOptions.placeholder': function(viewValue, modelValue, scope) {
        //                  if (scope.formState.awesomeIsForced) {
        //                    return 'Too bad... It really is awesome! Wasn\'t that cool?';
        //                  } else {
        //                    return 'Type in here... I dare you';
        //                  }
        //                },
        //                'templateOptions.disabled': 'formState.awesomeIsForced'
        //              },
        //              hideExpression: 'model.awesome',
        //              templateOptions: {
        //                label: 'Why Not?',
        //                placeholder: 'Type in here... I dare you'
        //              },
        //              watcher: {
        //                listener: function(field, newValue, oldValue, formScope, stopWatching) {
        //                  if (newValue) {
        //                    stopWatching();
        //                    formScope.model.awesome = true;
        //                    formScope.model.whyNot = undefined;
        //                    field.hideExpression = null;
        //                    formScope.options.formState.awesomeIsForced = true;
        //                  }
        //                }
        //              }
        //            },
        //            {
        //              key: 'custom',
        //              type: 'custom',
        //              templateOptions: {
        //                label: 'Custom inlined',
        //              }
        //            },
        //            {
        //              key: 'exampleDirective',
        //              template: '<div example-directive></div>',
        //              templateOptions: {
        //                label: 'Example Directive',
        //              }
        //            }
        //          ];
        //
        //        vm.tabs = [
        //          {
        //            title: 'Tab 1',
        //            active: true,
        //            form: {
        //              options: {},
        //              model: vm.model,
        //              fields: [
        //                {
        //                  key: 'email',
        //                  type: 'input',
        //                  templateOptions: {
        //                    label: 'Username',
        //                    type: 'email',
        //                    placeholder: 'Email address',
        //                    required: true
        //                  }
        //                }
        //              ]
        //            }
        //          },
        //          {
        //            title: 'Tab 2',
        //            form: {
        //              options: {},
        //              model: vm.model,
        //              fields: [
        //                {
        //                  key: 'firstName',
        //                  type: 'input',
        //                  templateOptions: {
        //                    label: 'First Name',
        //                    required: true
        //                  }
        //                },
        //                {
        //                  key: 'lastName',
        //                  type: 'input',
        //                  templateOptions: {
        //                    label: 'Last Name',
        //                    required: true
        //                  }
        //                }
        //              ] 
        //            }
        //          }
        //        ];

        vm.originalTabs = angular.copy(vm.form);

        // function definition
        
        function onSubmit() {
        	alert(JSON.stringify(vm.model), null, 2);
        	debugger
            invokeOnAllFormOptions('updateInitialValue');
        	for (){
        		
        	}
        	request = new qat.model.CrudRequest();
            SysMgmtData.processPostPageData("/crud/insert", request, {

            }, function (res) {
                if (res) {
                    vm.site = new qat.model.Site(res);
                    console.log(res.empresa)
                    if (res.empresa) {
                        localStorage.setItem("empresa", JSON.stringify(res.empresa));
                    }
                }
            });
            alert(JSON.stringify(vm.model), null, 2);
        }


        function invokeOnAllFormOptions(fn) {
            angular.forEach(vm.tabs, function (tab) {
                if (tab.form.options && tab.form.options[fn]) {
                    tab.form.options[fn]();
                }
            });
        }



        var $window;
        $window = $(window);

        $scope.pespectiva = "G";

        $scope.pespectivaToggle = function (sPesp) {
            //	  debugger
            if (sPesp) {
                $scope.pespectiva = sPesp;
            } else {
                $scope.pespectiva = "F";;
            }
        };

        angular.element(document).ready(function () {
            $(".grid-view").off();
            $(".grid-view").on("click", function () {
                //  debugger
                console.log($(this).text());
            });
        });

        $scope.empresa = {
            usuarios: []
        };
        $scope.senha2 = "";
        $scope.empresa.usuarios.push({
            parentId: 0
        });
        vm.shows = function (s, v) {
            if (v)
                vm.show = s;
        }
        vm.functionTest = function (s) {
            return s % 3;
        }
        vm.generatePDF = function () {

            kendo.drawing.drawDOM($("#contrato")).then(function (group) {
                kendo.drawing.pdf.saveAs(group, "Converted PDF.pdf");
            });
        }
        SysMgmtData.processPostPageData("site/api/site/fetchPage", {

        }, function (res) {
            if (res) {
                vm.site = new qat.model.Site(res);
                console.log(res.empresa)
                if (res.empresa) {
                    localStorage.setItem("empresa", JSON.stringify(res.empresa));
                    // var docs = res.empresa.documentos

                    //                    for (var x = 0; x < docs.length; x++) {
                    //                        if (docs[x].documentoType == "CPF") {
                    //                            vm.doc = docs[x].numero;
                    //                            vm.docTipo = "CPF"
                    //                        } else if (docs[x].documentoType == "CNPJ") {
                    //
                    //                            vm.doc = docs[x].numero;
                    //                            vm.docTipo = "CNPJ"
                    //                        }
                    //                    }
                }
            }
        });

        $scope.searchButtonText = "Search";
        $scope.loading = false;
        $scope.test = "false";
        $scope.search = function () {

            // Do your searching here
        }
        $scope.searchButtonText = "COMEÇAR TESTE GRATUITO";

        var fnCallBack = function (res) {
            $scope.test = "false";
            $scope.loading = "false"
            $scope.searchButtonText = "COMEÇAR TESTE GRATUITO";
        }

        $scope.functionTest = function () {
            bReturn = false;
            if ($scope.empresa.usuarios[0].senha == $scope.empresa.usuarios[0].senha2) {
                bReturn = true;
            }
            $scope.userForm.$valid = bReturn;
            return bReturn;
        }

        $scope.submitForm = function (isValid) {
            if (isValid) {
                $scope.test = "true";
                $scope.loading = "true"
                $scope.searchButtonText = "COMEÇAR TESTE GRATUITO";

                $log.info("Insert empresa ", "Teste");
                $scope.empresa.entidadeEnumValue = 1;
                $scope.empresa.documentos[{ documentoType: "", numero: "" }];
                if ($scope.empresa.documentos[0].numero.length > 12) {
                    $scope.empresa.documentos[0].documentoType = "CNPJ"
                    $scope.empresa.tipoPessoa = 2
                } else {
                    $scope.empresa.documentos[0].documentoType = "CPF"
                    $scope.empresa.nome = $scope.empresa.razao;
                    $scope.empresa.tipoPessoa = 1

                }
                //empresa, enderecos, emails, telefones, cnaes, action, fnCallBack
                //  fEmpresa.fnMontaObjeto3($scope.empresa, $scope.enderecos, $scope.emails, $scope.telefones, $scope.cnaes, "INSERT", fnCallBack);
            }
        };




    }
})();
(function () {
    angular.module('wdApp.apps.principal.insert', [])
        .controller('PrincipalInsertController', function ($rootScope, $scope, SysMgmtData) {
            var vm = this;

            $scope.forms = [{
                nome: 'form1',
                telefone: {}
            }];
            $scope.count = 0;

            $scope.empresa = {
                telefones: [],
                enderecos: [{
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),
                }],
                documentos: [{
                    documentoTypeEnumValue: 1,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                },
                {
                    documentoTypeEnumValue: 2,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                },
                {
                    documentoTypeEnumValue: 3,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                },
                {
                    documentoTypeEnumValue: 4,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                },
                {
                    documentoTypeEnumValue: 5,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                },
                {
                    documentoTypeEnumValue: 6,
                    numero: 0,
                    tableEnumValue: 1,
                    modelAction: "INSERT",
                    createUser: "System",
                    createDateUTC: (new Date()).getTime(),
                    modifyUser: "System",
                    modifyDateUTC: (new Date()).getTime(),

                }
                ]
            };
            $scope.enderecos = [];


            $scope.today = function () {
                return $scope.dt = new Date();
            };
            $scope.today();
            $scope.clear = function () {
                return $scope.dt = null;
            };
            $scope.open = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();
                return $scope.opened = true;
            };
            $scope.dateOptions = {
                'year-format': "'yy'",
                'starting-day': 0
            };
            $scope.formats = ['MMMM-dd-yyyy', 'MM/dd/yyyy', 'yyyy/MM/dd'];
            $scope.format = $scope.formats[1];
            var fnCallBack = function (oResponse) {

                console.log(oResponse)
            }
            $scope.saveEmpresa = function () {


                //var oObject = fModels.amont(qat.model.Empresa($scope.empresa, "INSERT", $rootScope.user.user), "INSERT");

                SysMgmtData.processPostPageData("main/api/anonimo", {
                    url: "entidade/api/empresa" + WebDaptiveAppConfig.create_url,
                    request: new qat.model.reqEmpr(oObject, true, true)
                }, function (res) {
                    console.log(res)

                    if (res.operationSuccess == true) {

                    }

                });
            };
        });
})();
(function () {
    angular.module('wdApp.apps.principal.update', [])
        .controller('PrincipalUpdateController', function ($rootScope, $scope, SysMgmtData, fPessoa) {
            var vm = this;
            $scope.principal = {};
            $scope.principal = $rootScope.principal;
            console.log($rootScope.principal)
            $scope.savePrincipal = function () {
                fPessoa.fnMontaObjeto($scope.principal, null, 'UPDATE', "site/api/principal/update/", fnCallBack);
            }
        });
})();
(function () {
    angular.module('wdApp.apps.principal.delete', [])
        .controller('PrincipalDeleteController', function ($rootScope, $scope, SysMgmtData, fPessoa) {
            var vm = this;
            $scope.principal = {};
            $scope.principal = $rootScope.principal;
            console.log($rootScope.principal)
            $scope.savePrincipal = function () {
                fPessoa.fnDelete($scope.principal, "site/api/principal/update/", function () {
                    console.log('ddda   aqui')
                });
            }
        });
})();
(function () {
    angular.module('wdApp.apps.principal.view', [])
        .controller('PrincipalViewController', function ($rootScope, $scope, SysMgmtData, fPessoa) {
            var vm = this;
            $scope.principal = {};
            $scope.principal = $rootScope.principal;
            console.log($rootScope.principal)
            $scope.savePrincipal = function () {
                fPessoa.fnOpenView($scope.principal, "site/api/principal/update/", function () {
                    console.log('aqui')
                });
            }
        });
})();