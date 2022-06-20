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
import javax.persistence.IdClass;
// import org.springframework.beans.BeanUtils;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Builder;

@Entity
@Table(name="aud_fn_clmam") //--금융사고관리
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudFnClmam>findByFnAcdYymmAndFnAcdSeqno(String fnAcdYymm, BigDecimal fnAcdSeqno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudFnClmamPK.class)
public class AudFnClmam {
    @Id //  String
    @Column(name = "fn_acd_yymm", nullable = false)
    private String fnAcdYymm; //--금융사건년월

    @Id //  BigDecimal
    @Column(name = "fn_acd_seqno", nullable = false)
    private BigDecimal fnAcdSeqno; //--금융사건순번

    @Column(name = "fn_acdnm", nullable = true)
    private String fnAcdnm; //--금융사건명

    @Column(name = "fn_acd_1_crzcd", nullable = true)
    private String fnAcd1Crzcd; //--금융사건1발생기관코드

    @Column(name = "fn_acd_2_crzcd", nullable = true)
    private String fnAcd2Crzcd; //--금융사건2발생기관코드

    @Column(name = "fn_acd_3_crzcd", nullable = true)
    private String fnAcd3Crzcd; //--금융사건3발생기관코드

    @Column(name = "fn_acd_4_crzcd", nullable = true)
    private String fnAcd4Crzcd; //--금융사건4발생기관코드

    @Column(name = "fn_acd_5_crzcd", nullable = true)
    private String fnAcd5Crzcd; //--금융사건5발생기관코드

    @Column(name = "acd_cr_strdt", nullable = true)
    private Date acdCrStrdt; //--사건발생시작일자

    @Column(name = "acd_cr_nddt", nullable = true)
    private Date acdCrNddt; //--사건발생종료일자

    @Column(name = "acd_cnfdt", nullable = true)
    private Date acdCnfdt; //--사건확인일자

    @Column(name = "rgt_stfno", nullable = true)
    private String rgtStfno; //--등록직원번호

    @Column(name = "rgtdt", nullable = true)
    private Date rgtdt; //--등록일자

    @Column(name = "fn_acd_amt", nullable = true)
    private BigDecimal fnAcdAmt; //--금융사건금액

    @Column(name = "fn_acd_ryamt", nullable = true)
    private BigDecimal fnAcdRyamt; //--금융사건회수금액

    @Column(name = "fn_acd_tp_flgcd", nullable = true)
    private String fnAcdTpFlgcd; //--금융사건유형구분코드

    @Column(name = "fn_rule_vlt_bhvr_flgcd", nullable = true)
    private String fnRuleVltBhvrFlgcd; //--금융규칙위반행위구분코드

    @Column(name = "fr_rptdt", nullable = true)
    private Date frRptdt; //--최초보고일자

    @Column(name = "o1_mid_rptdt", nullable = true)
    private Date o1MidRptdt; //--1차중간보고일자

    @Column(name = "o2_mid_rptdt", nullable = true)
    private Date o2MidRptdt; //--2차중간보고일자

    @Column(name = "o3_mid_rptdt", nullable = true)
    private Date o3MidRptdt; //--3차중간보고일자

    @Column(name = "fnl_rptdt", nullable = true)
    private Date fnlRptdt; //--최종보고일자

    @Column(name = "fn_acd_cn", nullable = true)
    private String fnAcdCn; //--금융사건내용

    @Column(name = "fn_acd_fr_rpt_cn", nullable = true)
    private String fnAcdFrRptCn; //--금융사건최초보고내용

    @Column(name = "o1_mid_rpt_cn", nullable = true)
    private String o1MidRptCn; //--1차중간보고내용

    @Column(name = "o2_mid_rpt_cn", nullable = true)
    private String o2MidRptCn; //--2차중간보고내용

    @Column(name = "o3_mid_rpt_cn", nullable = true)
    private String o3MidRptCn; //--3차중간보고내용

    @Column(name = "fn_acd_fnl_rpt_cn", nullable = true)
    private String fnAcdFnlRptCn; //--금융사건최종보고내용

    @Column(name = "acd_1_stfno", nullable = true)
    private String acd1Stfno; //--사건1직원번호

    @Column(name = "acd_1_stfnm", nullable = true)
    private String acd1Stfnm; //--사건1직원명

