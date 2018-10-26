package legaltech.entities;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table
public class Section {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "agreement_id")
  protected Agreement agreement;

  @OneToMany(
         mappedBy = "section",
         cascade = CascadeType.ALL,
         orphanRemoval = true
   )
   private List<Field> fields  = new ArrayList<>();


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
	* Returns value of agreement
	* @return
	*/
	public Agreement getAgreement() {
		return agreement;
	}

	/**
	* Sets new value of agreement
	* @param
	*/
	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	/**
	* Returns value of fields
	* @return
	*/
	public List<Field> getFields() {
		return fields;
	}

	/**
	* Sets new value of fields
	* @param
	*/
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}
