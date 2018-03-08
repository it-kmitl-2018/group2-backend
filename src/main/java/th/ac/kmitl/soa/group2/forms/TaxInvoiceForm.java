package th.ac.kmitl.soa.group2.forms;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class TaxInvoiceForm {

    @Valid @NotNull
    public HeaderForm header;

}
