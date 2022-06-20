import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_adt_knwl_adm //--감사지식관리 Primary Key
public class AudAdtKnwlAdmPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "adt_knwl_bsns_flgcd")
    private String adtKnwlBsnsFlgcd; //--감사지식업무구분코드

    @Column(name = "adt_knwl_mdccd")
    private String adtKnwlMdccd; //--감사지식중분류코드

    @Column(name = "seqno")
    private BigDecimal seqno; //--순번

}

