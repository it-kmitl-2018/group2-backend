package th.ac.kmitl.soa.group2.controllers;

import io.vavr.control.Option;
import lombok.val;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmitl.soa.group2.messages.Success;
import th.ac.kmitl.soa.group2.definitions.DocumentType;
import th.ac.kmitl.soa.group2.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group2.models.HeaderModel;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;

import javax.validation.Valid;
import java.sql.Timestamp;

import static th.ac.kmitl.soa.group2.utils.binders.Xml.serialize;

@RestController
public class TaxInvoiceController {

    @PostMapping(value = "/tax-invoice/generate")
    public Success<String> generate(@Valid @RequestBody TaxInvoiceForm taxInvoiceForm) {
        // TODO: Required refactoring
        val headerForm = taxInvoiceForm.header;
        val taxInvoice = new TaxInvoiceModel(
            new HeaderModel(
                headerForm.id,
                DocumentType.from(headerForm.typeCode).get().typeCode,
                headerForm.typeCode,
                headerForm.issuedAt,
                Option.some("purpose"),
                headerForm.purposeCode,
                headerForm.globalId,
                new Timestamp(System.currentTimeMillis())
            )
        );

        return serialize(taxInvoice).map(Success::new).get();
    }

}
