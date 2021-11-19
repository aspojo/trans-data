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
 * @TableName revert_pallet_info_1
 */
@TableName(value ="revert_pallet_info_1")
@Data
public class RevertPalletInfo1 implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 店号
     */
    private Short storeId;

    /**
     * 板号
     */
    private String palletId;

    /**
     * 装车作业批单号
     */
    private String carBatchId;

    /**
     * 装车单号
     */
    private String loadingId;

    /**
     * 栈板状态0待装车 1已装车
     */
    private Byte status;

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