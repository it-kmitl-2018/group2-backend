package th.ac.kmitl.soa.group2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.soa.group2.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group2.messages.SuccessMessage;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;

import javax.validation.Valid;

@RestController
public class TaxInvoiceController {

    @PostMapping(value = "/tax-invoice/generate")
    public SuccessMessage<TaxInvoiceModel> generate(@Valid @RequestBody TaxInvoiceForm taxInvoiceForm) {
        return new SuccessMessage<>(taxInvoiceForm.toModel());
    }

}
