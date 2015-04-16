'use strict';

describe('Controller: PesertaCtrl', function () {

  // load the controller's module
  beforeEach(module('yoApp'));

  var PesertaCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PesertaCtrl = $controller('PesertaCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
