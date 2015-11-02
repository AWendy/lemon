package com.mossle.dict.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DictType 数据字典类型.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DICT_TYPE")
public class DictType implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 唯一主键. */
    private Long id;

    /** 名称. */
    private String name;

    /** 类型. */
    private String type;

    /** 描述. */
    private String descn;

    /** null. */
    private String tenantId;

    /** . */
    private Set<DictSchema> dictSchemas = new HashSet<DictSchema>(0);

    /** . */
    private Set<DictInfo> dictInfos = new HashSet<DictInfo>(0);

    public DictType() {
    }

    public DictType(String name, String type, String descn, String tenantId,
            Set<DictSchema> dictSchemas, Set<DictInfo> dictInfos) {
        this.name = name;
        this.type = type;
        this.descn = descn;
        this.tenantId = tenantId;
        this.dictSchemas = dictSchemas;
        this.dictInfos = dictInfos;
    }

    /** @return 唯一主键. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            唯一主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 类型. */
    @Column(name = "TYPE", length = 200)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            类型.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 描述. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return this.descn;
    }

    /**
     * @param descn
     *            描述.
     */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dictType")
    public Set<DictSchema> getDictSchemas() {
        return this.dictSchemas;
    }

    /**
     * @param dictSchemas
     *            .
     */
    public void setDictSchemas(Set<DictSchema> dictSchemas) {
        this.dictSchemas = dictSchemas;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dictType")
    public Set<DictInfo> getDictInfos() {
        return this.dictInfos;
    }

    /**
     * @param dictInfos
     *            .
     */
    public void setDictInfos(Set<DictInfo> dictInfos) {
        this.dictInfos = dictInfos;
    }
}