    @Column(name = "acd_1_ndtdt", nullable = true)
    private Date acd1Ndtdt; //--사건1고발일자

    @Column(name = "acd_1_ndtpl_nm", nullable = true)
    private String acd1NdtplNm; //--사건1고발처명

    @Column(name = "acd_1_paff_mng_yn", nullable = true)
    private String acd1PaffMngYn; //--사건1인사조치여부

    @Column(name = "acd_1_paff_mngdt", nullable = true)
    private Date acd1PaffMngdt; //--사건1인사조치일자

    @Column(name = "acd_2_stfno", nullable = true)
    private String acd2Stfno; //--사건2직원번호

    @Column(name = "acd_2_stfnm", nullable = true)
    private String acd2Stfnm; //--사건2직원명

    @Column(name = "acd_2_ndtdt", nullable = true)
    private Date acd2Ndtdt; //--사건2고발일자

    @Column(name = "acd_2_ndtpl_nm", nullable = true)
    private String acd2NdtplNm; //--사건2고발처명

    @Column(name = "acd_2_paff_mng_yn", nullable = true)
    private String acd2PaffMngYn; //--사건2인사조치여부

    @Column(name = "acd_2_paff_mngdt", nullable = true)
    private Date acd2PaffMngdt; //--사건2인사조치일자

    @Column(name = "acd_3_stfno", nullable = true)
    private String acd3Stfno; //--사건3직원번호

    @Column(name = "acd_3_stfnm", nullable = true)
    private String acd3Stfnm; //--사건3직원명

    @Column(name = "acd_3_ndtdt", nullable = true)
    private Date acd3Ndtdt; //--사건3고발일자

    @Column(name = "acd_3_ndtpl_nm", nullable = true)
    private String acd3NdtplNm; //--사건3고발처명

    @Column(name = "acd_3_paff_mng_yn", nullable = true)
    private String acd3PaffMngYn; //--사건3인사조치여부

    @Column(name = "acd_3_paff_mngdt", nullable = true)
    private Date acd3PaffMngdt; //--사건3인사조치일자

    @Column(name = "acd_4_stfno", nullable = true)
    private String acd4Stfno; //--사건4직원번호

    @Column(name = "acd_4_stfnm", nullable = true)
    private String acd4Stfnm; //--사건4직원명

    @Column(name = "acd_4_ndtdt", nullable = true)
    private Date acd4Ndtdt; //--사건4고발일자

    @Column(name = "acd_4_ndtpl_nm", nullable = true)
    private String acd4NdtplNm; //--사건4고발처명

    @Column(name = "acd_4_paff_mng_yn", nullable = true)
    private String acd4PaffMngYn; //--사건4인사조치여부

    @Column(name = "acd_4_paff_mngdt", nullable = true)
    private Date acd4PaffMngdt; //--사건4인사조치일자

    @Column(name = "acd_5_stfno", nullable = true)
    private String acd5Stfno; //--사건5직원번호

    @Column(name = "acd_5_stfnm", nullable = true)
    private String acd5Stfnm; //--사건5직원명

    @Column(name = "acd_5_ndtdt", nullable = true)
    private Date acd5Ndtdt; //--사건5고발일자

    @Column(name = "acd_5_ndtpl_nm", nullable = true)
    private String acd5NdtplNm; //--사건5고발처명

    @Column(name = "acd_5_paff_mng_yn", nullable = true)
    private String acd5PaffMngYn; //--사건5인사조치여부

