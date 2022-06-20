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
@Table(name="aud_rtx_retr_info") //--영수증소급정보
@Getter
@NoArgsConstructor // (access = AccessLevel.PROTECTED) // AccessLevel.PUBLIC
@EqualsAndHashCode // (of = {"email","name"}, callSuper = true, onParam = @__(@NonNull))
@ToString //(exclude = "password") // exclude 속성을 사용하면, 특정 필드를 toString() 결과에서 제외
/*--------------------------------------------
Page<AudRtxRetrInfo>findByRtxKndcdAndRtxSsYrAndRtxBkno(String rtxKndcd, String rtxSsYr, String rtxBkno, Pageable pageable); // FindPK
------------------------------------------*/
@IdClass(AudRtxRetrInfoPK.class)
public class AudRtxRetrInfo {
    @Id //  String
    @Column(name = "rtx_kndcd", nullable = false)
    private String rtxKndcd; //--영수증종류코드

    @Id //  String
    @Column(name = "rtx_ss_yr", nullable = false)
    private String rtxSsYr; //--영수증발행년도

    @Id //  String
    @Column(name = "rtx_bkno", nullable = false)
    private String rtxBkno; //--영수증책번호

    @Column(name = "mfgdt", nullable = true)
    private Date mfgdt; //--출고일자

    @Column(name = "strdt", nullable = true)
    private Date strdt; //--시작일자

    @Column(name = "nddt", nullable = true)
    private Date nddt; //--종료일자

    @Column(name = "tgnrt_orgcd", nullable = true)
    private String tgnrtOrgcd; //--총괄기관코드

    @Column(name = "adm_orgcd", nullable = true)
    private String admOrgcd; //--관리기관코드

    @Column(name = "dh_orgcd", nullable = true)
    private String dhOrgcd; //--취급기관코드

    @Column(name = "dh_stfno", nullable = true)
    private String dhStfno; //--취급직원번호

    @Column(name = "rtx_plyno", nullable = true)
    private String rtxPlyno; //--영수증증권번호

    @Column(name = "prm", nullable = true)
    private BigDecimal prm; //--보험료

    @Column(name = "dpamt", nullable = true)
    private BigDecimal dpamt; //--입금금액

    @Column(name = "dp_bknm", nullable = true)
    private String dpBknm; //--입금은행명

    @Column(name = "dpdt", nullable = true)
    private Date dpdt; //--입금일자

    @Column(name = "chr_stfno", nullable = true)
    private String chrStfno; //--담당직원번호

    @Column(name = "chrnm", nullable = true)
    private String chrnm; //--담당자명

    @Column(name = "tlano", nullable = true)
    private String tlano; //--전화지역번호

    @Column(name = "tltno", nullable = true)
    private String tltno; //--전화국번

    @Column(name = "tlsno", nullable = true)
    private String tlsno; //--전화일련번호

    @Column(name = "rtx_retr_rs", nullable = true)
    private String rtxRetrRs; //--영수증소급사유

    @Column(name = "o1_af_inp_flgcd", nullable = true)
    private String o1AfInpFlgcd; //--1차후입력구분코드

    @Column(name = "o1_prvdt", nullable = true)
    private Date o1Prvdt; //--1차결재일자

    @Column(name = "o1_prv_stfno", nullable = true)
    private String o1PrvStfno; //--1차결재직원번호

    @Column(name = "o1_re_af_inp_flgcd", nullable = true)
    private String o1ReAfInpFlgcd; //--1차재후입력구분코드

    @Column(name = "o1_re_prvdt", nullable = true)
    private Date o1RePrvdt; //--1차재결재일자

    @Column(name = "o1_re_prv_stfno", nullable = true)
    private String o1RePrvStfno; //--1차재결재직원번호

    @Column(name = "o2_afprv_flgcd", nullable = true)
    private String o2AfprvFlgcd; //--2차후결구분코드

    @Column(name = "o2_prvdt", nullable = true)
    private Date o2Prvdt; //--2차결재일자

    @Column(name = "o2_prv_stfno", nullable = true)
    private String o2PrvStfno; //--2차결재직원번호

