import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_rtx_cmpu_apldo_ldg //--영수증전산청약서원장 Primary Key
public class AudRtxCmpuApldoLdgPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "rtx_kndcd")
    private String rtxKndcd; //--영수증종류코드

    @Column(name = "rtx_ss_yr")
    private String rtxSsYr; //--영수증발행년도

    @Column(name = "rtx_bk_sno")
    private String rtxBkSno; //--영수증책일련번호

}

