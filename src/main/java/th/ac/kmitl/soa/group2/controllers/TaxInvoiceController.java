package th.ac.kmitl.soa.group2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.soa.group2.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group2.messages.SuccessMessage;

import javax.validation.Valid;

import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;

@RestController
public class TaxInvoiceController {

    @PostMapping(value = "/tax-invoice/generate")
    public SuccessMessage<String> generate(@Valid @RequestBody TaxInvoiceForm taxInvoiceForm) {
        return serialize(taxInvoiceForm.toModel()).map(SuccessMessage::new).get();
    }

}
