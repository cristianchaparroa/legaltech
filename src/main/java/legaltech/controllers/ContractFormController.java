
package legaltech.controllers;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import legaltech.entities.Agreement;


@RestController
public class ContractFormController {

   @RequestMapping(value="api/form/agreement", method = RequestMethod.GET)
   public Agreement getAgreementComponent() {
     return new Agreement();
   }
}
