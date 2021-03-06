package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TCategories generated by hbm2java
 */
@Entity
@Table(name = "t_categories", catalog = "tsn_test")
public class TCategories implements IBaseEntity
{

	private Integer			categoryId;
	private String			categoryDescr;
	private Set<TProjects>	TProjectses	= new HashSet<TProjects>(0);

	public TCategories()
	{
	}

	public TCategories(String categoryDescr, Set<TProjects> TProjectses)
	{
		this.categoryDescr = categoryDescr;
		this.TProjectses = TProjectses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId()
	{
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId)
	{
		this.categoryId = categoryId;
	}

	@Column(name = "CATEGORY_DESCR", length = 100)
	public String getCategoryDescr()
	{
		return this.categoryDescr;
	}

	public void setCategoryDescr(String categoryDescr)
	{
		this.categoryDescr = categoryDescr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TCategories")
	public Set<TProjects> getTProjectses()
	{
		return this.TProjectses;
	}

	public void setTProjectses(Set<TProjects> TProjectses)
	{
		this.TProjectses = TProjectses;
	}

}
