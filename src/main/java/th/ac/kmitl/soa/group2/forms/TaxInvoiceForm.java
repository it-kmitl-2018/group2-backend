package th.ac.kmitl.soa.group2.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TaxInvoiceForm {

    @Valid @NotNull
    public HeaderForm header;

}
