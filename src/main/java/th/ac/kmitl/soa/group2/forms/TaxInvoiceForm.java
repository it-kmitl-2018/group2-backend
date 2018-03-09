package th.ac.kmitl.soa.group2.forms;

import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
public class TaxInvoiceForm {

    @Valid @NotNull
    public HeaderForm header;

}
