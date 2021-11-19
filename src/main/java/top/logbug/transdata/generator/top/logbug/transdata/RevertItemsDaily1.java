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
 * @TableName revert_items_daily_1
 */
@TableName(value ="revert_items_daily_1")
@Data
public class RevertItemsDaily1 implements Serializable {
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
     * 上游单号
     */
    private String upperId;

    /**
     * 需求单号
     */
    private String demandId;

    /**
     * 仓库编号 主店 外仓
     */
    private String warehouseNo;

    /**
     * 退货类型: 0:好品回仓 1:好品回仓退厂 2:回仓退厂 3:店间调货 4: 退厂(68RS) 5:服饰后整
     */
    private Short revertType;

    /**
     * 课别
     */
    private Short sectionNo;

    /**
     * 课别名称
     */
    private String sectionName;

    /**
     * 货号
     */
    private String rtNo;

    /**
     * 品名
     */
    private String rtName;

    /**
     * 高库存 正常品
     */
    private String businessType;

    /**
     * 买价
     */
    private Double buyPrice;

    /**
     * 需求单状态0:初始状态 2:作业中 1:开板完成或退货完成 9:取消
     */
    private Byte status;

    /**
     * 是否为RS68品项
     */
    private Byte isRs;

    /**
     * 是否为DC商品
     */
    private Byte isDc;

    /**
     * dc id
     */
    private Integer dc;

    /**
     * 仓库名称
     */
    private String dcName;

    /**
     * om
     */
    private Integer om;

    /**
     * 厂商
     */
    private Integer supplierNo;

    /**
     * 厂商名称
     */
    private String supplierName;

    /**
     * 调入店
     */
    private Short tranStore;

    /**
     * 商品类别 0标品 1称重
     */
    private Boolean type;

    /**
     * 规格，包装单位
     */
    private String pack;

    /**
     * 规格
     */
    private String spec;

    /**
     * 款
     */
    private Integer modelId;

    /**
     * 色
     */
    private Integer colorId;

    /**
     * 码
     */
    private Integer sizeId;

    /**
     * 期望回仓日期
     */
    private Date expectDate;

    /**
     * 开始时间
     */
    private Date beginDate;

    /**
     * 结束日期
     */
    private Date endDate;

    /**
     * 允退量
     */
    private Double limitQty;

    /**
     * 实际退数量
     */
    private Double realQty;

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

    /**
     * 
     */
    private String gtbsBizTypeCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}