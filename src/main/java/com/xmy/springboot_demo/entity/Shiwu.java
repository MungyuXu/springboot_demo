package com.xmy.springboot_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xmy
 * @since 2021-02-09
 */
public class Shiwu extends Model<Shiwu> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id 不自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * value不可重复
     */
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Shiwu{" +
        "id=" + id +
        ", value=" + value +
        "}";
    }
}
