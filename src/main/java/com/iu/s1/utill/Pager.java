package com.iu.s1.utill;

public class Pager {
	
	//Table 에서 조회할 시작번호 
	private Long startRow;
	//Table 에서 조회할 끝번호 
	private Long lastRow;
	//한페이지에 출력할 row 갯수
	private Long perPage;
	private Long startNum;
	private Long lastNum;
	
	
	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void makeNum(Long totalCount) { 
		//1.전체 row의 갯수 구하기 
		//2.총 page의 갯수 구하기 
		Long totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage = totalPage+1;
		}
		//3.한 블럭에 출력할 번호의 갯수 
		Long perBlock = 5L;
		//4.총 블럭의 수 구하기 
		Long totalBlock = totalCount/perBlock;
		if(totalPage % perBlock != 0) {
			totalBlock = totalBlock+1;
		}
		
		//5.page 번호로 현재 블럭 번호 구하기 
		// page 1-5 curBlock 1
		// page 6-10 curBlock 2
		// page 11-15 curBlock 3
		Long curBlock = this.page/perBlock;
		if(this.getPage()%perBlock !=0) {
			curBlock++;
		}
		
		//6. curBlock 의 시작번호와 끝번호를 계산
		this.startNum=(curBlock-1)*perBlock+1; 
		
		this.lastNum= curBlock*perBlock;
	
	
	
	}	
	

	
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	private Long page;
	//Client 가 보고싶은 페이지 번호(파라미터)
	//전체 row 의 갯수를 담을 변수 
	private Long totalCount;
	//startRow, lastRow 계산 하는 메서드 
	public void makeRow() {
		this.startRow = (this.getPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	
	public Long getPerPage() {
		if(this.perPage==null || this.perPage==0) {
			this.perPage = 10L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page = 1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
	
}
