'use strict';

describe('Controller: KelasCtrl', function () {

  // load the controller's module
  beforeEach(module('yoApp'));

  var KelasCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    KelasCtrl = $controller('KelasCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
