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
public class TShoppingcarEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  user_id
	 */
	@ApiModelProperty(value = "user_id", name = "userId")
    private Integer userId;
    /**
	 *  good_id
	 */
	@ApiModelProperty(value = "good_id", name = "goodId")
    private Integer goodId;
    /**
	 *  detail_id
	 */
	@ApiModelProperty(value = "detail_id", name = "detailId")
    private Integer detailId;


}
