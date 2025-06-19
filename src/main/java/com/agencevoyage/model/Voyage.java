package com.agencevoyage.model;
import jakarta.persistence.*;

import java.lang.reflect.Type;

@Entity
@Table(name="voyages")
public class Voyage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idVoyage;
        private String libelle;
        private String description;

        @Enumerated(EnumType.STRING)
        private TypeVoyage typeVoyage;
        @Enumerated(EnumType.STRING)
        private Pension pension;
        private Long idHotel; // FK vers hotel

        public enum TypeVoyage {
            Circuit, Sejour, Croisiere, Aventure
        }

        public enum Pension {
            Complete, Demi_pension
        }

        ///Getters and Setters

        public Long getIdVoyage() {
                return idVoyage;
        }

        public void setIdVoyage(Long idVoyage) {
                this.idVoyage = idVoyage;
        }

        public String getLibelle() {
                return libelle;
        }

        public void setLibelle(String libelle) {
                this.libelle = libelle;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public TypeVoyage getTypeVoyage() {
                return typeVoyage;
        }

        public void setTypeVoyage(TypeVoyage typeVoyage) {
                this.typeVoyage = typeVoyage;
        }

        public Pension getPension() {
                return pension;
        }

        public void setPension(Pension pension) {
                this.pension = pension;
        }

        public Long getIdHotel() {
                return idHotel;
        }

        public void setIdHotel(Long idHotel) {
                this.idHotel = idHotel;
        }
}



