import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PostPersist;
import javax.persistence.PreUpdate;
import javax.persistence.PostUpdate;
import javax.persistence.PreRemove;
import javax.persistence.PostRemove;
import javax.validation.constraints.Size;
// import org.springframework.beans.BeanUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_rtx_nrcvy_sts") //--영수증미회수통계
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
public class AudRtxNrcvySts {
    @Id //  Long
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid", nullable = false)
    private Long aid; //--aid

    @Column(name = "adm_orgcd", nullable = false)
    private String admOrgcd; //--관리기관코드

    @Column(name = "dh_br_orgcd", nullable = false)
    private String dhBrOrgcd; //--취급지점기관코드

    @Column(name = "dhgnc_orgcd", nullable = false)
    private String dhgncOrgcd; //--취급소기관코드

    @Column(name = "rgtdt", nullable = true)
    private Date rgtdt; //--등록일자

    @Column(name = "mlamt_belo_gn_ltrm_rnd_ct", nullable = true)
    private BigDecimal mlamtBeloGnLtrmRndCt; //--100만원이하일반장기경과건수

    @Column(name = "mlamt_belo_gn_ltrm_nelp_ct", nullable = true)
    private BigDecimal mlamtBeloGnLtrmNelpCt; //--100만원이하일반장기미경과건수

    @Column(name = "ml10a_belo_gn_ltrm_rnd_ct", nullable = true)
    private BigDecimal ml10aBeloGnLtrmRndCt; //--1000만원이하일반장기경과건수

    @Column(name = "ml10a_belo_gn_ltrm_nelp_ct", nullable = true)
    private BigDecimal ml10aBeloGnLtrmNelpCt; //--1000만원이하일반장기미경과건수

    @Column(name = "ml10a_abov_gn_ltrm_rnd_ct", nullable = true)
    private BigDecimal ml10aAbovGnLtrmRndCt; //--1000만원이상일반장기경과건수

    @Column(name = "ml10a_abov_gn_ltrm_nelp_ct", nullable = true)
    private BigDecimal ml10aAbovGnLtrmNelpCt; //--1000만원이상일반장기미경과건수

    @Column(name = "cr_fc_idc_rnd_ct", nullable = true)
    private BigDecimal crFcIdcRndCt; //--자동차외화표시경과건수

    @Column(name = "cr_fc_idc_nelp_ct", nullable = true)
    private BigDecimal crFcIdcNelpCt; //--자동차외화표시미경과건수

    @Column(name = "cr_spcf_rnd_ct", nullable = true)
    private BigDecimal crSpcfRndCt; //--자동차특정경과건수

    @Column(name = "cr_spcf_nelp_ct", nullable = true)
    private BigDecimal crSpcfNelpCt; //--자동차특정미경과건수

    @Column(name = "cr_inr_rnd_ct", nullable = true)
    private BigDecimal crInrRndCt; //--자동차통합경과건수

    @Column(name = "cr_inr_nelp_ct", nullable = true)
    private BigDecimal crInrNelpCt; //--자동차통합미경과건수

    @Column(name = "bll_nt_rnd_ct", nullable = true)
    private BigDecimal bllNtRndCt; //--어음이자경과건수

    @Column(name = "bll_nt_nelp_ct", nullable = true)
    private BigDecimal bllNtNelpCt; //--어음이자미경과건수

    @Column(name = "gn_apldo_rnd_ct", nullable = true)
    private BigDecimal gnApldoRndCt; //--일반청약서경과건수

    @Column(name = "gn_apldo_nelp_ct", nullable = true)
    private BigDecimal gnApldoNelpCt; //--일반청약서미경과건수

    @Column(name = "ltrm_rvi_nds_apldo_rnd_ct", nullable = true)
    private BigDecimal ltrmRviNdsApldoRndCt; //--장기부활배서청약서경과건수

    @Column(name = "ltrm_rvi_nds_apldo_nelp_ct", nullable = true)
    private BigDecimal ltrmRviNdsApldoNelpCt; //--장기부활배서청약서미경과건수

