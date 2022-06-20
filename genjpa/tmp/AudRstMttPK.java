import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_rst_mtt //--제재사항 Primary Key
public class AudRstMttPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "adt_yr")
    private String adtYr; //--감사년도

    @Column(name = "adt_flgcd")
    private String adtFlgcd; //--감사구분코드

    @Column(name = "adtno")
    private String adtno; //--감사번호

    @Column(name = "adt_indi_seqno")
    private BigDecimal adtIndiSeqno; //--감사지적순번

    @Column(name = "adt_seqno")
    private BigDecimal adtSeqno; //--감사순번

}

