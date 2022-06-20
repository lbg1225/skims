import java.io.Serializable;
import lombok.Data; //-- include @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//-- aud_adt_lc //--감사착수 Primary Key
public class AudAdtLcPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "adt_yr")
    private String adtYr; //--감사년도

    @Column(name = "adt_flgcd")
    private String adtFlgcd; //--감사구분코드

    @Column(name = "adtno")
    private String adtno; //--감사번호

}

