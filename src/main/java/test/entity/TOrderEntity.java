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
public class TOrderEntity extends CommonEntity implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
	 *  order_id
	 */
	@ApiModelProperty(value = "order_id", name = "orderId")
    private Integer orderId;
    /**
	 *  user_id
	 */
	@ApiModelProperty(value = "user_id", name = "userId")
    private Integer userId;
    /**
	 *  order_status
	 */
	@ApiModelProperty(value = "order_status", name = "orderStatus")
    private String orderStatus;
    /**
	 *  good_num
	 */
	@ApiModelProperty(value = "good_num", name = "goodNum")
    private String goodNum;
    /**
	 *  good_id
	 */
	@ApiModelProperty(value = "good_id", name = "goodId")
    private String goodId;
    /**
	 *  detail_id
	 */
	@ApiModelProperty(value = "detail_id", name = "detailId")
    private String detailId;
    /**
	 *  addr
	 */
	@ApiModelProperty(value = "addr", name = "addr")
    private String addr;
    /**
	 *  add_name
	 */
	@ApiModelProperty(value = "add_name", name = "addName")
    private String addName;
    /**
	 *  add_tel
	 */
	@ApiModelProperty(value = "add_tel", name = "addTel")
    private String addTel;
    /**
	 *  time_submit
	 */
	@ApiModelProperty(value = "time_submit", name = "timeSubmit")
    private Long timeSubmit;
    /**
	 *  time_pay
	 */
	@ApiModelProperty(value = "time_pay", name = "timePay")
    private Long timePay;
    /**
	 *  time_cancel
	 */
	@ApiModelProperty(value = "time_cancel", name = "timeCancel")
    private Long timeCancel;
    /**
	 *  time_ship
	 */
	@ApiModelProperty(value = "time_ship", name = "timeShip")
    private Long timeShip;
    /**
	 *  time_return
	 */
	@ApiModelProperty(value = "time_return", name = "timeReturn")
    private Long timeReturn;
    /**
	 *  time_finish
	 */
	@ApiModelProperty(value = "time_finish", name = "timeFinish")
    private Long timeFinish;


}
