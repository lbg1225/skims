import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_fn_clmam //--금융사고관리 Primary Key
public class AudFnClmamPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "fn_acd_yymm")
    private String fnAcdYymm; //--금융사건년월

    @Column(name = "fn_acd_seqno")
    private BigDecimal fnAcdSeqno; //--금융사건순번

}

