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
 * @TableName revert_loading_info_1
 */
@TableName(value ="revert_loading_info_1")
@Data
public class RevertLoadingInfo1 implements Serializable {
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
     * 装车单状态0 1完成
     */
    private Byte status;

    /**
     * 收货地点
     */
    private Integer recptPlace;

    /**
     * 收货地名称
     */
    private String recptPlaceName;

    /**
     * 仓库编号 主店 外仓
     */
    private String warehouseNo;

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