    @Column(name = "cr_spcf_apldo_rnd_ct", nullable = true)
    private BigDecimal crSpcfApldoRndCt; //--자동차특정청약서경과건수

    @Column(name = "cr_spcf_apldo_nelp_ct", nullable = true)
    private BigDecimal crSpcfApldoNelpCt; //--자동차특정청약서미경과건수

    @Column(name = "cr_inr_apldo_rnd_ct", nullable = true)
    private BigDecimal crInrApldoRndCt; //--자동차통합청약서경과건수

    @Column(name = "cr_inr_apldo_nelp_ct", nullable = true)
    private BigDecimal crInrApldoNelpCt; //--자동차통합청약서미경과건수

    @Column(name = "cr_pyp_nds_apldo_rnd_ct", nullable = true)
    private BigDecimal crPypNdsApldoRndCt; //--자동차분납배서청약서경과건수

    @Column(name = "cr_pyp_nds_apldo_nelp_ct", nullable = true)
    private BigDecimal crPypNdsApldoNelpCt; //--자동차분납배서청약서미경과건수

    @Column(name = "cr_hwmc_apldo_rnd_ct", nullable = true)
    private BigDecimal crHwmcApldoRndCt; //--자동차하우머치청약서경과건수

    @Column(name = "cr_hwmc_apldo_nelp_ct", nullable = true)
    private BigDecimal crHwmcApldoNelpCt; //--자동차하우머치청약서미경과건수

    @Column(name = "ltrm_cmpu_rtx_rnd_ct", nullable = true)
    private BigDecimal ltrmCmpuRtxRndCt; //--장기전산영수증경과건수

    @Column(name = "ltrm_cmpu_rtx_nelp_ct", nullable = true)
    private BigDecimal ltrmCmpuRtxNelpCt; //--장기전산영수증미경과건수

    @Column(name = "cr_cmpu_rtx_rnd_ct", nullable = true)
    private BigDecimal crCmpuRtxRndCt; //--자동차전산영수증경과건수

    @Column(name = "cr_cmpu_rtx_nelp_ct", nullable = true)
    private BigDecimal crCmpuRtxNelpCt; //--자동차전산영수증미경과건수

    @Column(name = "an_cmpu_rtx_rnd_ct", nullable = true)
    private BigDecimal anCmpuRtxRndCt; //--연금전산영수증경과건수

