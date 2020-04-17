package kr.yonsai.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {

	private int pageNum;
	private int amount;
	private int offsetNum;
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		setOffsetNum();
	}
	
	public void setOffsetNum() {
		offsetNum = (this.pageNum-1) * this.amount;
	}
	
}
