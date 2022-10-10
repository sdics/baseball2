package site.metacoding.red.web.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Getter
@Setter
public class StadiumInsertReqDto {
	private String name;

	public Stadium toEntity() {
		Stadium stadium = new Stadium();
		stadium.setName(this.name);
		return stadium;
	}
}
