package th.ac.kmitl.soa.group2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.soa.group2.controllers.responses.Success;
import th.ac.kmitl.soa.group2.forms.HeaderForm;
import th.ac.kmitl.soa.group2.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group2.models.DocumentType;
import th.ac.kmitl.soa.group2.models.HeaderModel;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;

import javax.validation.Valid;
import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

@RestController
public class TaxInvoiceController {

    @PostMapping(value = "/tax-invoice/generate")
    public Success<String> generate(@Valid @RequestBody TaxInvoiceForm taxInvoiceForm) {
        // TODO: Require refactoring
        HeaderForm headerForm = taxInvoiceForm.header;
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel(
            new HeaderModel(
                headerForm.id,
                DocumentType.from(headerForm.typeCode).get().typeCode,
                headerForm.typeCode,
                headerForm.issuedAt,
                // TODO: create purpose code mapper
                "can be created from purpose code",
                headerForm.purposeCode,
                headerForm.globalId,
                new Timestamp(System.currentTimeMillis())
            )
        );

        return serialize(taxInvoice).map(Success::new).get();
    }

}