    @Column(name = "an_cmpu_rtx_nelp_ct", nullable = true)
    private BigDecimal anCmpuRtxNelpCt; //--연금전산영수증미경과건수

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxNrcvySts(String admOrgcd, String dhBrOrgcd, String dhgncOrgcd, Date rgtdt, BigDecimal mlamtBeloGnLtrmRndCt, BigDecimal mlamtBeloGnLtrmNelpCt, BigDecimal ml10aBeloGnLtrmRndCt, BigDecimal ml10aBeloGnLtrmNelpCt, BigDecimal ml10aAbovGnLtrmRndCt, BigDecimal ml10aAbovGnLtrmNelpCt, BigDecimal crFcIdcRndCt, BigDecimal crFcIdcNelpCt, BigDecimal crSpcfRndCt, BigDecimal crSpcfNelpCt, BigDecimal crInrRndCt, BigDecimal crInrNelpCt, BigDecimal bllNtRndCt, BigDecimal bllNtNelpCt, BigDecimal gnApldoRndCt, BigDecimal gnApldoNelpCt, BigDecimal ltrmRviNdsApldoRndCt, BigDecimal ltrmRviNdsApldoNelpCt, BigDecimal crSpcfApldoRndCt, BigDecimal crSpcfApldoNelpCt, BigDecimal crInrApldoRndCt, BigDecimal crInrApldoNelpCt, BigDecimal crPypNdsApldoRndCt, BigDecimal crPypNdsApldoNelpCt, BigDecimal crHwmcApldoRndCt, BigDecimal crHwmcApldoNelpCt, BigDecimal ltrmCmpuRtxRndCt, BigDecimal ltrmCmpuRtxNelpCt, BigDecimal crCmpuRtxRndCt, BigDecimal crCmpuRtxNelpCt, BigDecimal anCmpuRtxRndCt, BigDecimal anCmpuRtxNelpCt, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.admOrgcd = admOrgcd;
        this.dhBrOrgcd = dhBrOrgcd;
        this.dhgncOrgcd = dhgncOrgcd;
        this.rgtdt = rgtdt;
        this.mlamtBeloGnLtrmRndCt = mlamtBeloGnLtrmRndCt;
        this.mlamtBeloGnLtrmNelpCt = mlamtBeloGnLtrmNelpCt;
        this.ml10aBeloGnLtrmRndCt = ml10aBeloGnLtrmRndCt;
        this.ml10aBeloGnLtrmNelpCt = ml10aBeloGnLtrmNelpCt;
        this.ml10aAbovGnLtrmRndCt = ml10aAbovGnLtrmRndCt;
        this.ml10aAbovGnLtrmNelpCt = ml10aAbovGnLtrmNelpCt;
        this.crFcIdcRndCt = crFcIdcRndCt;
        this.crFcIdcNelpCt = crFcIdcNelpCt;
        this.crSpcfRndCt = crSpcfRndCt;
        this.crSpcfNelpCt = crSpcfNelpCt;
        this.crInrRndCt = crInrRndCt;
        this.crInrNelpCt = crInrNelpCt;
        this.bllNtRndCt = bllNtRndCt;
        this.bllNtNelpCt = bllNtNelpCt;
        this.gnApldoRndCt = gnApldoRndCt;
        this.gnApldoNelpCt = gnApldoNelpCt;
        this.ltrmRviNdsApldoRndCt = ltrmRviNdsApldoRndCt;
        this.ltrmRviNdsApldoNelpCt = ltrmRviNdsApldoNelpCt;
        this.crSpcfApldoRndCt = crSpcfApldoRndCt;
        this.crSpcfApldoNelpCt = crSpcfApldoNelpCt;
        this.crInrApldoRndCt = crInrApldoRndCt;
        this.crInrApldoNelpCt = crInrApldoNelpCt;
        this.crPypNdsApldoRndCt = crPypNdsApldoRndCt;
        this.crPypNdsApldoNelpCt = crPypNdsApldoNelpCt;
        this.crHwmcApldoRndCt = crHwmcApldoRndCt;
        this.crHwmcApldoNelpCt = crHwmcApldoNelpCt;
        this.ltrmCmpuRtxRndCt = ltrmCmpuRtxRndCt;
        this.ltrmCmpuRtxNelpCt = ltrmCmpuRtxNelpCt;
        this.crCmpuRtxRndCt = crCmpuRtxRndCt;
        this.crCmpuRtxNelpCt = crCmpuRtxNelpCt;
        this.anCmpuRtxRndCt = anCmpuRtxRndCt;
        this.anCmpuRtxNelpCt = anCmpuRtxNelpCt;
        this.inpUsrId = inpUsrId;
        this.inpDthms = inpDthms;
        this.mdfUsrId = mdfUsrId;
        this.mdfDthms = mdfDthms;
    }

    //----------------------------------------------------
    // Load/Persist/Update/Remove(조회/신규/수정/삭제)
    // Entity Pre/Post(이전/이후) 처리에 대한 정의(PreLoad는 없음)
    // * DB의 Trigger와 비슷한 JPA기능
    //----------------------------------------------------
    @PostLoad
    public void onPostLoad() {

    }

    @PrePersist
    public void onPrePersist() {

    }

    @PostPersist
    public void onPostPersist() {

    }

    @PreUpdate
    public void onPreUpdate() {

    }

    @PostUpdate
    public void onPostUpdate() {

    }

    @PreRemove
    public void onPreRemove() {

    }

    @PostRemove
    public void onPostRemove() {

    }

}

