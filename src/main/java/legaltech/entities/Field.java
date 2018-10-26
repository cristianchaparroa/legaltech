package legaltech.entities;

import javax.persistence.*;

@Entity
@Table
public class Field {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  protected String name;

  protected String type;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "section_id")
  protected Section section;

	/**
	* Returns value of id
	* @return
	*/
	public Long getId() {
		return id;
	}

	/**
	* Sets new value of id
	* @param
	*/
	public void setId(Long id) {
		this.id = id;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}

	/**
	* Returns value of type
	* @return
	*/
	public String getType() {
		return type;
	}

	/**
	* Sets new value of type
	* @param
	*/
	public void setType(String type) {
		this.type = type;
	}

	/**
	* Returns value of section
	* @return
	*/
	public Section getSection() {
		return section;
	}

	/**
	* Sets new value of section
	* @param
	*/
	public void setSection(Section section) {
		this.section = section;
	}
}
