package th.ac.kmitl.soa.group2.controllers;

import io.vavr.Function1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.soa.group2.controllers.responses.Success;
import th.ac.kmitl.soa.group2.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group2.models.HeaderModel;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;
import th.ac.kmitl.soa.group2.utils.XmlFormatter;

import javax.validation.Valid;
import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.utils.XmlFormatter.serialize;

@RestController
public class TaxInvoiceController {

    @PostMapping(value = "/tax-invoice/generate")
    public Success<String> generate(@Valid @RequestBody TaxInvoiceForm taxInvoiceForm) {
        TaxInvoiceModel taxInvoice = new TaxInvoiceModel(
            new HeaderModel(
                taxInvoiceForm.header.id,
                "name from typeCode",
                taxInvoiceForm.header.typeCode,
                taxInvoiceForm.header.issuedAt,
                "purpose from purposeCode",
                taxInvoiceForm.header.purposeCode,
                taxInvoiceForm.header.globalId,
                new Timestamp(System.currentTimeMillis())
            )
        );

        return serialize(taxInvoice).map(Success::new).get();
    }

}
