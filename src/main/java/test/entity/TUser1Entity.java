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
public class TUser1Entity extends CommonEntity implements Serializable {

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
	 *  user_pw
	 */
	@ApiModelProperty(value = "user_pw", name = "userPw")
    private String userPw;
    /**
	 *  user_name
	 */
	@ApiModelProperty(value = "user_name", name = "userName")
    private String userName;
    /**
	 *  user_kind
	 */
	@ApiModelProperty(value = "user_kind", name = "userKind")
    private Integer userKind;


}
