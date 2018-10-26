package legaltech.entities;

import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table
public class Agreement {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;


  @OneToMany(
       mappedBy = "agreement",
       cascade = CascadeType.ALL,
       orphanRemoval = true
 )
 private List<Section> sections  = new ArrayList<>();


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
	* Returns value of sections
	* @return
	*/
	public List<Section> getSections() {
		return sections;
	}

	/**
	* Sets new value of sections
	* @param
	*/
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
}
