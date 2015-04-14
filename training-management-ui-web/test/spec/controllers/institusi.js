'use strict';

describe('Controller: InstitusiCtrl', function () {

  // load the controller's module
  beforeEach(module('yoApp'));

  var InstitusiCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    InstitusiCtrl = $controller('InstitusiCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