    @Column(name = "o2_re_afprv_flgcd", nullable = true)
    private String o2ReAfprvFlgcd; //--2차재후결구분코드

    @Column(name = "o2_re_prvdt", nullable = true)
    private Date o2RePrvdt; //--2차재결재일자

    @Column(name = "o2_re_prv_stfno", nullable = true)
    private String o2RePrvStfno; //--2차재결재직원번호

    @Column(name = "o3_afprv_flgcd", nullable = true)
    private String o3AfprvFlgcd; //--3차후결구분코드

    @Column(name = "o3_prvdt", nullable = true)
    private Date o3Prvdt; //--3차결재일자

    @Column(name = "o3_prv_stfno", nullable = true)
    private String o3PrvStfno; //--3차결재직원번호

    @Column(name = "o3_re_afprv_flgcd", nullable = true)
    private String o3ReAfprvFlgcd; //--3차재후결구분코드

    @Column(name = "o3_re_prvdt", nullable = true)
    private Date o3RePrvdt; //--3차재결재일자

    @Column(name = "o3_re_prv_stfno", nullable = true)
    private String o3RePrvStfno; //--3차재결재직원번호

    @Column(name = "tgnrt_o1_af_inp_flgcd", nullable = true)
    private String tgnrtO1AfInpFlgcd; //--총괄1차후입력구분코드

    @Column(name = "tgnrt_o1_prvdt", nullable = true)
    private Date tgnrtO1Prvdt; //--총괄1차결재일자

    @Column(name = "tgnrt_o1_prv_stfno", nullable = true)
    private String tgnrtO1PrvStfno; //--총괄1차결재직원번호

    @Column(name = "tgnrt_o1_re_af_inp_flgcd", nullable = true)
    private String tgnrtO1ReAfInpFlgcd; //--총괄1차재후입력구분코드

    @Column(name = "tgnrt_o1_re_prvdt", nullable = true)
    private Date tgnrtO1RePrvdt; //--총괄1차재결재일자

    @Column(name = "tgnrt_o1_re_prv_stfno", nullable = true)
    private String tgnrtO1RePrvStfno; //--총괄1차재결재직원번호

    @Column(name = "tgnrt_o2_afprv_flgcd", nullable = true)
    private String tgnrtO2AfprvFlgcd; //--총괄2차후결구분코드

    @Column(name = "tgnrt_o2_prvdt", nullable = true)
    private Date tgnrtO2Prvdt; //--총괄2차결재일자

    @Column(name = "tgnrt_o2_prv_stfno", nullable = true)
    private String tgnrtO2PrvStfno; //--총괄2차결재직원번호

    @Column(name = "tgnrt_o2_re_afprv_flgcd", nullable = true)
    private String tgnrtO2ReAfprvFlgcd; //--총괄2차재후결구분코드

    @Column(name = "tgnrt_o2_re_prvdt", nullable = true)
    private Date tgnrtO2RePrvdt; //--총괄2차재결재일자

    @Column(name = "tgnrt_o2_re_prv_stfno", nullable = true)
    private String tgnrtO2RePrvStfno; //--총괄2차재결재직원번호

    @Column(name = "inp_usr_id", nullable = false)
    private String inpUsrId; //--입력사용자id

    @Column(name = "inp_dthms", nullable = false)
    private Date inpDthms; //--입력일시

    @Column(name = "mdf_usr_id", nullable = false)
    private String mdfUsrId; //--수정사용자id

    @Column(name = "mdf_dthms", nullable = false)
    private Date mdfDthms; //--수정일시


