package io.mosip.kernel.masterdata.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * Response dto for Biometric Type Detail
 * 
 * @author Neha
 * @since 1.0.0
 *
 */
@Data


public class BiometricTypeDto {

	@NotNull
	@Size(min = 1, max = 3)
	private String code;

	private String name;

	private String description;

	private String langCode;
	
	private Boolean isActive;

}
