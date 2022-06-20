import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_rtx_dm //--영수증청구 Primary Key
public class AudRtxDmPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "rtx_dm_org_flgcd")
    private String rtxDmOrgFlgcd; //--영수증청구기관구분코드

    @Column(name = "rtx_dm_orgcd")
    private String rtxDmOrgcd; //--영수증청구기관코드

    @Column(name = "rtx_mfg_org_flgcd")
    private String rtxMfgOrgFlgcd; //--영수증출고기관구분코드

    @Column(name = "rtx_mfg_orgcd")
    private String rtxMfgOrgcd; //--영수증출고기관코드

    @Column(name = "rtx_kndcd")
    private String rtxKndcd; //--영수증종류코드

    @Column(name = "rtx_dmdt")
    private Date rtxDmdt; //--영수증청구일자

    @Column(name = "rtx_dm_seqno")
    private BigDecimal rtxDmSeqno; //--영수증청구순번

}