    @Column(name = "acd_5_paff_mngdt", nullable = true)
    private Date acd5PaffMngdt; //--사건5인사조치일자

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudFnClmam(String fnAcdYymm, BigDecimal fnAcdSeqno, String fnAcdnm, String fnAcd1Crzcd, String fnAcd2Crzcd, String fnAcd3Crzcd, String fnAcd4Crzcd, String fnAcd5Crzcd, Date acdCrStrdt, Date acdCrNddt, Date acdCnfdt, String rgtStfno, Date rgtdt, BigDecimal fnAcdAmt, BigDecimal fnAcdRyamt, String fnAcdTpFlgcd, String fnRuleVltBhvrFlgcd, Date frRptdt, Date o1MidRptdt, Date o2MidRptdt, Date o3MidRptdt, Date fnlRptdt, String fnAcdCn, String fnAcdFrRptCn, String o1MidRptCn, String o2MidRptCn, String o3MidRptCn, String fnAcdFnlRptCn, String acd1Stfno, String acd1Stfnm, Date acd1Ndtdt, String acd1NdtplNm, String acd1PaffMngYn, Date acd1PaffMngdt, String acd2Stfno, String acd2Stfnm, Date acd2Ndtdt, String acd2NdtplNm, String acd2PaffMngYn, Date acd2PaffMngdt, String acd3Stfno, String acd3Stfnm, Date acd3Ndtdt, String acd3NdtplNm, String acd3PaffMngYn, Date acd3PaffMngdt, String acd4Stfno, String acd4Stfnm, Date acd4Ndtdt, String acd4NdtplNm, String acd4PaffMngYn, Date acd4PaffMngdt, String acd5Stfno, String acd5Stfnm, Date acd5Ndtdt, String acd5NdtplNm, String acd5PaffMngYn, Date acd5PaffMngdt, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.fnAcdYymm = fnAcdYymm;
        this.fnAcdSeqno = fnAcdSeqno;
        this.fnAcdnm = fnAcdnm;
        this.fnAcd1Crzcd = fnAcd1Crzcd;
        this.fnAcd2Crzcd = fnAcd2Crzcd;
        this.fnAcd3Crzcd = fnAcd3Crzcd;
        this.fnAcd4Crzcd = fnAcd4Crzcd;
        this.fnAcd5Crzcd = fnAcd5Crzcd;
        this.acdCrStrdt = acdCrStrdt;
        this.acdCrNddt = acdCrNddt;
        this.acdCnfdt = acdCnfdt;
        this.rgtStfno = rgtStfno;
        this.rgtdt = rgtdt;
        this.fnAcdAmt = fnAcdAmt;
        this.fnAcdRyamt = fnAcdRyamt;
        this.fnAcdTpFlgcd = fnAcdTpFlgcd;
        this.fnRuleVltBhvrFlgcd = fnRuleVltBhvrFlgcd;
        this.frRptdt = frRptdt;
        this.o1MidRptdt = o1MidRptdt;
        this.o2MidRptdt = o2MidRptdt;
        this.o3MidRptdt = o3MidRptdt;
        this.fnlRptdt = fnlRptdt;
        this.fnAcdCn = fnAcdCn;
        this.fnAcdFrRptCn = fnAcdFrRptCn;
        this.o1MidRptCn = o1MidRptCn;
        this.o2MidRptCn = o2MidRptCn;
        this.o3MidRptCn = o3MidRptCn;
        this.fnAcdFnlRptCn = fnAcdFnlRptCn;
        this.acd1Stfno = acd1Stfno;
        this.acd1Stfnm = acd1Stfnm;
        this.acd1Ndtdt = acd1Ndtdt;
        this.acd1NdtplNm = acd1NdtplNm;
        this.acd1PaffMngYn = acd1PaffMngYn;
        this.acd1PaffMngdt = acd1PaffMngdt;
        this.acd2Stfno = acd2Stfno;
        this.acd2Stfnm = acd2Stfnm;
        this.acd2Ndtdt = acd2Ndtdt;
        this.acd2NdtplNm = acd2NdtplNm;
        this.acd2PaffMngYn = acd2PaffMngYn;
        this.acd2PaffMngdt = acd2PaffMngdt;
        this.acd3Stfno = acd3Stfno;
        this.acd3Stfnm = acd3Stfnm;
        this.acd3Ndtdt = acd3Ndtdt;
        this.acd3NdtplNm = acd3NdtplNm;
        this.acd3PaffMngYn = acd3PaffMngYn;
        this.acd3PaffMngdt = acd3PaffMngdt;
        this.acd4Stfno = acd4Stfno;
        this.acd4Stfnm = acd4Stfnm;
        this.acd4Ndtdt = acd4Ndtdt;
        this.acd4NdtplNm = acd4NdtplNm;
        this.acd4PaffMngYn = acd4PaffMngYn;
        this.acd4PaffMngdt = acd4PaffMngdt;
        this.acd5Stfno = acd5Stfno;
        this.acd5Stfnm = acd5Stfnm;
        this.acd5Ndtdt = acd5Ndtdt;
        this.acd5NdtplNm = acd5NdtplNm;
        this.acd5PaffMngYn = acd5PaffMngYn;
        this.acd5PaffMngdt = acd5PaffMngdt;
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

