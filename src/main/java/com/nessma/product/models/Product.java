package com.nessma.product.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author malek Bousselmi 28/12/2020
 *
 */
@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    @NotNull
    private String productName;

    @NotNull
    private BigDecimal productPrice;

    @NotNull
    @Min(0)
    private Integer productStock;

    private String productDescription;

    private String productIcon;

    @ColumnDefault("0")
    private Integer productStatus;


    @ColumnDefault("0")
    private Integer categoryType;

    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date updateDate;

}
