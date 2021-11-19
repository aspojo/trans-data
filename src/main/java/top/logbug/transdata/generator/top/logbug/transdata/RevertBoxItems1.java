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
 * @TableName revert_box_items_1
 */
@TableName(value ="revert_box_items_1")
@Data
public class RevertBoxItems1 implements Serializable {
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
     * 作业批单号
     */
    private String batchId;

    /**
     * 货号
     */
    private String rtNo;

    /**
     * 品名
     */
    private String rtName;

    /**
     * 退货类型: 0:好品回仓 1:好品回仓退厂 2:回仓退厂 3:店间调货 4: 退厂(68RS) 5:服饰后整
     */
    private String gtbsBizTypeCode;

    /**
     * 箱号
     */
    private String boxId;

    /**
     * 拣货数量
     */
    private Double pickQty;

    /**
     * 更正的数量
     */
    private Double corrQty;

    /**
     * 料位
     */
    private String shelfNo;

    /**
     * 
     */
    private Byte status;

    /**
     * 
     */
    private Byte type;

    /**
     * 
     */
    private String warehouseNo;

    /**
     * 
     */
    private String spec;

    /**
     * 
     */
    private Date finPickTime;

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