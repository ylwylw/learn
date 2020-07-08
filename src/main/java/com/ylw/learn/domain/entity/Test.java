package com.ylw.learn.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangluwei
 * @since 2020-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一主键‘
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
