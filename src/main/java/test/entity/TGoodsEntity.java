package test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TGoodsEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  good_id
	 */
	@ApiModelProperty(value = "good_id", name = "goodId")
    private Integer goodId;
    /**
	 *  good_kind
	 */
	@ApiModelProperty(value = "good_kind", name = "goodKind")
    private Integer goodKind;
    /**
	 *  good_name
	 */
	@ApiModelProperty(value = "good_name", name = "goodName")
    private String goodName;
    /**
	 *  good_dis
	 */
	@ApiModelProperty(value = "good_dis", name = "goodDis")
    private Integer goodDis;
    /**
	 *  good_mid
	 */
	@ApiModelProperty(value = "good_mid", name = "goodMid")
    private Integer goodMid;
    /**
	 *  good_price
	 */
	@ApiModelProperty(value = "good_price", name = "goodPrice")
    private Float goodPrice;
    /**
	 *  good_over
	 */
	@ApiModelProperty(value = "good_over", name = "goodOver")
    private Integer goodOver;
    /**
	 *  good_pre
	 */
	@ApiModelProperty(value = "good_pre", name = "goodPre")
    private Float goodPre;
    /**
	 *  istoday
	 */
	@ApiModelProperty(value = "istoday", name = "istoday")
    private Integer istoday;


}
