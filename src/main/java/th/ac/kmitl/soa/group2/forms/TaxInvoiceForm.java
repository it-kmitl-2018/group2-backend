package th.ac.kmitl.soa.group2.forms;

import th.ac.kmitl.soa.group2.models.ExchangedDocumentContextModel;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class TaxInvoiceForm implements BaseForm<TaxInvoiceModel> {

    @Valid @NotNull
    public HeaderForm header;

    @Override
    public TaxInvoiceModel toModel() {
        return new TaxInvoiceModel(
            ExchangedDocumentContextModel.withDefault(),
            header.toModel()
        );
    }

}
