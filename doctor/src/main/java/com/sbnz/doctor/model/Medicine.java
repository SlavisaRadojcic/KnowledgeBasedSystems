package com.sbnz.doctor.model;
// Generated Aug 26, 2019 4:00:55 PM by Hibernate Tools 5.0.6.Final

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
 * Medicine generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "medicine", catalog = "sbnz")
public class Medicine implements java.io.Serializable {

	private Long medicineId;
	private String medicineName;
	private char medicineType;
	private Set<Therapy> therapies = new HashSet<Therapy>(0);
	private Set<Ingredientmedicine> ingredientmedicines = new HashSet<Ingredientmedicine>(0);
	private Set<Medicineallergy> medicineallergies = new HashSet<Medicineallergy>(0);

	public Medicine() {
	}

	public Medicine(String medicineName, char medicineType) {
		this.medicineName = medicineName;
		this.medicineType = medicineType;
	}

	public Medicine(String medicineName, char medicineType, Set<Therapy> therapies,
			Set<Ingredientmedicine> ingredientmedicines, Set<Medicineallergy> medicineallergies) {
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.therapies = therapies;
		this.ingredientmedicines = ingredientmedicines;
		this.medicineallergies = medicineallergies;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MEDICINE_ID", unique = true, nullable = false)
	public Long getMedicineId() {
		return this.medicineId;
	}

	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}

	@Column(name = "MEDICINE_NAME", nullable = false, length = 150)
	public String getMedicineName() {
		return this.medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	@Column(name = "MEDICINE_TYPE", nullable = false, length = 1)
	public char getMedicineType() {
		return this.medicineType;
	}

	public void setMedicineType(char medicineType) {
		this.medicineType = medicineType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medicine")
	public Set<Therapy> getTherapies() {
		return this.therapies;
	}

	public void setTherapies(Set<Therapy> therapies) {
		this.therapies = therapies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medicine")
	public Set<Ingredientmedicine> getIngredientmedicines() {
		return this.ingredientmedicines;
	}

	public void setIngredientmedicines(Set<Ingredientmedicine> ingredientmedicines) {
		this.ingredientmedicines = ingredientmedicines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medicine")
	public Set<Medicineallergy> getMedicineallergies() {
		return this.medicineallergies;
	}

	public void setMedicineallergies(Set<Medicineallergy> medicineallergies) {
		this.medicineallergies = medicineallergies;
	}

}
