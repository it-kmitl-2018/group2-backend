package th.ac.kmitl.soa.group2.forms;

import lombok.NoArgsConstructor;
import th.ac.kmitl.soa.group2.models.TaxInvoiceModel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
public class TaxInvoiceForm implements BaseForm<TaxInvoiceModel> {

    @Valid @NotNull
    public HeaderForm header;

    @Override
    public TaxInvoiceModel toModel() {
        return new TaxInvoiceModel(
            header.toModel()
        );
    }

}