    @Builder
    public AudRtxRetrInfo(String rtxKndcd, String rtxSsYr, String rtxBkno, Date mfgdt, Date strdt, Date nddt, String tgnrtOrgcd, String admOrgcd, String dhOrgcd, String dhStfno, String rtxPlyno, BigDecimal prm, BigDecimal dpamt, String dpBknm, Date dpdt, String chrStfno, String chrnm, String tlano, String tltno, String tlsno, String rtxRetrRs, String o1AfInpFlgcd, Date o1Prvdt, String o1PrvStfno, String o1ReAfInpFlgcd, Date o1RePrvdt, String o1RePrvStfno, String o2AfprvFlgcd, Date o2Prvdt, String o2PrvStfno, String o2ReAfprvFlgcd, Date o2RePrvdt, String o2RePrvStfno, String o3AfprvFlgcd, Date o3Prvdt, String o3PrvStfno, String o3ReAfprvFlgcd, Date o3RePrvdt, String o3RePrvStfno, String tgnrtO1AfInpFlgcd, Date tgnrtO1Prvdt, String tgnrtO1PrvStfno, String tgnrtO1ReAfInpFlgcd, Date tgnrtO1RePrvdt, String tgnrtO1RePrvStfno, String tgnrtO2AfprvFlgcd, Date tgnrtO2Prvdt, String tgnrtO2PrvStfno, String tgnrtO2ReAfprvFlgcd, Date tgnrtO2RePrvdt, String tgnrtO2RePrvStfno, String inpUsrId, Date inpDthms, String mdfUsrId, Date mdfDthms) {
        this.rtxKndcd = rtxKndcd;
        this.rtxSsYr = rtxSsYr;
        this.rtxBkno = rtxBkno;
        this.mfgdt = mfgdt;
        this.strdt = strdt;
        this.nddt = nddt;
        this.tgnrtOrgcd = tgnrtOrgcd;
        this.admOrgcd = admOrgcd;
        this.dhOrgcd = dhOrgcd;
        this.dhStfno = dhStfno;
        this.rtxPlyno = rtxPlyno;
        this.prm = prm;
        this.dpamt = dpamt;
        this.dpBknm = dpBknm;
        this.dpdt = dpdt;
        this.chrStfno = chrStfno;
        this.chrnm = chrnm;
        this.tlano = tlano;
        this.tltno = tltno;
        this.tlsno = tlsno;
        this.rtxRetrRs = rtxRetrRs;
        this.o1AfInpFlgcd = o1AfInpFlgcd;
        this.o1Prvdt = o1Prvdt;
        this.o1PrvStfno = o1PrvStfno;
        this.o1ReAfInpFlgcd = o1ReAfInpFlgcd;
        this.o1RePrvdt = o1RePrvdt;
        this.o1RePrvStfno = o1RePrvStfno;
        this.o2AfprvFlgcd = o2AfprvFlgcd;
        this.o2Prvdt = o2Prvdt;
        this.o2PrvStfno = o2PrvStfno;
        this.o2ReAfprvFlgcd = o2ReAfprvFlgcd;
        this.o2RePrvdt = o2RePrvdt;
        this.o2RePrvStfno = o2RePrvStfno;
        this.o3AfprvFlgcd = o3AfprvFlgcd;
        this.o3Prvdt = o3Prvdt;
        this.o3PrvStfno = o3PrvStfno;
        this.o3ReAfprvFlgcd = o3ReAfprvFlgcd;
        this.o3RePrvdt = o3RePrvdt;
        this.o3RePrvStfno = o3RePrvStfno;
        this.tgnrtO1AfInpFlgcd = tgnrtO1AfInpFlgcd;
        this.tgnrtO1Prvdt = tgnrtO1Prvdt;
        this.tgnrtO1PrvStfno = tgnrtO1PrvStfno;
        this.tgnrtO1ReAfInpFlgcd = tgnrtO1ReAfInpFlgcd;
        this.tgnrtO1RePrvdt = tgnrtO1RePrvdt;
        this.tgnrtO1RePrvStfno = tgnrtO1RePrvStfno;
        this.tgnrtO2AfprvFlgcd = tgnrtO2AfprvFlgcd;
        this.tgnrtO2Prvdt = tgnrtO2Prvdt;
        this.tgnrtO2PrvStfno = tgnrtO2PrvStfno;
        this.tgnrtO2ReAfprvFlgcd = tgnrtO2ReAfprvFlgcd;
        this.tgnrtO2RePrvdt = tgnrtO2RePrvdt;
        this.tgnrtO2RePrvStfno = tgnrtO2RePrvStfno;
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

