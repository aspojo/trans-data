package top.logbug.transdata.generator.top.logbug.transdata;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName revert_car_info_1
 */
@TableName(value ="revert_car_info_1")
@Data
public class RevertCarInfo1 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 店号
     */
    private Short storeNo;

    /**
     * 装车单号
     */
    private String loadingId;

    /**
     * 仓库编号 10主店 11外仓
     */
    private String warehouseNo;

    /**
     * 箱数
     */
    private Integer boxNum;

    /**
     * 板数
     */
    private Integer palletNum;

    /**
     * 司机姓名
     */
    private String driverName;

    /**
     * 司机身份证号
     */
    private String driverIdcard;

    /**
     * 车牌
     */
    private String carNum;

    /**
     * 发车时间
     */
    private Date startTime;

    /**
     * 
     */
    private String createId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String updateId;

    /**
     * 
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}