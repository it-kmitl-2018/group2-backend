package th.ac.kmitl.soa.group2.forms;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Builder
@EqualsAndHashCode
public class TaxInvoiceForm {

    @Valid @NotNull
    public HeaderForm header;

}
