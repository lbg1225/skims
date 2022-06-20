import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_cpc_sys //--CPC시스템 Primary Key
public class AudCpcSysPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "adt_yymm")
    private String adtYymm; //--감사년월

    @Column(name = "adt_seqno")
    private BigDecimal adtSeqno; //--감사순번

    @Column(name = "adt_bj_orgcd")
    private String adtBjOrgcd; //--감사대상기관코드

}

